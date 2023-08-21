<script setup>
import { RouterLink, RouterView } from 'vue-router'
import HomeView from './views/HomeView.vue';

</script>

<template>
   <header>
    <img alt="Vue logo" class="logo" src="@/assets/image/logo.svg"/>
   </header>
  <HomeView/>
</template>

<style scoped>
.logo{
  width: 100%;
  height: 30vh;
}
</style>
