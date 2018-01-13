import java.lang.Math; // headers MUST be above the first class

// one class needs to have a main() method
public class firsta
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
	int l, w, h, area, volume;
    l = 5;
    w = 3;
    h = 2;
    area = l*w;
    volume = area * h;
    System.out.println("here is an area: " + area);
    System.out.print("here is a volume: " + volume);
  }
}
