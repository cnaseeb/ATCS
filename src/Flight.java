public class Flight implements Command {
	private ATCMediator atcMediator;

	public Flight(ATCMediator atcMediator) {
		this.atcMediator = atcMediator;
	}

	public void land() {
		if (atcMediator.isLandingOk() && atcMediator.isAvailable()) {
			System.out.println("You may land....");
			System.out.println("Landing done....");
			atcMediator.setLandingStatus(true);
		} else
			System.out.println("Will wait to land....");
	}

	public void getReady() {
		System.out.println("Getting ready...");
	}
