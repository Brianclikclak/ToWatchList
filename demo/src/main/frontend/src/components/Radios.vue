<template>
    <div id="radios">
<input type="radio" class="btn-check" name="options-outlined" id="success-outlined" autocomplete="off" checked>
<label class="btn btn-outline-success" for="success-outlined">Watched</label>

<input type="radio" class="btn-check" name="options-outlined" id="danger-outlined" autocomplete="off">
<label class="btn btn-outline-danger" for="danger-outlined">Unwatched</label>
    </div>
    <div id="addmovie">
<input type="checkbox" class="btn-check" id="btn-check" autocomplete="off">
<label class="btn btn-primary" for="btn-check">Add Movie</label>
</div>
</template>

<style>
#radios{
    margin-left: 30rem;
}

#addmovie{
    margin-left: 35rem;
}
.btn{
    margin: 20px;
    padding: 20px;
}


</style>