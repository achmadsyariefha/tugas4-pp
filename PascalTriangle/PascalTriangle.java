import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PascalTriangle {

    public static void main(String args[]) throws IOException{
    	int spasi, x, y;
	    Scanner input = new Scanner(System.in);

	  try (FileWriter hasil = new FileWriter("PascalTriangle.txt")) {
        String newLine = System.getProperty("line.separator");
	    System.out.print("Masukan tinggi segitiga : ");
	    spasi = input.nextInt();

	    int[][]b = new int[100][100];
	    for(x=1; x<=spasi; x=x+1){
	        for(y=spasi; y>x; y=y-1){
	            hasil.write("   ");
	        }

	        for(y=1; y<=x; y++){
	            if(x==0||y==x){
	                b[x][y]=1;
	                hasil.write("  "+b[x][y]+"   ");
	            }else{
	                b[x][y] = b[x-1][y-1] + b[x-1][y];

	                if(b[x][y]>99){
	                	hasil.write("  "+b[x][y]+"   ");
	            	}else if(b[x][y]>9){
	                	hasil.write("  "+b[x][y]+"   ");
	                }else{
	                	hasil.write("  "+b[x][y]+"   ");
	                }
	            }
	        }
	            hasil.write(newLine);

		}
	}
}
}
