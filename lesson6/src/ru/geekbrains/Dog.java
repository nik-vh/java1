package ru.geekbrains;

import java.util.Random;

public class Dog extends Animal {
    public Dog (float sailDistance, float runDistance, float jumpHeight) {
        super(sailDistance, runDistance, jumpHeight);
    }
    public Dog () {
        Random random = new Random();
        this.maxJumpHeight = random.nextInt(10) + random.nextFloat();
        this.maxRunDistance = random.nextInt(200) + random.nextFloat();
        this.maxSailDistance = random.nextInt(50) + random.nextFloat();
    }
}
