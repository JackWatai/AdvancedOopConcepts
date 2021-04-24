package GeometricFigures;

public abstract class GeometricFigure {
private String figureType;
private int height;
private int width;

public GeometricFigure(int height, int width, String figureType) {
	this.figureType = figureType;
	this.height = height;
	this.width = width;
}

public String getFigureType() {
	return figureType;
}

public void setFigureType(String figureType) {
	this.figureType = figureType;
}

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}

public int getWidth() {
	return width;
}

public void setWidth(int width) {
	this.width = width;
}
public abstract double area(int height, int width);
	
}
