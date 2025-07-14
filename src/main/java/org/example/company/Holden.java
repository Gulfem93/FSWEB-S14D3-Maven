package org.example.company;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + ": Holden engine started!";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + ": Holden on the move!";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + ": Holden braking!";
    }
}
