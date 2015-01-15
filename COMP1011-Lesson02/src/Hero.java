/**
 * 
 * @author Blaine Parr
 * @version January 15, 2015
 */
public class Hero 
{
	//Private properties +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private int strength;
	private int speed;
	private int health;
	
	//public properties ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public String name;
	
	//Getter section +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public int getStrength() 
	{
		return strength;
	} //method getStrength ends

	public int getSpeed() 
	{
		return speed;
	} //method getSpeed ends

	public int getHealth() 
	{
		return health;
		generateAbilites();
	} //method getHealth ends

	//Constructor ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public Hero(String name)
	{
		this.name = name;
	} //constructor ends
	
	//Private methods ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private void generateAbilities()
	{
		
	} //method generateAbilities ends
	
	public void fight()
	{
		
	} //method fight ends
	
	public void run()
	{
		
	} //method run ends
} //class Hero ends
