package com.koitt.valid;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ValidController {
	
	@RequestMapping(value="/customer.do", method=RequestMethod.GET)
	public String customer(@Valid Customer customer, Errors err) {
		if(err.hasErrors()) {
			System.out.println("유효성 검증 오류 발생");
			for(ObjectError object : err.getAllErrors()) {
				System.out.println(object.getObjectName() + ":" + object.getDefaultMessage());
			}
			
			return "error";
		}
		
		System.out.println(customer);
		return "customer";
	}
}
