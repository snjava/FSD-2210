package com.company.converter;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.company.entity.Answer;

@Service
public class AnswerCoverter {

	public List<Answer> convertAnswerList(List<LinkedHashMap<String, String>> list) {
		List<Answer> ansList = new ArrayList<Answer>();
		
		for(LinkedHashMap<String, String> ans : list) {
			Answer a = new Answer();
			a.setDetails(ans.get("details"));
			a.setCreatedts(ans.get("createdts"));
			a.setStatus(ans.get("status"));
			ansList.add(a);
		}
		
		return ansList;
	}
	
	
}
