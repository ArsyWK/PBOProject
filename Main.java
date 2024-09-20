import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

class Stageid
{
	static String[] Stage = {"Holy Etunasia","Twisted Utopia","Detroit","Metro"};

	
	public String randomstage()
	{
		Random random = new Random();
		int RandomNumber = random.nextInt(4);
		return Stage[RandomNumber] ;
		
	}
}


public class Main  {
	 static Enemy Minion = new Enemy("Minion",40, false, false, 100);
	 static Enemy Boss = new Enemy("Boss",100, false, false, 400);
	 static Enemy Slime = new Enemy("Slime",10, false, false, 60);
	 Stageid stage = new Stageid();
	 static  Player Frisk = new Player("Frisk",false,false,100);
	 static Player Sans = new Player("Sans",false,false,1);
	 static Player Goku = new Player("Goku",false,false,250);
	 
	 
	 public static void StageSelect(String z,Enemy a, Enemy c, Player d,Player e)
	 {
		 System.out.println(z);
		 System.out.println("First Enemy is:"+System.lineSeparator()+a.Name);
		 System.out.println("Second Enemy is:"+System.lineSeparator()+c.Name);
		 System.out.println("First Player is:"+System.lineSeparator()+d.Name);
		 System.out.println("Second Player is:"+System.lineSeparator()+e.Name);
	 }

	
	public  void MasukanNama()
	{	
		Scanner scan = new Scanner(System.in);
		System.out.println("Input your username!!! = ");
		String userName = scan.nextLine();
		System.out.println("UserName Entered:" + userName);
		scan.close();
	}
	
	public void pemilihan()
	{
		while(true)
		{
		try {
		System.out.println("cek Menu:1:Attack,2:Skill");
		Scanner scan = new Scanner(System.in);
		System.out.println("\n");
	    int milih = scan.nextInt();
	    int milihskill = scan.nextInt();
	    if(milih == 1)
	    {
	    	break;
	    }
	    else if(milih == 2 )
	    {
	    	System.out.println("1.xxx,2.xxx,3.xxx");
	    	milihskill = scan.nextInt();
	    	if(milihskill == 1)
	    	{
	    		break;
	    	}
	    	if(milihskill == 2)
	    	{
	    		break;
	    	}
	    	if(milihskill == 3)
	    	{
	    		break;
	    	}
	    }
		}
		
		catch(InputMismatchException e)
		{
			System.out.println("salah");
			pemilihan();
			
		    
		}
		}
	}
	public void TurnBased(Enemy b,Enemy a,Player x, Player y)
	{
		boolean aTurn = false;
		boolean bTurn = false;
		boolean xturn = false;
		boolean yturn = false;
		
		
		while(true)
		{
			try {
				if(Player.IsAttacking == false)
				{
					pass
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		
	}

	 

	public static void main(String[] args)
	{
		
	Main main = new Main();
	Stageid stage = new Stageid();
//	main.MasukanNama();
	StageSelect(stage.Stage[2],Boss,Minion,Sans,Goku);
//	main.pemilihan();
	
	
	
	
	
	
	
	
	
	
	
	}
	public Enemy getEnemy2() {
		return Slime;
	}
	public void setEnemy2(Enemy enemy2) {
		this.Slime = enemy2;
	}
	public Enemy getEnemy() {
		return Minion;
	}
	public void setEnemy(Enemy enemy) {
		this.Minion = enemy;
	}
	public Enemy getEnemy1() {
		return Boss;
	}
	public void setEnemy1(Enemy enemy1) {
		this.Boss = enemy1;

	}
	
	
	
	
}

//String Name, Integer GiveDamage, boolean DebounceDamage, boolean IsAttacking, Integer Health
