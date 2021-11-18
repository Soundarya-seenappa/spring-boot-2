package com.sound.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Laptop {
	
	@Autowired
	@Qualifier("intel")
	private CPU processor;
	public void start() {
		processor.process();
		
	}
	public CPU getProcessor() {
		return processor;
	}
	public void setProcessor(CPU processor) {
		this.processor= processor;
	}

}
