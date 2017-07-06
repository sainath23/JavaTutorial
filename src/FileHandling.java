import java.io.*;
public class FileHandling {

	public static void main(String[] args) throws Exception {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("D:\\Eclipse\\workspace\\JavaTutorial\\src\\input.txt");
			out = new FileOutputStream("D:\\Eclipse\\workspace\\JavaTutorial\\src\\output.txt");
			
			int c;
			
			while((c = in.read()) != -1) {
				out.write(c);
			}
		}
		finally {
			if(in != null) {
				in.close();
			}
			if(out != null) {
				out.close();
			}
		}
	}
}
