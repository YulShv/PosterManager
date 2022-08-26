package ru.netology.domain.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterRepositoryTest {

    FilmPoster film1 = new FilmPoster(1, "Film 1");
    FilmPoster film2 = new FilmPoster(2, "Film 2");
    FilmPoster film3 = new FilmPoster(3, "Film 3");

    @Test
    public void shouldFindAll() {
        PosterRepository repo = new PosterRepository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);

        FilmPoster[] expected = {film1, film2, film3};
        FilmPoster[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindById() {
        PosterRepository repo = new PosterRepository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);

        FilmPoster expected = film3;
        FilmPoster actual = repo.findById(3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemoveById() {
        PosterRepository repo = new PosterRepository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.removeById(film2.getId());

        FilmPoster[] expected = {film1, film3};
        FilmPoster[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveAll() {
        PosterRepository repo = new PosterRepository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.removeAll();

        FilmPoster[] expected = {};
        FilmPoster[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
