<script setup>
import { ref, onBeforeMount } from 'vue';
import { useRoute, useRouter } from 'vue-router'; 
import FilmDataService from "../services/FilmDataService";

const route = useRoute();
const router = useRouter(); 

const editedFilm = ref({
    id: null,
    title: "",
    date: "",
    genre: "",
    director: ""
});

onBeforeMount(() => {
    loadFilmData();
})

function loadFilmData() {
    const filmId = route.params.id;
    FilmDataService.get(filmId)
        .then(response => {
            editedFilm.id = response.data.id;
            editedFilm.title = response.data.title;
            editedFilm.date = response.data.date;
            editedFilm.genre = response.data.genre;
            editedFilm.director = response.data.director;
        })
        .catch(error => {
            console.log(error);
        });
}

function saveChanges() {
    FilmDataService.update(editedFilm.id, editedFilm)
        .then(response => {
            router.push({ name: 'Homeview' });
        })
        .catch(error => {
            console.log(error);
        });
}
</script>

<template>
    <div>
        <h2>Edit Film</h2>
        <form @submit.prevent>
            <div class="form-group">
                <label for="title">Title:</label>
                <input type="text" class="form-control" id="title" v-model="editedFilm.title">
            </div>
            <div class="form-group">
                <label for="genre">Genre:</label>
                <input type="text" class="form-control" id="genre" v-model="editedFilm.genre">
            </div>
            <div class="form-group">
                <label for="date">Date:</label>
                <input type="text" class="form-control" id="date" v-model="editedFilm.date">
            </div>
            <div class="form-group">
                <label for="director">Director:</label>
                <input type="text" class="form-control" id="director" v-model="editedFilm.director">
            </div>
            <button @click="saveChanges">Save</button>
        </form>
    </div>
</template>
