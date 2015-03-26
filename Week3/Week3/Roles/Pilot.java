package Week3.Roles;

import java.util.*;

public class Pilot extends Professional {

	Collection<Rating> isOwned;
	private int flight_hours;
	private String airline;
	private String rank;

	public int getFlight_hours() {
		return this.flight_hours;
	}

	public void setFlight_hours(int flight_hours) {
		this.flight_hours = flight_hours;
	}

	public String getAirline() {
		return this.airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getRank() {
		return this.rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

}