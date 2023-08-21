<script setup>
import { RouterLink, RouterView } from 'vue-router'
import HelloWorld from './components/HelloWorld.vue'
import MovieCard from './components/MovieCard.vue';
</script>

<template>

   <header>
    <img alt="Vue logo" class="logo" src="@/assets/logo.svg" width="125" height="125" />

  <header>
    <img class="logo" src="./assets/image/logo.jpg" alt="">


    <div class="wrapper">
      <HelloWorld msg="You did it!" />

      <nav>
        <RouterLink to="/">Home</RouterLink>
        <RouterLink to="/about">About</RouterLink>
      </nav>
    </div>
  </header> 

  <MovieCard />
</template>

<style scoped>
.logo{
  width: 100%;
  height: 30vh;
}
</style>
