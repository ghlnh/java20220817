package ch09.book;

public class Button {
	OnclickListener listener;	//인터페이스 타입 필드
	void setOnclickListener(OnclickListener listener) {
		this.listener = listener; //매개변수의 다형성
	}
	
	void touch() {
		listener.onClick();		//구현객체의 onClick()메소드 호출
	}
	
	//중첩 인터페이스
	interface OnclickListener {
		void onClick();
	}
}
