package lab2;

public class MessageDriver {
	public static void main(String[] args) {
		Message sam = new Message();
		
		sam.setSender("Samina Sadiq");
		sam.setReceiver("Nazmul Alam");
		sam.append("Hey, how are you");
		
		System.out.println(sam.toString());
	}

}
