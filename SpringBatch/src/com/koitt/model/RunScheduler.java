package com.koitt.model;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/*
 *  spring-task-scheduler.xml의 scheduled 앨리먼트의 ref에 해당하는
 *  빈 객체를 생성하기 위해 아래와 같이 @Component 애노테이션을 사용한다.
 *  @Component에 명시적으로 빈 이름을 설정하지 않으면
 *  클래스명 맨 앞 문자만 소문자로 바뀐 빈 이름을 사용하게 된다.
 */
@Component	
public class RunScheduler {
	
	@Scheduled(cron="1 * * * * *")
	public void run01() {
		try {
			ApplicationContext context = 
					new ClassPathXmlApplicationContext("com/koitt/config/applicationContext.xml");

			JobLauncher launcher = context.getBean(JobLauncher.class);
			Job job = context.getBean("mySqlToCvsJob", Job.class);

			try {
				JobExecution execution = launcher.run(job, new JobParameters());
				System.out.println("종료 상태: " + execution.getStatus());
				System.out.println("종료 상태: " + execution.getAllFailureExceptions());

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			System.out.println("작업 완료!");
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
//	@Scheduled(cron="*/1 * * ? * *")
//	public void run02() {
//		System.out.println("테스트 2 ..." + new Date());
//	}
//	
//	@Scheduled(cron="*/1 * * ? * *")
//	public void run03() {
//		System.out.println("테스트 3 ..." + new Date());
//	}
	
}
