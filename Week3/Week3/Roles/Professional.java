package Week3.Roles;

import java.util.*;

public class Professional {

	private String name;
	private int ID = 00000;
	private Collection<String> address;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return this.ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public Collection<String> getAddress() {
		return this.address;
	}

	public void setAddress(Collection<String> address) {
		this.address = address;
	}

}