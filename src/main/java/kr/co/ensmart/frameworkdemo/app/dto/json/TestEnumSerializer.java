package kr.co.ensmart.frameworkdemo.app.dto.json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class TestEnumSerializer extends JsonSerializer<TestEnum> {
	@Override
	public void serialize(TestEnum value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		gen.writeString(value.getValue());
	}
}
