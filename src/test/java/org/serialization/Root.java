package org.serialization;

import java.util.ArrayList;
import java.util.Objects;

public class Root {
private String id;
private String type;
private String name;
private float ppu;
private Batters batters;
private ArrayList<Object> toppings;



public String getId() {
	return id;
}



public void setId(String id) {
	this.id = id;
}



public String getType() {
	return type;
}



public void setType(String type) {
	this.type = type;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public float getPpu() {
	return ppu;
}



public void setPpu(float ppu) {
	this.ppu = ppu;
}



public Batters getBatters() {
	return batters;
}



public void setBatters(Batters batters) {
	this.batters = batters;
}



public ArrayList<Object> getToppings() {
	return toppings;
}



public void setToppings(ArrayList<Object> toppings) {
	this.toppings = toppings;
}



public Root(String id,String type,String name,float ppu,Batters batters,ArrayList<Object> toppings) {
	this.id=id;
	this.type=type;
	this.name=name;
	this.ppu=ppu;
	this.batters=batters;
	this.toppings=toppings;
}
	

}
