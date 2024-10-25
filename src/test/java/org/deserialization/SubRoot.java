package org.deserialization;

import java.util.ArrayList;

import org.serialization.Batters;

public class SubRoot {
	private String id;
	private String type;
	private String name;
	private float ppu;
	private Batters1 batters;
	private ArrayList<Object> toppings;
	
	public String getId() {
		return id;
	}
	public String getType() {
		return type;
	}
	public String getName() {
		return name;
	}
	public float getPpu() {
		return ppu;
	}
	public Batters1 getBatters() {
		return batters;
	}
	public ArrayList<Object> getToppings() {
		return toppings;
	}
	
	
	
	
}
