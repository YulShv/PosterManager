package ru.netology.domain.poster;

public class PosterManager {
    private PosterRepository repo;
    
    private int limit;

    public PosterManager(PosterRepository repo, int limit) {
        this.repo = repo;
        this.limit = limit;
    }

    public void add(FilmPoster film) {
        repo.save(film);

    }

    public FilmPoster[] findAll() {
        return repo.findAll();
    }

    public FilmPoster[] findLast() {
        int resultLength;
        FilmPoster[] films = findAll();
        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        FilmPoster[] result = new FilmPoster[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }

}
