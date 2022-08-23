package ch06.book;

public class Earth {
	static final double EARTH_RADIUS = 6400;	//상수 선언 및 초기화
	static final double EARTH_SURFACE_AREA;		//상수 선언
	//정적 블록을 이용한 상수 초기화
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}


public static void main(String[] args) {
	System.out.println("지구의 반지름: "+ Earth.EARTH_RADIUS + "km");
	System.out.println("지구의 표면적: "+ Earth.EARTH_SURFACE_AREA + "km^2");
}

}
