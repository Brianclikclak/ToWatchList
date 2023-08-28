<script setup>
import MovieCard from '../components/MovieCard.vue';
import InputForm from '../components/InputForm.vue';
</script>

<template>
  
  <main>
    <header>
    <img alt="Vue logo" class="logo" src="@/assets/image/logo.svg"/>
   </header>
    
      
      
      <InputForm/>
      <div class="MoviesWatch">
        <RouterLink to="/">Unwatched Movies</RouterLink>
        <RouterLink to="/about">Watched Movies</RouterLink>
     </div>
      <MovieCard/>
    
  
  </main>
</template>
<style scoped>
.MoviesWatch{
  display: flex;
  justify-content: center;
  gap: 5em;
}
</style>
