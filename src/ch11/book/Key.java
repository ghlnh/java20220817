package ch11.book;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	@Override	//Object의 equals() 재정의
	public boolean equals(Object obj) {
		if(obj instanceof Key) {	//Key타입과 같다면
			Key compareKey = (Key)obj;	//강제 타입변환
			if(this.number == compareKey.number) {	//number필드값이 같으면 true
				return true;
			}
		}return false;
	}
	//의도한대로 "홍길동"을 읽어오려면 hashCode() 오버라이딩해서 추가
	@Override
	public int hashCode() {
		//저장할 때의 "new Key(1)" 과 읽을 때의 "new Key(1)"은 같은 해시코드가 리턴
		return number;
	}
	
}

//저장할 때의 "new Key(1)" 과 읽을 때의 "new Key(1)"은 서로 다른 객체이지만
//HashMap은 hashCode()리턴값이 같고, equals()리턴값이 true로 나와 동등 객체로 평가 (같은 식별키로 인식)
