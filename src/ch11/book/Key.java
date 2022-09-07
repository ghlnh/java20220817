package ch11.book;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (number != other.number)
			return false;
		return true;
	}
	


}
//저장할 때의 "new Key(1)" 과 읽을 때의 "new Key(1)"은 서로 다른 객체이지만
//HashMap은 hashCode()리턴값이 같고, equals()리턴값이 true로 나와 동등 객체로 평가 (같은 식별키로 인식)
