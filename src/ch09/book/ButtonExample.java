package ch09.book;

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnclickListener(new CallListner());
		btn.touch();
		
		btn.setOnclickListener(new MessageListener());
		btn.touch();
	}

}
