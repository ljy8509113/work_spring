package com.koitt.service;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.koitt.model.Users;

public class SendMail implements Tasklet {

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/koitt/config/applicationContext.xml");
		
		Users user = new Users("8509113@naver.com", "이정욱");
		
		MailService service = context.getBean(MailService.class);
		service.sendEmail(user);
		
		return RepeatStatus.FINISHED;
	}

	
}
