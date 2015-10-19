
import java.io.*;
import java.nio.charset.Charset;

/**
 * change ascii text to byte code
 * @author Austin
 *
 */
public class TextToBytes {

	public static final void main(String argsp[])
	{

		try {
			//Console Output
			while(true){
				System.out.print("Hello "); 
				System.out.println("world");
				System.out.println("Give me some sugahhh----> ");
				//Console Input

				BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
				String text;

				text = in.readLine();


				System.out.print(text); 

				System.out.println(" is tight!");

				byte[] b1 = text.getBytes();
				byte[] b2 = text.getBytes(Charset.forName("UTF-8"));


				String xxx = ByteArrayToString(b2).toString();
				System.out.println("Real Byte is: " + xxx);

			}
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

	public static StringBuilder ByteArrayToString(byte[] ba)
	{
		byte[] bytes = ba;
		StringBuilder sb = new StringBuilder();
		for (byte b : bytes) {
			sb.append(String.format("%02X ", b));
		}
		return sb;
	}

}
