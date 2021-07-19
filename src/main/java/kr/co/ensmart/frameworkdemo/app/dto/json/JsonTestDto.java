package kr.co.ensmart.frameworkdemo.app.dto.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonTestDto {
		private int num;

		@JsonSerialize(using = TestEnumSerializer.class) //TestEnumSerializer 구현할 객체
		@JsonDeserialize(using = TestEnumDeserializer.class) //TestEnumDeserializer 구현할 객체
		private TestEnum test;
}
