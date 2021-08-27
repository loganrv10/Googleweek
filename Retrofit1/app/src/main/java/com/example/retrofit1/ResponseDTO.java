package com.example.retrofit1;

import java.util.List;
import java.io.Serializable;

public class 	ResponseDTO implements Serializable {
	private List<NewsDTO> news;

	public void setNews(List<NewsDTO> news){
		this.news = news;
	}

	public List<NewsDTO> getNews(){
		return news;
	}

	@Override
 	public String toString(){
		return 
			"ResponseDTO{" + 
			"news = '" + news + '\'' + 
			"}";
		}
}