package com.xworkz.dp;

import com.xworkz.dp.dao.WebSeriesDAO;
import com.xworkz.dp.dto.WebSeriesDTO;

public class WebSeriesStarter {

	public static void main(String[] args) {
		
		WebSeriesDTO weSeriesDTO1=new WebSeriesDTO("whyKings", "24", 3400, 7.4F, 3, 3);

		
		WebSeriesDAO seriesDAO=new WebSeriesDAO();
		seriesDAO.save(weSeriesDTO1);
		System.out.println(weSeriesDTO1);
		
		WebSeriesDTO[] webSeries=seriesDAO.getWebSeriesDAOs();
		if(webSeries!=null) {
		for(int no=0;no<webSeries.length;no++) 
		    {
			System.out.println(webSeries[no]);
			System.out.println( webSeries); 
		    }
	   }
		else {
			System.err.println("0000000000000000000000000000000000");
		}
		

  }
}
