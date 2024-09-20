

public class Player extends FungsiFungsi{
	public Integer GiveDamage;
	public String Name;
	public Integer Health;
	boolean DebounceDamage = false;
	boolean IsAttacking = false;
	FungsiFungsi module = new FungsiFungsi();
	
	
	public Player(String Name, boolean DebounceDamage, boolean IsAttacking, Integer Health )
	{
	this.Name = Name;
	this.IsAttacking = IsAttacking;
	this.DebounceDamage = DebounceDamage;
	this.Health = Health;
	}


}
	
	
