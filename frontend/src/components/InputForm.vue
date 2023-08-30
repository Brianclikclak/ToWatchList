<script setup>
import FilmDataService from '../services/FilmDataService';
import {reactive } from 'vue';


const film = reactive({
    id: null,
    title: "",
    date: "",
    genre: "",
    whereToWatch: "",
})
function saveFilm() {
    let data = {
        title: film.title,
        date: film.date,
        genre: film.genre,
        whereToWatch: film.whereToWatch
    };
    
    FilmDataService.create(data)
        .then(response => {
            film.id = response.data.id;
            console.log(response.data);
        })
        .catch(e => {
            console.log(e);
        });
}

</script>

<template>
  <form >
  <div class="form-group">
    <label for="title">Title:</label>
    <input type="text" class="form-control" id="title" placeholder="Title" v-model="film.title">
  </div>
  <div class="form-group">
    <label for="date">Date</label>
    <input type="text" class="form-control" id="date" placeholder="Year" v-model="film.date">
  </div>
  <div class="form-group">
    <label for="genre">Genre</label>
    <input type="text" class="form-control" id="genre" placeholder="Genre" v-model="film.genre">
  </div>
  <div class="form-group">
    <label for="director">whereToWatch</label>
    <input type="text" class="form-control" id="whereToWatch" placeholder="whereToWatch" v-model="film.whereToWatch">
  </div>
  <div class="d-flex justify-content-center mt-2">
    <button type="submit" class="btn btn-warning" @click="saveFilm"> Add movie </button>
  </div>
</form>
</template>

<style scoped>

</style>