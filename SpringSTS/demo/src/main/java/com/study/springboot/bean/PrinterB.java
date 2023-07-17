package com.study.springboot.bean;

import org.springframework.stereotype.Component;

@Component("printB")
public class PrinterB implements Printer {

	@Override
	public void print(String message) {
		System.out.println("PrinterB �� : " + message);
	}

}
