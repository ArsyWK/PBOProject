
public class Node {
	    String nama;  
	    Integer darah;
	    Integer baseSpeed;
	    boolean CurrentTurn;
	    Node next;  
	    Node prev;  

	    public Node(String nama, Integer darah,Integer baseSpeed,boolean CurrentTurn) {
	        this.nama = nama;
	        this.darah = darah;
	        this.baseSpeed = baseSpeed;
	        this.CurrentTurn = CurrentTurn;
	    }
	}
