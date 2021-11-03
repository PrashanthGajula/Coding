package javaObjectOriented;

public class ShapeMain {

	public static void main(String[] args) {
		ShapeImplv1 s1 = new ShapeImplv1();
		s1.drawShape();
		s1.eraseShape();
		
		Shape s2 = new ShapeImplv2();
		s2.drawShape();
		s2.eraseShape();
		
		ShapeAbstract sa = new ShapeAbstract() {
		};
		sa.drawShape();
		sa.eraseShape();
		
		ShapeAbstractExt sae = new ShapeAbstractExt();
		sae.drawShape();
		sae.eraseShape();
		sae.modifyShape();
		

	}

}
