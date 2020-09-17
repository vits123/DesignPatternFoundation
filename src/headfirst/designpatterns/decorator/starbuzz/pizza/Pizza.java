package headfirst.designpatterns.decorator.starbuzz.pizza;

public abstract class Pizza {

  String description = "Basic Pizza";

  public String getDescription() {
    return description;
  }

  public abstract double cost();

}
