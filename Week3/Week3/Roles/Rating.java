package Week3.Roles;

import java.util.*;

public class Rating extends Qualification {

	private Collection<String> aircraft;
	private float graded;

	public Collection<String> getAircraft() {
		return this.aircraft;
	}

	public void setAircraft(Collection<String> aircraft) {
		this.aircraft = aircraft;
	}

	public float getGraded() {
		return this.graded;
	}

	public void setGraded(float graded) {
		this.graded = graded;
	}

}