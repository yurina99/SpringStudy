package org.zerock.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@Getter
@Setter
@ToString
@Log4j
public class Criteria {
	
	private int pageNum;
	private int amount;
	private int limitStart;
	
	private String type;
	private String keyword;
	
	public Criteria() {
		this(1,10);
	}

	public Criteria(int pageNum, int amount) {
		log.info("Call criteria...");
		this.pageNum = pageNum;
		this.amount = amount;
		
		this.limitStart = (pageNum-1)*amount;
	}
	
	public String[] getTypeArr() {
		return type == null? new String[] {}: type.split("");
	}

}
