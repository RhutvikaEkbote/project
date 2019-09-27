import java.awt.geom.Area;

public class Testarea {

	public static void main(String[] args) {
		Area a=null;
		a=new Circle(2.3);
		((Circle) a).findArea();
		a=new Triangle(3,2);
		((Triangle) a).findarea();

	}

}
