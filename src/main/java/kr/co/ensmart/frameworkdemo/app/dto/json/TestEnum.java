package kr.co.ensmart.frameworkdemo.app.dto.json;

import lombok.Getter;

@Getter
public enum TestEnum {
	TEST_1("tmpTestValue1"),
	TEST_2("tmpTestValue2"),
	;
	
	private String value;
	
	TestEnum(String value) {
		this.value = value;
	}
}
