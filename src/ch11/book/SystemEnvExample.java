package ch11.book;

public class SystemEnvExample {
public static void main(String[] args) {
	String javaHome = System.getenv("JAVA_HOME");
	System.out.println("JAVA_HOME:" + javaHome);
}
}
