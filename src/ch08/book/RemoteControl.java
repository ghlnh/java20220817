package ch08.book;

public interface RemoteControl {
	//상수
	int MAX_VOLUME =10;
	int MIN_VOLUME =0;
	
	//추상 메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	
	//디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제 합니다.");
		}
	}
}
