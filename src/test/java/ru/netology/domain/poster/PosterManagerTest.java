package ru.netology.domain.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class PosterManagerTest {

    PosterRepository repo = Mockito.mock(PosterRepository.class);
    PosterManager manager = new PosterManager(repo, 3);

    FilmPoster film1 = new FilmPoster(1, "Film 1");
    FilmPoster film2 = new FilmPoster(2, "Film 2");
    FilmPoster film3 = new FilmPoster(3, "Film 3");

    @Test
    public void shouldFindAll() {
        FilmPoster[] films = { film1, film2, film3 };
        doReturn(films).when(repo).findAll();

        FilmPoster[] expected = {film1, film2, film3};
        FilmPoster[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        FilmPoster[] films = { film1, film2, film3 };
        doReturn(films).when(repo).findAll();

        FilmPoster[] expected = {film3, film2, film1};
        FilmPoster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}