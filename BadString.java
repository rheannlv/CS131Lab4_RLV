public class BadString{
  
  public static void main(String[] args) throws Exception{
    	
    	FileProcessor fp = new FileProcessor("BadString.txt", 10);
		fp.processFile();
		System.out.println(fp.toString());

		System.out.println();
		
		FileProcessor gstr = new FileProcessor("GoodString.txt", 5);
		gstr.processFile();
    
  }//end main
  
}//end class
