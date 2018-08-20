import java.util.*;


class Runway implements Command{

	private ATCMediator atcMediator;

	private int width;
	private int length;
	private String color;

	public int getWidth(){
		return this.width;
	}

	public int getLength(){
		return this.length;
	}
	public void setWidth(int width){
		this.width = width;
	}

	public void setLength(int length){
		this.length = length;
	}


	public Runway(ATCMediator atcMediator) {
		this.atcMediator = atcMediator;
		atcMediator.setLandingStatus(true);
	}

	@Override
	public void land() {
		System.out.println("Landing permission granted...");
		atcMediator.setLandingStatus(true);
	}

	public void getColor(){
		return color;
	}

	public void setColor(String color){
		this.color = color;
	}
	//Draw method
	public void draw(){
		//implement draw method using the abstract class shape methods
	}



}
