package matcher;

import model.Body;
import model.Car;
import model.CarElement;
import model.Engine;
import model.Wheel;

public final class CarActions {

    public static void print(CarElement element) {
        switch (element) {
            case Car c -> System.out.println("Matching my car");
            case Body b -> System.out.println("Matching my " + b.colour() + " body");
            case Engine e -> System.out.println("Matching my " + e.power() + " engine");
            case Wheel w -> System.out.println("Matching my " + w.position() + " wheel");
        }
    }

    public static void start(CarElement element) {
        switch (element) {
            case Car c -> System.out.println("Starting my car");
            case Body b -> System.out.println("Moving my " + b.colour() + " body");
            case Engine e -> System.out.println("Powering up my " + e.power() + " engine");
            case Wheel w -> System.out.println("Kicking my " + w.position() + " wheel");
        }
    }
}
