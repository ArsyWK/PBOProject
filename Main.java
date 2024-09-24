import java.util.Scanner;
import java.util.InputMismatchException;


public class Main {
	private Enemy enemy = new Enemy("Minion",5, false, false, 100);
	private Enemy enemy1 = new Enemy("Boss",30, false, false, 400);
	private Enemy enemy2 = new Enemy("Slime",2, false, false, 60);

	
	public  void MasukanNama()
	{	
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input your username!!! = ");
		String userName = scan.nextLine();
		System.out.println("UserName Entered:" + userName);
		scan.close();
	}
	 

	public static void main(String[] args)
	{
		FungsiFungsi method = new FungsiFungsi();
        
        
        Node alamat = new Node("Goku", 100,2,false);
        Node alamat2 = new Node("Beerus", 100,5,false);
        Node alamat3 = new Node("Vegeta", 100,7,false);

        method.insertFirst(alamat);
        method.insertFirst(alamat2);
        method.insertFirst(alamat3);
		
	System.out.println("hello");
//	Main main = new Main();
//	main.MasukanNama();
	
	
	
	
	
	
	
	
	
	
	
	}
	public Enemy getEnemy2() {
		return enemy2;
	}
	public void setEnemy2(Enemy enemy2) {
		this.enemy2 = enemy2;
	}
	public Enemy getEnemy() {
		return enemy;
	}
	public void setEnemy(Enemy enemy) {
		this.enemy = enemy;
	}
	public Enemy getEnemy1() {
		return enemy1;
	}
	public void setEnemy1(Enemy enemy1) {
		this.enemy1 = enemy1;

	}
	
	
	
	
}

//String Name, Integer GiveDamage, boolean DebounceDamage, boolean IsAttacking, Integer Health
