package ru.geekbrains.lesson7;

public class lesson7 {
    public static void main (String[] args) {

        //Cat cat = new Cat("Murka");
        //Plate plate = new Plate();
        //System.out.println("Кот " + cat.getName());
        //cat.infoCatAppetite();
        //plate.infoPlate();
        //cat.eat(plate);
        //plate.infoPlate();

        Cat[] catsArray = new Cat[16];
        for (int i = 0; i < catsArray.length; i++) { catsArray[i] = new Cat("Кот" + i); }
        Plate plate = new Plate();
        plate.infoPlate();
        for (int i = 0; i < catsArray.length; i++) { catsArray[i].infoCatAppetite(); }
        for (int i = 0; i < catsArray.length; i++) { catsArray[i].eat(plate); }
        plate.infoPlate();
        plate.addFood(30);
        plate.infoPlate();
        for (int i = 0; i < catsArray.length; i++) { catsArray[i].eat(plate); }

    }
}
