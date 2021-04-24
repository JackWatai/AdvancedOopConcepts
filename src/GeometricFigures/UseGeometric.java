package GeometricFigures;

public class UseGeometric {
public static void main(String[] args) {
	int height;
	int width;
	String figureType;
	double area;
GeometricFigure[] geometricfigures = new GeometricFigure[2];
geometricfigures[0] = new Square(8,8,"Square");
geometricfigures[1] = new Triangle(8,8,"Triangle");

for (int i = 0; i < geometricfigures.length; i++) {
	height = geometricfigures[i].getHeight();
	width = geometricfigures[i].getWidth();
	figureType = geometricfigures[i].getFigureType();
	area = geometricfigures[i].area(height, width);
	System.out.println("Figure Type is: "+ figureType + ", height is: " +
	height + ", width is : " + width + ", area is: " + area);	
}
}
}
