package ru.geekbrains;
import java.util.Random;

public class Cat extends Animal {
    public Cat (float runDistance, float jumpHeight) {
        super(0, runDistance, jumpHeight);
    }
    public Cat () {
        Random random = new Random();
        this.maxJumpHeight = random.nextInt(10) + random.nextFloat();
        this.maxRunDistance = random.nextInt(200) + random.nextFloat();
        this.maxSailDistance = 0;
    }
    @Override
    public void sail(float sailDistance)
    {
        System.out.println("Не умею плавать!!!");
    }
}

