package GeometricFigures;

public class Square extends GeometricFigure {
public double area;
	public Square(int height, int width, String figureType) {
		super(height, width, figureType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area(int height, int width) {
		// TODO Auto-generated method stub
		area = (height*width);
		return area;
	}

}
