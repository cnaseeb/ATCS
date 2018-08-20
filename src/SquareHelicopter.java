public class SquareHelicopter extends Shape{
	private final double  a;

	public double area(){
		return a * a;
	}

	public SquareHelicopter() {
        this(10,10);
    }

    @Override
    public void draw(){
   		System.out.println("Draw a square");
	}
}
