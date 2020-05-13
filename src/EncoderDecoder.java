
public class EncoderDecoder {

	public static void main(String[] args) {
		String decodeMessage = "test";
		String encodeMessage = "test";
		decode(decodeMessage);
		encode(encodeMessage);
	}
	
	private static void decode(String S) {
		String decode = "";
		
		char[] arr = S.toCharArray();
		
		for(int i = 0; i < arr.length; i++) {
			int c = arr[i] - 1;
			decode += Character.toString((char) c) + " ";
		}
		
		System.out.println(decode);
	}
	
	private static void encode(String S) {
		String encode = "";
		
		char[] arr = S.toCharArray();
		
		for(int i = 0; i < arr.length; i++) {
			int c = arr[i] + 1;
			encode += Character.toString((char) c);
		}
		
		encode = encode.replace("!", " ");
		System.out.println(encode);
	}
}
