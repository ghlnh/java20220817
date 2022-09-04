package ch14.book;

public class UsingThisExample {
public static void main(String[] args) {
	UsingThis usingThis = new UsingThis();
	UsingThis.Inner inner = usingThis.new Inner();
	inner.method();
}
}
