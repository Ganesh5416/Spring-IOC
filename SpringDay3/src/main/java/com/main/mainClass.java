package com.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.ConfigClass;
import com.tka.User;

public class mainClass {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		User u = context.getBean(User.class);
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Select 1 For Airtel:");
		System.out.println("Select 2 For Jio:");
		int num = sc.nextInt();
		if(num==1) {
			System.out.println(u.getSim1().calling());			
		}
		else if (num==2) {
			System.out.println(u.getSim2().calling());
			
		}
		
	}

}
