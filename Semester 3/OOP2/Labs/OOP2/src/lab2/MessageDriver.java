package lab2;

public class MessageDriver {
	public static void main(String[] args) {
		Message sam = new Message();
		String msg  = "I am grand."; 
		
		sam.setSender("Samina Sadiq");
		sam.setReceiver("Nazmul Alam");
		sam.append("Hey, how are you. " + msg);
		
		System.out.println(sam.toString());
	}

}
