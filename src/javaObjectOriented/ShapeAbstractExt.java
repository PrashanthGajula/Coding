package javaObjectOriented;

public class ShapeAbstractExt extends ShapeAbstract implements Shape{

	@Override
	public void drawShape() {
		System.out.println("In shapeAbstractExt drawShape");
	}
	
	@Override
	public void eraseShape() {
		System.out.println("In ShapeAbstractExt eraseShape");
	}

	public void modifyShape() {
		System.out.println("in shapeABstractext modify shape");
		
	}
}
