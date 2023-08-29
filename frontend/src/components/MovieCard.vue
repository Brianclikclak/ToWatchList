<script setup>
import { ref, onBeforeMount } from 'vue';
import FilmDataService from "../services/FilmDataService";
import { RouterLink, RouterView } from 'vue-router';

const films = ref([]);

function getFilms() {
    FilmDataService.getAll()
        .then(response => {
            films.value = response.data;
            console.log(response.data);
        })
        .catch(e => {
            console.log(e);
        });
}

function deleteMovie(id){
    FilmDataService.delete(id)
      .then(response => {
        console.log(response);
        getFilms();
      })
      .catch(error => {
        console.log(error);
      })
}

onBeforeMount(() => {
    getFilms();
})



</script>

<template>
    <div>
        <div v-for="film in films" :key="film.id" class="card text-center w-85 m-3">
            <div class="card-header">
                {{ film.title }}
            </div>
            <div class="card-body ">
                <p class="card-text" id="year">{{ film.date}}</p>
                <p class="card-text" id="genre">{{ film.genre }}</p>
                <p class="card-text" id="whereToWatch">{{ film.director }}</p>
            </div>
            <div class="card-footer text-muted d-flex justify-content-evenly">
                <router-link :to="{ name: 'EditCard', params: { id: film.id } }" class="btn btn-primary">Edit</router-link>
                <a href="#" class="btn btn-danger" @click="deleteMovie(film.id)">Delete</a>
            </div>
        </div>
    </div>

</template>

<style>

</style>
