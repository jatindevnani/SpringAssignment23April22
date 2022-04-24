package com.DrawShapes;

import java.util.Timer;
import java.util.TimerTask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		//Getting the shape
		DrawShape drawer = context.getBean(DrawShape.class, "drawShape");
		drawer.go();

	}
}