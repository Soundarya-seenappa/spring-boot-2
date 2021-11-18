package com.sound.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Intel  implements CPU  {
	
	

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println(".....intel ....");	
	}

}
