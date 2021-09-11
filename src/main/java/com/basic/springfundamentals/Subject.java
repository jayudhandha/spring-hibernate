package com.basic.springfundamentals;

import org.springframework.stereotype.Component;

@Component
public class Subject {
	private int subCode;
	private String name;

	public int getSubCode() {
		return subCode;
	}

	public void setSubCode(int subCode) {
		this.subCode = subCode;
	}

	public String getName() {
		return "ICT";
	}

	public void setName(String name) {
		this.name = name;
	}

}
