package com.java;

// Inheritance exercise

public class TestAnimals {
    public static void main(String[] args) {
        Dog bulldog = new Dog();
        bulldog.setLocomoves("Not too fast");
        bulldog.setFeeds("Special ration");
        bulldog.setBark("Row");

        Cat garfield = new Cat();
        garfield.setLocomoves("Very slow");
        garfield.setFeeds("English ration");
        garfield.setMeow("Lazy meow");

        Animal snake = new Dog(); // is possible, but snake inherits ONLY Animal type characteristics
        snake.setFeeds("Insects in general");
        snake.setLocomoves("Very fast");
    }
}
