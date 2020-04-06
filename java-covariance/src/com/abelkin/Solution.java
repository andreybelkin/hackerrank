package com.abelkin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Flower {
    private String name = "I have many names and types.";
    Flower(String name) {
        this.name = name;
    }
    String whatsYourName() {
        return name;
    }
}

class Jasmine extends Flower {
    Jasmine() {
        super("Jasmine");
    }
}

class Lily extends Flower {
    Lily() {
        super("Lily");
    }
}

class Region {
    private Flower flower;
    Region(Flower flower) {
        this.flower = flower;
    }
    Flower yourNationalFlower() {
        return flower;
    }
}

class WestBengal extends Region {
    WestBengal() {
        super(new Jasmine());
    }
}

class AndhraPradesh extends Region {
    AndhraPradesh() {
        super(new Lily());
    }
}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        Region region = null;
        switch (s) {
            case "WestBengal":
                region = new WestBengal();
                break;
            case "AndhraPradesh":
                region = new AndhraPradesh();
                break;
        }
        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }
}
