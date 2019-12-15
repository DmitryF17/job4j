package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        hare.tryeat(ball);
        ball.ranaway();
        wolf.tryeat(ball);
        ball.ranaway();
        fox.eat(ball);
    }
}
