import java.io.*;

public class CutPaste {
  public static void main (String[] args){
    FileInputStream copy = null;
    FileOutputStream paste = null;

    try {
      File filecut = new File("C:/javaclass/cut paste/sample.txt");
      File filepaste = new File("C:/javaclass/cut paste/sample/sample.txt");
      copy = new FileInputStream(filecut);
      paste = new FileOutputStream(filepaste);
      int number;

      while((number = copy.read()) != -1){
        paste.write(number);
      }
      copy.close();
      paste.close();
      filecut.delete();
    }
    catch(IOException er){
      System.out.print("error");
    }
  }
}
