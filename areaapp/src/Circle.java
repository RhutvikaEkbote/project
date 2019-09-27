import java.awt.geom.Area;

class Circle extends Area
 {
	 
		 
			double r,ca;
			public Circle(double r)
			{
				this.r=r;
				
			}
			public void findArea() {
				ca=3.14*r*r;
			System.out.println("area of circle is:"+ca);	
			}
		}
		
