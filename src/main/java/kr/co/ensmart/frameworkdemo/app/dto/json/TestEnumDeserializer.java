package kr.co.ensmart.frameworkdemo.app.dto.json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class TestEnumDeserializer extends JsonDeserializer<TestEnum> {

	@Override
	public TestEnum deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		for (TestEnum value : TestEnum.values()) {
			if (value.getValue().equals(p.getText())) {
				return value;
			}
		}

		return null;
	}
}
