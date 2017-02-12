package com.serzh.testRetrofit;

/**
 * Created by Serzh on 1/14/17.
 */
public enum EnumDemo {
    OPEN("Open"),
    CLOSE("Close");

    public static void main(String[] args) {
        EnumDemo open = getInstance("Open");

        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
        System.out.println(open.getName());
        System.out.println(open );
//        getInstance("Open2");
    }

    private String name;

    EnumDemo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static EnumDemo getInstance(String name) {
        for (EnumDemo enumDemo : values()) {
            if (enumDemo.getName().equals(name)) {
                return enumDemo;
            }
        }
        throw new IllegalArgumentException("Not such enum");
    }
}
