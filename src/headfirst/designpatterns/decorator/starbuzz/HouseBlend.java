package headfirst.designpatterns.decorator.starbuzz;

public class HouseBlend extends Beverage {

  public HouseBlend() {
    description = "House Blend Cofee";
  }

  @Override
  public double cost() {
    return .89;
  }
}
