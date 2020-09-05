package headfirst.designpatterns.adpater.ducks.challenge;

import headfirst.designpatterns.adpater.ducks.Duck;

public class DroneAdapter implements Duck {

  Drone drone;

  public DroneAdapter(Drone drone) {
    this.drone = drone;
  }

  @Override
  public void quack() {
    drone.beep();
  }

  @Override
  public void fly() {
    drone.spin_rotors();
    drone.take_off();
  }
}
