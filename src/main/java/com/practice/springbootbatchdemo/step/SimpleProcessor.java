package com.practice.springbootbatchdemo.step;

import org.springframework.batch.item.ItemProcessor;

public class SimpleProcessor implements ItemProcessor<String, String> {

	@Override
	public String process(String data) throws Exception {
		System.out.println("process for " + data);
		return data.toUpperCase();
	}

}
