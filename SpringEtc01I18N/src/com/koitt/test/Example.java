package com.koitt.test;

import java.io.UnsupportedEncodingException;
import java.util.Locale;

import org.springframework.context.MessageSource;

public class Example {

	private MessageSource messages;

	public void setMessages(MessageSource messages) {
		this.messages = messages;
	}

	public void execute() {
		String message;
		message = this.messages.getMessage("greeting", null, "Hello", Locale.KOREAN);
		String message1 = this.messages.getMessage("argument.required", new Object[] {"Apple"}, "Banana", Locale.KOREAN);

		String messageEn = this.messages.getMessage("greeting", null, "Hello", Locale.ENGLISH);
		String messageEn1 = this.messages.getMessage("argument.required", new Object[] {"Apple", "Bpple"}, "Banana", Locale.ENGLISH);

		System.out.println("kor : " + message);
		System.out.println("kor : " + message1);

		System.out.println("eng : " + messageEn);
		System.out.println("eng : " + messageEn1);




	}

}
