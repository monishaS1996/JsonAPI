package org.jsonapi;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class APIJson {

	public static void main(String[] args) throws IOException, ParseException {

		FileReader fr = new FileReader("C:\\Users\\KS\\eclipse-workspace\\JsonAPI\\src\\test\\resources\\readdata.json");
		JSONParser jp = new JSONParser();
		Object parse = jp.parse(fr);
		JSONObject jo = (JSONObject) parse; 
		Object typekey = jo.get("type");
		String s1 = (String) typekey;
		System.out.println(s1);
		Object namekey = jo.get("name");
		String s2 = (String) namekey;
		System.out.println(s2);
		Object s3 = jo.get("ppu");
		Number n = (Number) s3;
		System.out.println(n);
		Object obj1 = jo.get("batters");
		JSONObject js1 = (JSONObject) obj1;
		Object obj2 = js1.get("batter");
		JSONArray js2 = (JSONArray) obj2;
		Object obj3 = js2.get(0);
		JSONObject js3 = (JSONObject) obj3;
		Object obj4 = js3.get("id");
		String s4 = (String) obj4;
		System.out.println(s4);
		Object obj5 = js3.get("type");
		String js4 = (String) obj5;
		System.out.println(js4);
		Object obj6 = jo.get("topping");
		JSONArray js5 = (JSONArray) obj6;
		Object obj7 = js5.get(2);
		JSONObject js6 = (JSONObject) obj7;
		Object obj8 = js6.get("id");
		String s5 = (String) obj8;
		System.out.println(s5);
		Object obj9 = js6.get("type");
		String s6 = (String) obj9;
		System.out.println(s6);
	}

}
