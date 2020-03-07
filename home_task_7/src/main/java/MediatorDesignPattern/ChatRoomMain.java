package MediatorDesignPattern;

public class ChatRoomMain {
	   public static void main(String[] args) {
	      User robert = new User("Nishath");
	      User john = new User("Aashritha");
	      robert.sendMessage("Hi! Aashritha!");
	      john.sendMessage("Hello! Nishath!");
	   }
}