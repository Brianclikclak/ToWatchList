<script setup>
  import MovieCard from '../components/MovieCard.vue';
  import InputForm from '../components/InputForm.vue';
</script>


<template>
  <header>
    <img alt="Vue logo" class="logo" src="@/assets/image/logo.svg"/>
  </header>
  
  <main>
    <InputForm/>
    <MovieCard/> 
  </main>
</template>


<style scoped>
.MoviesWatch{
  display: flex;
  justify-content: center;
  gap: 5em;
}
.logo{
  width: 100%;
  height: 30vh;
}
</style>
