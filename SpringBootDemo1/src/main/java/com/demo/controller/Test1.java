package com.demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//标记为这个类为启动类
//关于启动类放的地方不能隔一个包例如：com.demo.XXX
//原因：当启动器和controller处于平级的情况下无法找到controller组件
@SpringBootApplication
public class Test1 {
	public static void main(String[] args) {
		//第一个参数：当前启动类的模板对象
		//第二个参数：main方法传过来的参数
		SpringApplication.run(Test1.class, args);
	}

}
