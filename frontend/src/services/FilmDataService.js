import http from "./http-common";

class FilmDataService {

    getAll() {
        return http.get(``);
    }

    get(id) {
        return http.get(`/films/${id}`);
    }
    
    create(data) {
        return http.post(``, data);
    }
    
    update(id, data) {
        return http.put(`/films/update/${id}`, data);
    }
    
    delete(id) {
        return http.delete(`${id}`);
    }
}

export default new FilmDataService();
