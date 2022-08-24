package ch06.book;

public class Car4 {
	
	//필드
	private int speed;
	private boolean stop;
	
	
	//생성자
	
	
	//메소드
	//Getter
	public int getSpeed() {
		return speed;
	}
	//Setter
	public void setSpeed(int speed) {
		if(speed <0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	//Getter
	public boolean isStop() {
		return stop;
	}
	//Setter
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}

}
