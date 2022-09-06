package ch11.book;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {	//매개값이 Member타입인지 확인
			//Member타입으로 강제 타입변환
			Member member = (Member) obj;
			//id 필드값이 동일한지 검사 후, 동일하면 true 반환
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;	//매개값이 Member타입이 아니거나 id 필드값이 다른 경우 false 반환
	}
	
	@Override
	public int hashCode() {
		//id가 동일한 문자열인 경우 같은 해시코드를 리턴
		return id.hashCode();
	}
}
