package org.serialization;

public class B {

	private String id;
	private String type;
	
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

	public B(String id, String type){
		this.id=id;
		this.type=type;
	}


}
