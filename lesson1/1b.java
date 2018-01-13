import java.lang.Math; // headers MUST be above the first class

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
	double r, circumference, area;
    r = 5.2;
    circumference = 2*Math.PI*r;
    area = Math.PI * Math.pow(r, 2);
    System.out.println("here is a circumference: " + circumference);
    System.out.print("here is an area: " + area);
  }
}
