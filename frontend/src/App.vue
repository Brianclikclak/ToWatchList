<script setup>
</script>

<template>
    <body>
        <RouterView/>
    </body> 
</template>

<style scoped>
    body {
        height: 100vh;
        background: linear-gradient(to top right, rgba(2,0,36,1) 0%, rgba(9,12,121,0.8) 46%, rgba(0,212,255) 100%); 
        /* 97deg, */
        background-attachment: fixed;
        background-size: cover;
        background-repeat: repeat;
    }

    @media only screen and (max-width: 1700px) {
        body {
            height: 100%;
        }
    }
</style>
