import java.io.*;
import java.nio.CharBuffer;

public class Streams {
	public static void main(String[] args) {
		InputStream dis = new DataInputStream(System.in);
		Reader read = new InputStreamReader(System.in);
		byte[] buffer = new byte[4];
		CharBuffer javaCharBuffer = CharBuffer.allocate(4);
		BufferedReader bis = new BufferedReader(read);

		int numBytesRead;

		try {
//			dis.mark(4);
//			while ((numBytesRead = dis.read(buffer)) >= 0) {
//				System.out.println("procitali: " + numBytesRead + "bytea\n" + new String(buffer));
//				BufferedInputStream bis = new BufferedInputStream(dis);
//				buffer = new byte[buffer.length];
//				dis.reset();
			
//			while(read.read(javaCharBuffer) >=0) {
//				System.out.println(javaCharBuffer.toString());
			
			String line = "";
			while((line = bis.readLine()) != null) {
				//System.out.println(line);
			}
			System.out.println("end");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
