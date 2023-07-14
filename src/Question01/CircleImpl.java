package Question01;

public class CircleImpl implements IShape{

	private float radius;
	private float areaOfCircle;
	private float perimeterOfCircle;
	
	private static final float pi = 3.14f;
	
	public CircleImpl(float radius) {
		super();
		this.radius = radius;
	}

	@Override
	public float area() {
		areaOfCircle = pi * radius * radius;
		return areaOfCircle;
	}

	@Override
	public float perimeter() {
		perimeterOfCircle = 2 * pi * radius;
		return perimeterOfCircle;
	}

}
