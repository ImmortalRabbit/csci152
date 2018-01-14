import java.lang.Math; // headers MUST be above the first class

// one class needs to have a main() method
public class AutoTest
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    int name = 0;
    Automobile car1 = new Automobile(name++); 
    Automobile car2 = new Automobile(name++); 
	
  
    car1.startCar();
    
    car2.startCar();
    

    car1.pressGasPedal(); 
    car2.pressGasPedal(); 

    System.out.println(car1); 
    System.out.println(car2); 

  }
}
