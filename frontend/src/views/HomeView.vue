<script setup>
  import MovieCard from '../components/MovieCard.vue';
  import InputForm from '../components/InputForm.vue';
</script>


<template>
  <body>
    
    <header>
      <img alt="Vue logo" class="logo" src="@/assets/image/logo.svg"/>
    </header>
    
    <main>
      <InputForm/>
      <MovieCard/> 
    </main>
  </body>
</template>


<style scoped>

.logo{
  width: 100%;
  height: 30vh;
}

</style>
