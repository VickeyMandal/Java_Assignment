// Explore labels with break and continue in Java and write a program for the same
package Assignment1;

public class Labels_break_Continue {
	
	public static void main(String[] args) {
		
		// label with continue
		Task:
		      for(int i=0; i<10; i++){
		          if (i<5){
		             continue Task;
		          }
		          System.out.println(i );
		       }
		System.out.println();
		
		// label with break
		Task_for_break:
		 for(int i=0; i<10; i++){
	         if (i==8){
	            break Task_for_break;
	          }
	          System.out.println(i);
		 }
	}

}