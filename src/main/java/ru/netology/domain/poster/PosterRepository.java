package ru.netology.domain.poster;

public class PosterRepository {

    private FilmPoster[] films = new FilmPoster[0];

    public void save(FilmPoster film) {
        FilmPoster[] tmp = new FilmPoster[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;

    }
    public FilmPoster[] findAll() {
        return films;
    }

     public FilmPoster findById(int id) {
        for (FilmPoster film : films) {
            if (film.getId() == id) {
                return film;
            }
        }
        return null;
    }

    public void removeById(int id) {
        FilmPoster[] tmp = new FilmPoster[films.length - 1];
        int copyToIndex = 0;
        for (FilmPoster film : films) {
            if (film.getId() != id) {
                tmp[copyToIndex] = film;
                copyToIndex++;
            }
        }
        films = tmp;
    }

    public void removeAll() {
        FilmPoster[] tmp = new FilmPoster[0];
        films = tmp;
    }
}
