package main.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import main.model.CustomData;

@RestController
public class ManagerController {
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public List<CustomData> data() {
		
		List<CustomData> data = new ArrayList<CustomData>();
		for (int i = 0; i < 3; i++) {
			data.add(new CustomData("Angel","Mencia", "Alfonso XII, Mostoles","689876789", 26));
		}
		return data;
	}
	
//	@RequestMapping(value = "/test", method = RequestMethod.GET)
//	public String getTest() {
//		return "Hello my friend";
//	}

}