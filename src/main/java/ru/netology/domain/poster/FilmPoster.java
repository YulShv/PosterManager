package ru.netology.domain.poster;

public class FilmPoster {
    private int id;
    private String filmName;

    public FilmPoster(int id, String filmName) {
        this.id = id;
        this.filmName = filmName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

}
