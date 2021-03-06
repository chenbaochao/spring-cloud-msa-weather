package com.syy.spring.cloud.weather.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syy.spring.cloud.weather.demo.service.CityClient;

/**
* @author 作者：shenyuanyuan E-mail:
* @version 创建时间：2018年3月21日 上午10:20:43
* 类说明
*/
@RestController
public class CityController {
	@Autowired
	private CityClient cityClient;
	
	@GetMapping("/cities")
	public String getCityLists() {
		return cityClient.cityLists();
	}
	@GetMapping("/ss")
	public String getCityLists1() {
		return "aaa";
	}
}
