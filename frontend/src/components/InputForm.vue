<script setup>
import FilmDataService from '../services/FilmDataService';
import {reactive } from 'vue';


const film = reactive({
    id: null,
    title: "",
    date: "",
    genre: ""
})
function addNewFilm() {
    let data = {
        title: film.title,
        date: film.date,
        genre: film.genre,
        director: film.director
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

/* const newFilm = ref();

function createNewFilm() {
    FilmDataService.create(newFilm.value)
    .then(response =>{

        console.log(response.data);
        newFilm.value.title = response.data.tittle
        newFilm.value.date = response.data.date
        newFilm.value.genre = response.data
    })
} */
</script>

<template>
  <form>
  <div class="form-group">
    <label for="formGroupInput1"></label>
    <input type="text" class="form-control" id="title" placeholder="Title" v-model="film.title">
  </div>
  <div class="form-group">
    <label for="formGroupInput2"></label>
    <input type="text" class="form-control" id="date" placeholder="Year" v-model="film.date">
  </div>
  <div class="form-group">
    <label for="formGroupInput3"></label>
    <input type="text" class="form-control" id="genre" placeholder="Genre" v-model="film.genre">
  </div>
  <div class="form-group">
    <label for="formGroupInput4"></label>
    <input type="text" class="form-control" id="director" placeholder="Where to watch" v-model="film.director">
  </div>
  <button @click="addNewFilm"> Add movie </button>
</form>
</template>
<style scoped>

</style>