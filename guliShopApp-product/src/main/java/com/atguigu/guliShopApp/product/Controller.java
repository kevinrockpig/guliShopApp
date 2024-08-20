package com.atguigu.guliShopApp.product;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	
	public static void main(String[] args) {
		
	}
	
	@RequestMapping("/")
	public String hello() {
		return "HELL WORLD!!!";
	}

}
