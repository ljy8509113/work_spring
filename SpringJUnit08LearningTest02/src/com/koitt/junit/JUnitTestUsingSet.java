package com.koitt.junit;

import static org.hamcrest.CoreMatchers.either;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/com/koitt/junit/config.xml")
public class JUnitTestUsingSet {
	@Autowired
	private ApplicationContext context;
	static Set<ApplicationContext> contextObject = new HashSet<ApplicationContext>();
	
	@Test public void test1() {
		assertThat(contextObject, not(hasItem(context)));
		contextObject.add(context);
		System.out.println(contextObject.size());
	}
	
	@Test public void test2() {
		assertThat(contextObject, not(hasItem(context)));
		contextObject.add(context);
		System.out.println(contextObject.size());
	}
	
	@Test public void test3() {
		assertThat(contextObject, not(hasItem(context)));
		contextObject.add(context);
		System.out.println(contextObject.size());
	}
	
}
