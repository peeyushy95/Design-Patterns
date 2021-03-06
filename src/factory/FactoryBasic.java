package factory;

enum CoordinateSystem {
	CARTESIAN, POLAR
}

class Point {
	
	private double x, y;

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	private Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public static class Factory {
		
		public static Point newCartesianPoint(double x, double y) {
			return new Point(x, y);
		}

		public static Point newPolarPoint(double rho, double theta) {
			return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
		}
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}

public class FactoryBasic {

	public static void main(String [] args){
		Point point1 = Point.Factory.newCartesianPoint(1, 2);
		System.out.println(point1);
	}
}
