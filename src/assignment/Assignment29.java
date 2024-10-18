package assignment;

public class Assignment29 {

	public static void main(String[] args) {
	      int num[][] = new int[3][4];
	      
	      //To assign random value to two dimensional array
	      for(int i =0; i<3; i++){
	          
	          for(int j =0; j<4; j++){
	              num[i][j] = (int)(Math.random()*100); 
	          }
	      }
	     
	     //print two dimensional value in array
	      for(int i =0; i<3; i++){
	          
	          for(int j=0; j<4; j++){
	              System.out.print(num[i][j]+" ");
	          }
	          System.out.println();
	      }
	      
	      System.out.println("**************************");
	      
	      //2nd method to print 2D Array 
	      for(int n[] : num){
	          for(int m : n){
	              System.out.print(m + " ");
	          }
	          System.out.println();
	      }

	}

}
