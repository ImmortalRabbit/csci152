import java.lang.Math; // headers MUST be above the first class

// one class needs to have a main() method
public class ClockTest
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
	Clock clock1 = new Clock(4,5,2);
    try{
	    clock1.setHours(61);
    } catch(Exception ex){
    	System.out.println(ex.getMessage());
    }
   	
    clock1.setMinutes(5);
    clock1.setSeconds(50);
    System.out.println(clock1.getHours());
    System.out.println(clock1.getMinutes());
    System.out.println(clock1.getSeconds());
    
    clock1.resetToMidnight();
    clock1.tick();
    System.out.println(clock1);
    
    
  }
}
