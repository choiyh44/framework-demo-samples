package kr.co.ensmart.frameworkdemo.app.dto.json;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

class JsonTest {

	@Test
	public void serializerTest() throws IOException {
		JsonTestDto model = new JsonTestDto(1, TestEnum.TEST_1);
		Assertions.assertEquals("{\"num\":1,\"test\":\"tmpTestValue1\"}", new ObjectMapper().writeValueAsString(model));
	}

	@Test
	public void deserializerTest() throws IOException {
		String json = "{\"num\":1, \"test\":\"tmpTestValue1\"}";

		JsonTestDto model = new ObjectMapper().readValue(json, JsonTestDto.class);

		Assertions.assertEquals(1, model.getNum());
		Assertions.assertEquals(TestEnum.TEST_1, model.getTest());
	}
	
}
