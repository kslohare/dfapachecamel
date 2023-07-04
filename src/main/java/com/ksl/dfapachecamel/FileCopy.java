package com.ksl.dfapachecamel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileCopy extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("file:///home/ksl/temp").log("Header: ${headers}").log("Body: ${body}")
		.to("file:///home/ksl/temp/processed");
		
	}

}
