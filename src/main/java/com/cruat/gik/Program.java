package com.cruat.gik;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Program {
	private static final Logger logger = LogManager.getLogger();
	private static final String SOURCE = "src/main/resources/source/sample.json";
	public static void main(String[] args) throws IOException {
		logger.info("Hello World");
		JsonFactory factory = new JsonFactory();
		factory.setCodec(new ObjectMapper());
		File input = new File(SOURCE);
		try(JsonParser jp = factory.createParser(input)){
			Example k = jp.readValueAs(Example.class);
			logger.info(k.getLocations().size());
		}
	}
}
