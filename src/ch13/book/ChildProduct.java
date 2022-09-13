package ch13.book;
//Product를 상속 받은 ChildProduct는 타입파라미터 갯수가 같거나 커야 됨
public class ChildProduct<T, M, C> extends Product<T, M>{
	private C company;
	public C getCompany() { return this.company; }
	public void setCompany(C company) { this.company = company;}
}
