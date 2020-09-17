package headfirst.designpatterns.decorator.starbuzz.pizza;

public class Cheese extends ToppingDecorator {


  public Cheese(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public String getDescription() {
    return pizza.getDescription() + ", Cheese";
  }

  @Override
  public double cost() {
    return pizza.cost();   // Cheese is free
  }
}
