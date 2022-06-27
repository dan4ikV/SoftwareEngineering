package Cars;

import Cars.Details.Brakes.BMWBrakes;
import Cars.Details.Brakes.MercedesBrakes;
import Cars.Details.Brakes.ToyotaBrakes;
import Cars.Details.Electronics.MercedesElectronics;
import Cars.Details.Electronics.ToyotaElectronics;
import Cars.Details.Engines.BMWEngine;
import Cars.Details.Engines.MercedesEngine;
import Cars.Details.Engines.ToyotaEngine;
import Cars.Details.Horn.BeepHorn;
import Cars.Details.Horn.CustomHorn;
import Cars.Details.Horn.MusicHorn;
import Cars.Details.Suspension.MercedesSuspension;
import Cars.Details.Suspension.ToyotaSuspension;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(new BMWBrakes(), new ToyotaElectronics(), new ToyotaEngine(), new ToyotaSuspension(), "Stinger", new CustomHorn("Shebang!"));
        Car car2 = new Car(new MercedesBrakes(), new ToyotaElectronics(), new ToyotaEngine(), new ToyotaSuspension(), "Guru", new CustomHorn("Bazinga!"));
        Car car3 = new Car(new ToyotaBrakes(), new MercedesElectronics(), new BMWEngine(), new ToyotaSuspension(), "Kalina", new BeepHorn());
        Car car4 = new Car(new BMWBrakes(), new ToyotaElectronics(), new MercedesEngine(), new ToyotaSuspension(), "Conqueror", new MusicHorn());

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());

        car1.race(car2);
        car1.race(car3);
        car1.race(car4);

        car1.beep();
        car2.beep();
        car3.beep();
        car4.beep();

        //змінюємо деталі
        System.out.println("Переобладнання Stinger: ");
        System.out.println(car1.toString() + "\n");
        car1.setEngine(new MercedesEngine());
        car1.setElectronics(new MercedesElectronics());
        car1.setBrakes(new MercedesBrakes());
        car1.setSuspension(new MercedesSuspension());

        car1.race(car1);
        car1.race(car2);
        car1.race(car3);
        car1.race(car4);

        System.out.println("Тепер Stinger перемагає");
    }
}
