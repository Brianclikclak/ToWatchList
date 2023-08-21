<script setup>
import { RouterLink, RouterView } from 'vue-router'
import HelloWorld from './components/HelloWorld.vue'
import MovieCard from './components/MovieCard.vue';
</script>

<template>

   <header>
    <img alt="Vue logo" class="logo" src="@/assets/image/logo.jpg" width="125" height="125" />

   </header>
    


    <div class="wrapper">
      <nav>
        <RouterLink to="/">Home</RouterLink>
        <RouterLink to="/about">About</RouterLink>
      </nav>
    </div>
  

  <MovieCard />
</template>

<style scoped>
.logo{
  width: 100%;
  height: 30vh;
}
</style>
