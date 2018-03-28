package com.koitt.junit;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class JUnitTestUsingSet {
	static Set<JUnitTestUsingSet> testObjects = new HashSet<JUnitTestUsingSet>();
	
	@Test public void test1() {
		assertThat(testObjects, not(hasItem(this)));
		
		testObjects.add(this);
	}
	
	@Test public void test2() {
		assertThat(testObjects, not(hasItem(this)));
		testObjects.add(this);
	}
	
	@Test public void test3() {
		assertThat(testObjects, not(hasItem(this)));
		testObjects.add(this);
	}
	
}
