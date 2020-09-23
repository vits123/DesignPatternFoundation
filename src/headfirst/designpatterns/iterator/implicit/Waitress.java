package headfirst.designpatterns.iterator.implicit;

import java.util.List;

public class Waitress {

  Menu pancakeHouseMenu;
  Menu dinerMenu;

  public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
  }

  // implicit iteration
  public void printMenu() {
    List<MenuItem> breakfastItems = ((PancakeHouseMenu) pancakeHouseMenu).getMenuItems();
    for (MenuItem m : breakfastItems) {
      printMenuItem(m);
    }
  }

  private void printMenuItem(MenuItem m) {
    System.out.print(m.getName() + ", ");
    System.out.print(m.getPrice() + ", ");
    System.out.print(m.getDescription() + ", ");
  }


}
