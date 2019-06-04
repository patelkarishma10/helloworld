package model;

import java.util.HashMap;
import java.util.Map;

public class AppModel {

	private Map<Integer, String> haktTeam = new HashMap<Integer, String>();

	public Map<Integer, String> getHaktTeam() {
		return haktTeam;
	}

	public void setHaktTeam(Map<Integer, String> haktTeam) {
		this.haktTeam = haktTeam;
	}

	public void addItemToMap(int key, String value) {
		getHaktTeam().put(key, value);
	}

	public String getString(int id) {
		return haktTeam.get(id);
	}

}
