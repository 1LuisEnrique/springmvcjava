package abstracto.domain;

public abstract class GeometricFigure {
	protected String figureType;
	
	protected GeometricFigure(String figureType) {
		this.figureType = figureType;
	}
	
	/**
	 * the class abstract encapsulate the functionility the other class, except the behavior
	 * is necesary extends this class for its use it 
	 */
	public abstract void draw();

	public String getFigureType() {
		return figureType;
	}

	public void setFigureType(String figureType) {
		this.figureType = figureType;
	}

	@Override
	public String toString() {
		return "GeometricFigure [figureType=" + figureType + "]";
	}
	
	

}
