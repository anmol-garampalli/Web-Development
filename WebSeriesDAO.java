package com.xworkz.dp.dao;

import com.xworkz.dp.dto.WebSeriesDTO;

public class WebSeriesDAO {

	private WebSeriesDTO[] webSeriesDAOs=new WebSeriesDTO[25];
	private int pai=0;
	
	public WebSeriesDTO[] getWebSeriesDAOs() {
		return webSeriesDAOs;
	}
	
	public void save(WebSeriesDTO series) {

		if(pai<webSeriesDAOs.length && series!=null) {
			
			this.webSeriesDAOs[this.pai]=series;
			pai++;
			System.out.println("Web series ".concat(String.valueOf(series)).concat(" is saved"));
			
		}
		else {
			System.err.println("the index is full or you are passing null to index");
		}
			

	}
	
	
}
