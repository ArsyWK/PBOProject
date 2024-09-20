
import java.util.concurrent.TimeUnit;





public class FungsiFungsi {
	public Integer GiveDamage;
	public String Name;
	public Integer Health;
	boolean DebounceDamage = false;
	boolean IsAttacking = false;
	
	public Integer Attack(int GiveDamage) throws InterruptedException {
		  boolean DebounceDamage = false;
		  boolean IsAttacking = false;
		  this.GiveDamage = GiveDamage;
	        if (DebounceDamage == false && IsAttacking == false) {
	            IsAttacking = true;
	            DebounceDamage = true;


	            TimeUnit.SECONDS.sleep(2);
	            
	       
	            IsAttacking = false;
	            DebounceDamage = false;
	        }

	        return GiveDamage;
	    }
	
	class SkillTypeF
	{
		int Cut = 3;
		int Determination = 10;
		int SuperCut = 14;
		
		

	}
	
	class SkillTypeS
	{
		int GasterBlaster = 30;
		int End = 100;
		int BoneThrow = 55;

	}
	
	class SkillTypeG
	{
		int Kamehameha = 20;
		int Kaioken = 3;
		int MeteorSmash = 30;

	}
	
	
	
}
