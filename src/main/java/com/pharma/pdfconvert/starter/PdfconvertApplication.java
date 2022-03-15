package com.pharma.pdfconvert.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.pharma.pdfconvert"})
public class PdfconvertApplication  {

	//The main class is defined as InitProcess
	public static void main(String[] args) {
		SpringApplication.run(PdfconvertApplication.class, args);
	}

}
