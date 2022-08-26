package ru.netology.domain.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void shouldAddFilm() {
        PosterManager poster = new PosterManager();

        poster.add("Film 1");
        poster.add("Film 2");
        poster.add("Film 3");

        String[] actual = poster.findAll();
        String[] expected = {"Film 1", "Film 2", "Film 3"};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLast() {
        PosterManager poster = new PosterManager(5);

        poster.add("Film 1");
        poster.add("Film 2");
        poster.add("Film 3");
        poster.add("Film 4");
        poster.add("Film 5");
        poster.add("Film 6");

        String[] actual = poster.findLast();
        String[] expected = {"Film 6", "Film 5", "Film 4", "Film 3", "Film 2"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfFilmsAmountUnderLimit() {
        PosterManager poster = new PosterManager(5);

        poster.add("Film 1");
        poster.add("Film 2");
        poster.add("Film 3");

        String[] actual = poster.findLast();
        String[] expected = {"Film 3", "Film 2", "Film 1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfDefaultLimit() {
        PosterManager poster = new PosterManager();

        poster.add("Film 1");
        poster.add("Film 2");
        poster.add("Film 3");
        poster.add("Film 4");
        poster.add("Film 5");
        poster.add("Film 6");
        poster.add("Film 7");
        poster.add("Film 8");
        poster.add("Film 9");
        poster.add("Film 10");
        poster.add("Film 11");
        poster.add("Film 12");

        String[] actual = poster.findLast();
        String[] expected = {"Film 12", "Film 11", "Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3"};

        Assertions.assertArrayEquals(expected, actual);
    }


}
