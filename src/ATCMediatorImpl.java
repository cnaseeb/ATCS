public class ATCMediatorImpl implements IATCMediator {
	private Flight flight;
	private Runway runway;
	public boolean land;
	

	public void registerRunway(Runway runway) {
		this.runway = runway;
	}

	public void registerFlight(Flight flight) {
		this.flight = flight;
	}

	public boolean isLandingOk() {
		return land;
	}

	
	public void setLandingStatus(boolean status) {
		land = status;

	}

	public boolean isAvailable(){
		color = runway.getColor();

		if (color == green){
			return true;
		}
		else if (color == red){
			return false;
		}

	}


}
