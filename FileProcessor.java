import java.util.*;
import java.io.*; 

public class FileProcessor{

	private String fileName;
	private int stringLength;
	private ArrayList<String> stringList = new ArrayList<String>();
	private Scanner input;
	
	public FileProcessor(String fileName, int stringLength) {
		
		setFileName(fileName);
		setStringLength(stringLength);
			
	}//end empty-argument constructor
	
	public int getArrayListSize() {
		
		return stringList.size();
		
	}//end getArrayListSize
	
	public void processFile() throws Exception {
		
		FileReader fr;
		BufferedReader reader;
		
		StringTooLongException tooLong = new StringTooLongException();
		
			try {
			File badstr = new File(getFileName());
			fr = new FileReader(getFileName());
			Scanner input = new Scanner(badstr);
			reader = new BufferedReader(fr);
			String line;
			
			while ((line = reader.readLine()) != null) {
				
				if(line.length() > 5) {
					throw tooLong;
				} else {
					System.out.println(line);
				}
			}
				input.close();
			reader.close();
			}
			catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			
			} catch (StringTooLongException e) {
			System.out.println(e.getMessage());
			}
		}//end processFile
		

	public String getFileName() {
		return fileName;
	}//getFileName

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}//end setFileName

	public int getStringLength() {
		return stringLength;
	}//end getStringLength

	public void setStringLength(int stringLength) {
		if (stringLength < 5) {
			this.stringLength = 5;
		} else {
			this.stringLength = stringLength;
		}
	}//end setStringLength

	@Override
	public String toString() {
		return "FileProcessor [fileName=" + fileName + ", stringLength=" + stringLength + "]";
	}//end toString

}//end class

