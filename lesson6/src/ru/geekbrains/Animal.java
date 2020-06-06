package ru.geekbrains;

public class Animal {
    protected float maxRunDistance;
    protected float maxJumpHeight;
    protected float maxSailDistance;

    public float getMaxJumpHeight() {
        return maxJumpHeight;
    }
    public void setMaxJumpHeight(float jumpHeight) {
        this.maxJumpHeight = jumpHeight;
    }
    public float getMaxRunDistance() {
        return maxRunDistance;
    }
    public void setMaxRunDistance(float runDistance) {
        this.maxRunDistance = runDistance;
    }
    public float getMaxSailDistance() {
        return maxSailDistance;
    }
    public void setMaxSailDistance(float sailDistance) {
        this.maxSailDistance = sailDistance;
    }
    public Animal () {
    }
    public Animal(float sailDistance, float runDistance, float jumpHeight) {
        this.maxJumpHeight = jumpHeight;
        this.maxRunDistance = runDistance;
        this.maxSailDistance = sailDistance;
    }

    public void run (float runDistance) {
        if (runDistance <= maxRunDistance) {
            System.out.println("Пробежал - " + runDistance  + " метров");
        } else {
            System.out.println("Не могу столько бежать!!!");
        }
    }
    public void sail (float sailDistance) {
        if (sailDistance <= maxSailDistance) {
            System.out.println("Проплыл - " + sailDistance  + " метров");
        } else {
            System.out.println("Не могу столько плыть!!!");
        }
    }
    public void jump (float jumpHeight) {
        if (jumpHeight <= maxJumpHeight) {
            System.out.println("Прыгнул на - " + jumpHeight + " метров");
        } else {
            System.out.println("Не могу так высоко прыгать!!!");
        }
    }

}
