import java.io.*;

public class CopyPaste {
  public static void main (String[] args){
    FileInputStream copy = null;
    FileOutputStream paste = null;

    try {
      copy = new FileInputStream("sample.txt");
      paste = new FileOutputStream("C:/javaclass/copy paste/sample/sample.txt");
      int number;

      while((number = copy.read()) != -1){
        paste.write(number);
      }
    }
    catch(IOException er){
      System.out.print("error");
    }
  }
}
