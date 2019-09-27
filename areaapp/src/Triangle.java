import java.awt.geom.Area;

class Triangle extends Area {
	
	double b,h,ta;
	public Triangle(double b,double h) {
		this.b=b;
		this.h=h;
		
		
	}
	public void findarea(){
		ta=0.5*b*h;
		System.out.println("area of triangle is :"+ta);
	}

}
