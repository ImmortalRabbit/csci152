/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, HTML, CSS, JS.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		ArrayIntStack array = new ArrayIntStack();
		try {
		    array.pop();
		} catch(Exception ex) {
	        System.out.println(ex.getMessage());
		}
		
		for(int i = 0; i < 12; i++){
		    array.push(i);
		}
		
		System.out.println(array.getSize());
		System.out.println(array);
		
		array.clear();
		System.out.println(array.getSize());
		System.out.println(array);
		for(int i = 0; i < 22; i++){
		    array.push(i);
		}
		System.out.println(array.getSize());
		System.out.println(array);
		
	}
}
