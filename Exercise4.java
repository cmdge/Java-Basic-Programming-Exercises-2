public class Exercise4
{
	public static void main(String[] args) {
	    int[] valA = {13, -22, 82, 17};
	    int[] valB = new int[valA.length];
	    int[] sum = new int[valA.length];
	    
	    
	    for (int i = 0; i < valA.length; i++){
	        valB[i] = 25 - valA[i];
	        sum[i] = valA[i] + valB[i];
	    }
	    
	   System.out.println( "valA: " + valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3] );
	   System.out.println( "valB: " + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3] );
	   System.out.println( "sum: " + (valA[0]+valB[0]) + " " + (valA[1]+valB[1]) + " " + (valA[2]+valB[2]) + " " + (valA[3]+valB[3]) );
	}
}