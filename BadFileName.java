//IO TestClass for bad file names
public class BadFileName{
  
  public static void main(String[] args) throws Exception{
    
    FileProcessor fp = new FileProcessor("String1.txt",10);
		fp.processFile();
  }//end main
  
}//end class
