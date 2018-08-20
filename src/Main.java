public class Main{

	
	public static void main(String[] args) {{

		ATCMediator atcMediator = new ATCMediator();
		Flight flightKLM = new Flight(atcMediator);
		Runway runway1 = new Runway(atcMediator);
		atcMediator.registerFlight(flightKLM);
		atcMediator.registerRunway(runway1);
		flightKLM.getReady();
		runway1.land();
		flightKLM.land();

		runway1.draw();

		

	}
}
