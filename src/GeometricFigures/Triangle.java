package GeometricFigures;

public class Triangle extends GeometricFigure {
public double area;
	public Triangle(int height, int width, String figureType) {
		super(height, width, figureType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area(int height, int width) {
		// TODO Auto-generated method stub
		area = (height*width*0.5);
		return area;
	}
	


}
