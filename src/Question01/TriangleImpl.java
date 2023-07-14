package Question01;

public class TriangleImpl implements IShape {

	private float side1;
	private float side2;
	private float base;
	private float height;
	private float areaOfTrianle;
	private float perimeterOfTrianle;
	
	public TriangleImpl(float side1, float side2, float base, float height) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.base = base;
		this.height = height;
	}

	@Override
	public float area() {
		System.out.println(side1);
		System.out.println(side2);
		areaOfTrianle = 0.5f * base * height;
		System.out.println(areaOfTrianle);
		return areaOfTrianle;
	}

	@Override
	public float perimeter() {
		perimeterOfTrianle = side1 + side2 + base;
		return perimeterOfTrianle;
	}


}
