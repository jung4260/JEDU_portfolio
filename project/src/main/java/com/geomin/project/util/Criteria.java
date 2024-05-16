package com.geomin.project.util;


import lombok.Data;

@Data
public class Criteria {

	private int page; //페이지번호
	private int amount; //데이터개수

	////////////////////////////////////////
	//검색에 필요한 키워드 추가
	private String levelSelect; //컨텐츠 레벨
	private String searchType;
	private String searchCategory;
	
	public Criteria() {
		this.page = 1;
		this.amount = 4;
	}

	public Criteria(int page, int amount) {
		super();
		this.page = page;
		this.amount = amount;
	}
	
	//sql에 전달될 페이지start getter
	public int getPageStart() {
		return (page - 1) * amount;
	}
}
