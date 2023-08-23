<script setup>
import { RouterLink, RouterView } from 'vue-router'
import HelloWorld from './components/HelloWorld.vue'
import Radios from './components/Radios.vue';
</script>

<template>
  <header>
    <img class="logo" src="./assets/image/logo.jpg" alt="">
    <Radios/> 
    <div class="wrapper">
      <HelloWorld msg="You did it!" />

      <nav>
        <RouterLink to="/">Home</RouterLink>
        <RouterLink to="/about">About</RouterLink>
      </nav>
    </div>
  </header>

  <RouterView />
</template>

<style scoped>
.logo{
  width: 100%;
  height: 30vh;
}
</style>
