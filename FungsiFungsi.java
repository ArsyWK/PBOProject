import java.util.Random;
public class FungsiFungsi<alltype> 
{
	
	private int[] Stageid = {12345,67891,23456,44553};
	Random random = new Random();
	int RandomNumber =random.nextInt(4);
	
	public Integer GiveDamage(Integer dmg )
	{
		
		return dmg;
		
		
	}
	
	public void TakeDamage()
	{
		
		
		
	}
	
	public Integer SetStage()
	{
		return Stageid[RandomNumber];
		
	}
	
	
	

	
	
	
	 Node first = null;  
	    Node last = null;  

	    
	    public void insertFirst(Node a) {
	        if (first == null) {  
	            first = last = a;  
	        } else {
	            a.next = first;  
	            first.prev = a;  
	            first = a;  
	        }
	    }

	  
	    public void cetak() {
	        Node temp = first;  
	        while (temp != null) {
	            System.out.println("Nama: " + temp.nama + ", Darah: " + temp.darah + ",Speed:" + temp.baseSpeed + " ,CurrentTurn:  " + temp.CurrentTurn);
	            temp = temp.next;  
	            
	            
	        }
	    }
	    
	    public void  MatchStart(Node a,Node b ,Node c)
	    {
	    	  Node temp = first; 
	    	  Node HighestSpeed;
	          while (temp != null) 
	          {
	          Integer tempH1 = temp.baseSpeed;
	          temp = temp.next;
	          }
	
	
	
	
	
	
  }
}
