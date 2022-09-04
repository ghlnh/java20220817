package ch09.book;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	//필드선언과 초기값 대입
	Button.OnclickListener listener = new Button.OnclickListener() {
		@Override
		public void onClick() {
		System.out.println("전화를 겁니다.");
		}
	};
	
	Window() {
		button1.setOnclickListener(listener);	//매개값으로 필드 대입
		button2.setOnclickListener(new Button.OnclickListener() {
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
			}
		});
	}
}
