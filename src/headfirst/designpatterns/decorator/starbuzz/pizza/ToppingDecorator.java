package headfirst.designpatterns.decorator.starbuzz.pizza;

public abstract class ToppingDecorator extends Pizza {

  Pizza pizza;
  public abstract String getDescription();

}
