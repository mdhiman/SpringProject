package com.example.pathology;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pathology.Disease;
import com.example.pathology.DiseaseList;

@RestController
@RequestMapping("/pathology")
public class PathologyResource {

	public PathologyResource() {
		// TODO Auto-generated constructor stub
	}
	
	List<Disease> diseases = Arrays.asList(
			new Disease("D1","Astama","Warm Water Bath"),
			new Disease("D2","Covid","Warm Water Vapour"),
			new Disease("D3","BackAche","Apply Pain clear"));
	
	@RequestMapping("/diseases")
	public DiseaseList getEmployees() {
		DiseaseList diseaseList = new DiseaseList();
		diseaseList.setPathologyList(diseases);
		return diseaseList;
	}
	
	@RequestMapping("/diseases/{id}")
	public Disease getEmployeeId(@PathVariable("id") String Id) {
		Disease disease = diseases.stream().
						filter(dis->Id.equals(dis.getId()))
						.findAny().orElse(null);
		return disease;
	}

}
