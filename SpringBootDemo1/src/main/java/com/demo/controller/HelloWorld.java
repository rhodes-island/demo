package com.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {
	//将url与方法绑定
	@RequestMapping("hello")
	//由于我们现在返回对象需要做json处理
	//需要对应的json包
	@ResponseBody
	public Map<String,Object> hello(){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("msg", "HelloWorld");
		return map;
	}
}
