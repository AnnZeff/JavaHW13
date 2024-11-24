package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
    public void testAddMovie() {
        MovieManager manager = new MovieManager();

        String[] expected = { };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddMovieOneFilm() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");

        String[] expected = { "Бладшот" };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddMovieAFewFilms() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Джентльмены");
        manager.addMovie("Отель Будапешт");

        String[] expected = { "Бладшот", "Вперед", "Джентльмены", "Отель Будапешт" };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");

        String[] expected = { "Вперед", "Бладшот" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastZeroFilms() {
        MovieManager manager = new MovieManager();

        String[] expected = { };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLastOneFilm() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");

        String[] expected = { "Бладшот" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastFourFilms() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Джентльмены");
        manager.addMovie("Отель Будапешт");

        String[] expected = { "Отель Будапешт", "Джентльмены", "Вперед", "Бладшот" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastLimit() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Джентльмены");
        manager.addMovie("Отель Будапешт");
        manager.addMovie("Аквамен");


        String[] expected = { "Аквамен", "Отель Будапешт", "Джентльмены", "Вперед", "Бладшот" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastZeroFilmParam() {
        MovieManager manager = new MovieManager(10);


        String[] expected = {  };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastOneFilmParam() {
        MovieManager manager = new MovieManager(10);

        manager.addMovie("Бладшот");

        String[] expected = { "Бладшот" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastAFewFilmParam() {
        MovieManager manager = new MovieManager(10);

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Джентльмены");
        manager.addMovie("Отель Будапешт");
        manager.addMovie("Аквамен");
        manager.addMovie("Малышка на миллион");



        String[] expected = { "Малышка на миллион", "Аквамен", "Отель Будапешт", "Джентльмены", "Вперед", "Бладшот" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastNineFilmParam() {
        MovieManager manager = new MovieManager(10);

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Джентльмены");
        manager.addMovie("Отель Будапешт");
        manager.addMovie("Аквамен");
        manager.addMovie("Малышка на миллион");
        manager.addMovie("Красотка");
        manager.addMovie("Хоббит: Битва пяти армий");
        manager.addMovie("СтарТрек");


        String[] expected = { "СтарТрек", "Хоббит: Битва пяти армий", "Красотка", "Малышка на миллион", "Аквамен", "Отель Будапешт", "Джентльмены", "Вперед", "Бладшот" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastLimitFilmParam() {
        MovieManager manager = new MovieManager(10);

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Джентльмены");
        manager.addMovie("Отель Будапешт");
        manager.addMovie("Аквамен");
        manager.addMovie("Малышка на миллион");
        manager.addMovie("Красотка");
        manager.addMovie("Хоббит: Битва пяти армий");
        manager.addMovie("СтарТрек");
        manager.addMovie("Мир Юрского периода");


        String[] expected = { "Мир Юрского периода", "СтарТрек", "Хоббит: Битва пяти армий", "Красотка", "Малышка на миллион", "Аквамен", "Отель Будапешт", "Джентльмены", "Вперед", "Бладшот" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}