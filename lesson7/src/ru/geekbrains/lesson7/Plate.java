package ru.geekbrains.lesson7;
import java.util.Random;

public class Plate {
    private int food;

    public Plate() {
        Random random = new Random();
        this.food = random.nextInt(100);
        if (this.food < 50) //Чтобы тарелка не была наполнена мене чем на 50
            this.food += 50;
    }

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void infoPlate() {
        System.out.println("В тарелке " + getFood() + " еды");
    }

    public boolean enoughFood(int appetite) { return appetite <= food; }

    public void addFood (int food) { this.food += food; }

    public void reduceFood (int appetite) { this.food -= appetite;}
}
