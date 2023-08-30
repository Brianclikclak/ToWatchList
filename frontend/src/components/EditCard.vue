<script setup>
  import { ref, onMounted } from 'vue';
  import FilmDataService from "../services/FilmDataService";
  import {genres, whereToWatchOptions} from '../Options';
  
  
  const films = ref([]);

  const getFilms = async () => {
  try {
    const response = await FilmDataService.getAll();
    films.value = response.data;
    
  } catch (error) {
    console.log(error);
  }
};

const saveChanges = async (film) => {
  try {
    await FilmDataService.update(film.id, {
      title: film.title,
      date: film.date,
      genre: film.genre,
      whereToWatch: film.whereToWatch,
    });
    film.editing = false;
  } catch (error) {
    console.log('Error updating film:', error);
  }

};
const startEditing = (film) => {
  film.editing = true;
};
  
  onMounted(getFilms);
  
  
  </script>
<template>
    <div>
      <h2>Edit Film</h2>
        <div v-for="film in films" :key="film.id" class="card text-center w-85 m-3">
            <div class="card-header">{{ film.title }} </div>
                
            <div class="card-body">
                <p class="card-text" id="year">{{ film.date }}</p>
                <p class="card-text" id="genre">{{ film.genre }}</p>
                <p class="card-text" id="whereToWatch">{{ film.whereToWatch }}</p>
            </div>
            <div class="card-footer text-muted d-flex justify-content-evenly">
                <button v-if="!film.editing" class="btn btn-primary" @click="startEditing(film)">Edit</button>
                <button v-else class="btn btn-primary" @click="saveChanges(film)">Save</button>
                
            </div>
            <div v-if="film.editing" class="card-footer text-muted d-flex justify-content-evenly">
                <input type="text" v-model="film.title" class="form-control">
                <input type="text" v-model="film.date" class="form-control">                
                <select v-model="film.genre" class="form-control">
                  <option v-for="genre in genres" :value="genre" :key="genre">{{ genre }}</option>
                </select>
                <select v-model="film.whereToWatch" class="form-control">
                  <option v-for="option in whereToWatchOptions" :value="option" :key="option">{{ option }}</option>
                </select>
            </div>
          </div>
    </div>
</template>
  
  
  