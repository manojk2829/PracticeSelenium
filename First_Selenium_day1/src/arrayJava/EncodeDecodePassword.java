package arrayJava;

import org.apache.commons.codec.binary.Base64;
import org.testng.annotations.Test;

public class EncodeDecodePassword {
   
	@Test
	public void encodeDecode()
	{
		String original ="irctc@116";
		byte [] encode = Base64.encodeBase64(original.getBytes());
		System.out.println("-----  " + new String(encode));
		
		byte [] decode = Base64.decodeBase64(encode);
		System.out.println("-----  " + new String(decode));
	}
}
