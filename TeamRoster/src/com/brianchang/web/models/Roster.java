package com.brianchang.web.models;

import java.util.ArrayList;

public class Roster {
	public ArrayList<Team> roster = new ArrayList<Team>();

	public ArrayList<Team> getRoster() {
		return roster;
	}

	public void addtoRoster(Team team) {
		roster.add(team);
	}
	
}
