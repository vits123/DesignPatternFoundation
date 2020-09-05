package headfirst.designpatterns.adpater.ducks;

import headfirst.designpatterns.adpater.ducks.challenge.Drone;
import headfirst.designpatterns.adpater.ducks.challenge.DroneAdapter;
import headfirst.designpatterns.adpater.ducks.challenge.SuperDrone;

public class DuckTestDrive {

  public static void main(String[] args) {
    MallardDuck duck = new MallardDuck();

    WildTurkey turkey = new WildTurkey();

    Duck turkeyAdapter = new TurkeyAdapter(turkey);

    System.out.println("The Turkey says...");
    turkey.gobble();
    turkey.fly();

    System.out.println("\nThe Duck says...");
    testDuck(duck);

    System.out.println("\nThe TurkeyAdapter says...");
    testDuck(turkeyAdapter);

    //challenge
    Drone drone = new SuperDrone();

    Duck droneAdapter = new DroneAdapter(drone);

    testDuck(droneAdapter);
  }

  static void testDuck(Duck duck) {
    duck.quack();
    duck.fly();
  }
}
