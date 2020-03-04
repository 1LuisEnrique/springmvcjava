package abstracto.domain;

public class Circle extends GeometricFigure{
	
	public Circle(String figureType) {
		super(figureType);
	}
	
	@Override
	public void draw() {
		//Add the behavior the method abstract 
		System.out.println("Here should draw: " + this.getClass().getSimpleName());
	}

}
