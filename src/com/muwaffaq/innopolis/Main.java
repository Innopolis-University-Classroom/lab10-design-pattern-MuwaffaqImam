package com.muwaffaq.innopolis;


import com.muwaffaq.innopolis.singeliton.*;

public class Main {


    public static void main(String[] args) {

        Animal cat = new Cat("cat");
        Animal eagle = new Eagle("Eagle");
        cat.addToZoo();
        eagle.addToZoo();
        eagle.addToZoo();
        eagle.addToZoo();
        eagle.addToZoo();
        Zoo zoo = Zoo.getInstance();
        zoo.displayAnimals();


    }


}
