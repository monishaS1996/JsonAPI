package org.serialization;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class serialization {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {

		File f = new File("C:\\Users\\KS\\eclipse-workspace\\JsonAPI\\src\\test\\resources\\serialization.json");
		ObjectMapper om = new ObjectMapper();
		A a = new A("1001","Regular");
		B b = new B("1002","Chocolate");
		ArrayList<Object> batter = new ArrayList(Arrays.asList(a,b));
		Batters br = new Batters(batter);
		C c = new C("2002","Glazed");
		D d = new D("2003","Maple");
		ArrayList<Object> toppings = new ArrayList(Arrays.asList(c,d));
		Root r = new Root("0001", "donut", "cake", 0.55f, br, toppings);
		ArrayList<Object> mainArr = new ArrayList(Arrays.asList(r));
		om.writeValue(f, mainArr);
		
		System.out.println("done");
	}

}
