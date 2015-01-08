
public class Player
{
	
	public static void main(String[] args) 
	{
		int year = 2015;
		Person tom;
		Person mike;
		
		
		System.out.println("Hello World! It's " + year + "!");

		tom = new Person("Tom", 225.3f);
		tom.walks();
		
		mike = new Person("Mike", 180.9f);
		mike.walks();
	}
	
}
