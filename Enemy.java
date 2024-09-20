public class Enemy {
	
	 Integer GiveDamage;
	 String Name ;
	 boolean DebounceDamage;
	 boolean IsAttacking;
	 Integer Health;

	public Enemy(String Name, Integer GiveDamage, boolean DebounceDamage, boolean IsAttacking, Integer Health )
	{
	this.GiveDamage = GiveDamage;
	this.Name = Name;
	this.IsAttacking = IsAttacking;
	this.DebounceDamage = DebounceDamage;
	this.Health = Health;
	}
}
