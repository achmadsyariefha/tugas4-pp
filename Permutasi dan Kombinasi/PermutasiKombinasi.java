import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

class PermutasiKombinasi{
    public static void main(String[]args){
      try {
  			File file = new File("NilaiN.txt");
  			FileReader fileReader = new FileReader(file);
  			BufferedReader bufferedReader = new BufferedReader(fileReader);
  			StringBuffer stringBuffer = new StringBuffer();
  			String line = null;

          File file1 = new File("NilaiR.txt");
          FileReader fileReader1 = new FileReader(file1);
          BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
          StringBuffer stringBuffer1 = new StringBuffer();
          String line1 = null;

        while ((line = bufferedReader.readLine()) != null && (line1 = bufferedReader1.readLine()) != null) {

  				int angkaN = Integer.parseInt(line);
          int angkaR = Integer.parseInt(line1);

          if(angkaN>0 && angkaR>0 && angkaN>angkaR){
          int angkaS = angkaN - angkaR;

          int hasil1 = 1;
          int hasil2 = 1;
          int hasil3 = 1;

          for(int i=1;i<=angkaN;i++){
            hasil1 = hasil1 * i ;
          }

          for(int i=1;i<=angkaR;i++){
            hasil2 = hasil2 * i ;
          }

          for(int i=1;i<=angkaS;i++){
            hasil3 = hasil3 * i ;
          }

          int hasilpermutasi = hasil1 / hasil3;
          int hasilkombinasi = hasil1 / (hasil3 * hasil2);

          System.out.println("Menu");
          System.out.println("1. Permutasi");
          System.out.println("2. Kombinasi");
          System.out.println("0. Keluar");

          Scanner pilihan = new Scanner (System.in);
          int pilihan_menu = pilihan.nextInt();

          switch(pilihan_menu){
            case 1:
              System.out.println("Nilai N: " + angkaN);
              System.out.println("Nilai R: " +angkaR);
              System.out.println("Hasil Permutasi = " + hasilpermutasi);
              break;

            case 2:
              System.out.println("Nilai N: " + angkaN);
              System.out.println("Nilai R: " +angkaR);
              System.out.println("Hasil Kombinasi = " + hasilkombinasi);
              break;

            case 0:
              System.exit(1);
              break;

            default:
              System.out.println("Anda memasukkan inputan yang salah");
          }

        }else{
          System.out.println("Nilai tidak dapat dihitung");
        }

        }

        fileReader.close();
        fileReader1.close();

        }catch(FileNotFoundException ex) {
            System.out.println("Unable to open file");
        }
        catch(IOException ex) {
            System.out.println("Error reading file");
        }


  }
}
