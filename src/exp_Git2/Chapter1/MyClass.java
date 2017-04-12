/**
 * 
 */
package exp_Git2.Chapter1;

/**
 * @author Maxi
 *
 */
public class MyClass {
	private String name;
	private String lastName;
	
	public MyClass(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}
	public static void main(String[] args) {
		System.out.println("BEGIN\n------------");
		staticMethod("Max");
		System.out.println("------------\nEND");

	}
	
	public static void staticMethod(String inp) {
		System.out.println("Hi, input is" + inp);
		System.out.println("Bye");
	}
	
	public String getName() {
		return name;
	}

}
