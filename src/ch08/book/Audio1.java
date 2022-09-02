package ch08.book;

public class Audio1 implements RemoteControl {
	//필드
	private int volume;
	private boolean mute;
	
	//turnOn() 추상 메소드의 실체 메소드
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	//turnOff() 추상메소드의 실체 메소드
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		//인터페이스 상수를 이용해서 volume 필드의 값을 제한
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume< RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Audio볼륨: " + this.volume);
	}
	//디폴트 메소드 재정의
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("Audio 무음 처리 합니다.");
		}else {
			System.out.println("Audio 무음 해제 합니다.");
		}
	}
	
}
