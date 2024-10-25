package org.deserialization;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.serialization.Batters;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DeSerialization {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		FileReader fr = new FileReader("C:\\Users\\KS\\eclipse-workspace\\JsonAPI\\src\\test\\resources\\deserialization.json");
		ObjectMapper ob = new ObjectMapper();
		SubRoot[] readValue = ob.readValue(fr, SubRoot[].class);
		for(SubRoot result:readValue) {
			Batters1 batters = result.getBatters();
			ArrayList<Object> batter = batters.getBatter();
			Object object = batter.get(0);
			System.out.println(object);
			Map mp = new LinkedHashMap();
			Map mp1 = (Map) object;
			Object type = mp1.get("type");
			if(type.equals("Regular")) {
				System.out.println("Batter is regular");
			}
			else {
				System.out.println(type+" : batter is not as expected flavour");
			}
			
			
			
		}
		
		

		
		
	}

}
