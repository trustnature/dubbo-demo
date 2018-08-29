package com.test;
import org.springframework.stereotype.Service;

import com.test.DemoService;
@Service("demoService")
public class DemoServiceImpl implements DemoService{

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
        return "Hello " + name;
	}  

}
