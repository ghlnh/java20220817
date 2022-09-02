package ch08.book;

public class RemoteControlExample2 {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		
		rc = new Audio1();
		rc.turnOn();
		rc.setMute(true);
	}

}
