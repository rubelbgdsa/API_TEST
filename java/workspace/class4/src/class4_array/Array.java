package class4_array;

public class Array {

	public static void main(String[] args) {
//	
        int [][]n;
        n = new int [3][4];
        
        n[0][0] = 2;
        n[0][1] = 7;
        n[0][2] = 4;
        n[0][3] = 9;
   
        n[1][0] = 1;
        n[1][1] = 6;
        n[1][2] = 3;
        n[1][3] = 5;
        
        n[2][0] = 7;
        n[2][1] = 8;
        n[2][2] = 8;
        n[2][3] = 2;
        
//        for (int i=0; i<=3; i++);
//            System.out.println( n[0][i]);
//        for (int i=0; i<=3; i++);
//            System.out.println(n[1][i]);
//        for (int i=0; i<=3; i++);
//            System.out.println(n[2][i]);
        for (int r=0; r<=2; r++) {
        	for (int c = 0; c <= 3; c++)
        	System.out.print(n[r][c]);
        	
         System.out.println();
        }
        
	}

}