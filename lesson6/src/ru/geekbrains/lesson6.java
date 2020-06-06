package ru.geekbrains;

public class lesson6 {
    public static void main(String... args) {
        Cat cat = new Cat(200, 2);
        Dog dog = new Dog(10, 500, 0.5f);

        System.out.println("Кот:");

        cat.run(200);
        cat.run(250);
        cat.sail(100);
        cat.jump(1);
        cat.jump(3);

        System.out.println("Собака:");

        dog.run(450);
        dog.run(550);
        dog.sail(9);
        dog.sail(100);
        dog.jump(0.9f);
        dog.jump(0.1f);

        Cat newCat = new Cat();
        Dog newDog = new Dog();

        System.out.println("Новый кот:");

        System.out.println("Не умею плавать, максимальный бег: " + newCat.maxRunDistance + " максимальный прыжок: " + newCat.maxJumpHeight);

        newCat.run(200);
        newCat.run(250);
        newCat.sail(100);
        newCat.jump(1);
        newCat.jump(3);

        System.out.println("Новая собака:");
        System.out.println("Может проплыть: " + newDog.maxSailDistance +", максимальный бег: " + newDog.maxRunDistance + " максимальный прыжек: " + newDog.maxJumpHeight);


        newDog.run(450);
        newDog.run(550);
        newDog.sail(9);
        newDog.sail(100);
        newDog.jump(0.9f);
        newDog.jump(0.1f);
    }
}
