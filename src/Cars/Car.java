package Cars;

import Cars.Details.Brakes.Brakes;
import Cars.Details.Electronics.Electronics;
import Cars.Details.Engines.Engine;
import Cars.Details.Horn.Horn;
import Cars.Details.Suspension.Suspension;


public class Car {
        private String name;
        private Brakes brakes;
        private Electronics electronics;
        private Engine engine;
        private Suspension suspension;
        private Horn horn;

        public Car(Brakes brakes, Electronics electronics, Engine engine, Suspension suspension, String name, Horn horn) {
                this.brakes = brakes;
                this.electronics = electronics;
                this.engine = engine;
                this.suspension = suspension;
                this.name = name;
                this.horn = horn;
        }

        @Override
        public String toString() {
                return name + "{\n" +
                        "Тормозна відстань: " + brakes.breakingDistance() + "m \n" +
                        "Електроніка: Заводський GPS" + (electronics.nativeGPS() ? "присутній" : "відсутній") +
                        ", Парктронік" + (electronics.parkingCamera() ? "присутній" : "відсутній") + "\n" +
                        "Максимальна швидкість: " + engine.maxSpeed() + "км/год\n" +
                        "Оцінка управління: " + suspension.controllability() +
                        '}';
        }

        public void beep(){
                System.out.println(name + " beeps " + horn.sound());
        }

        //повертає машину яка виграла перегони
        public Car race(Car otherCar){
                if(this.avarageGrade() > otherCar.avarageGrade()){
                        System.out.println(name + " перемагаэ гонку у " + otherCar.getName());
                        return this;
                }
                else if(this.avarageGrade() == otherCar.avarageGrade()){
                        System.out.println(name + " нічия з " + otherCar.getName());
                        return this;
                }
                else{
                        System.out.println(otherCar.getName() + " перемагаэ гонку у " + name);
                        return otherCar;
                }
        }

        public double avarageGrade(){
                return 10 * engine.maxSpeed() + 4 * suspension.controllability() + 20 / brakes.breakingDistance();
        }

        public Brakes getBrakes() {
                return brakes;
        }

        public void setBrakes(Brakes brakes) {
                this.brakes = brakes;
        }

        public Electronics getElectronics() {
                return electronics;
        }

        public void setElectronics(Electronics electronics) {
                this.electronics = electronics;
        }

        public Engine getEngine() {
                return engine;
        }

        public void setEngine(Engine engine) {
                this.engine = engine;
        }

        public Suspension getSuspension() {
                return suspension;
        }

        public void setSuspension(Suspension suspension) {
                this.suspension = suspension;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public void setHorn(Horn horn) {
                this.horn = horn;
        }
}
