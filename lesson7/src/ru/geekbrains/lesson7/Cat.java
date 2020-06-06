package ru.geekbrains.lesson7;
import java.util.Random;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name) {
        Random random = new Random();
        this.name = name;
        this.appetite = random.nextInt(10);
        if (this.appetite < 5) //Чтобы аппетит кота не был меньше 5
            this.appetite +=5;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }
    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() { return satiety; }
    public void setSatiety(boolean satiety) { this.satiety = satiety; }

    public void infoCatAppetite() { System.out.println("Аппетит кота " + getAppetite() ); }

    public void eat (Plate p) {
        if (!satiety && p.enoughFood(appetite)) {
            p.reduceFood(appetite);
            satiety = true;
            System.out.println("Кот " + name + " насытился!");
        } else if (satiety) {
            System.out.println("Кот " + name + " уже сыт!");
        } else {
            System.out.println("Коту " + name + " не хватило еды в тарелке!");
        }
    }
}
