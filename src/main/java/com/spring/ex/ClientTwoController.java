package com.spring.ex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientTwoController {

	@Value("${wishes}")
	private String wishes;

	@RequestMapping("/")
	public @ResponseBody String getWish() {
		String[] wishesArray = wishes.split(",");
		int i = (int) Math.round(Math.random() * (wishesArray.length - 1));
		return wishesArray[i];
	}

}
