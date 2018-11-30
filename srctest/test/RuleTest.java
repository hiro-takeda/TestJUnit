package test;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;

public class RuleTest {

	@Rule
	public ThreadRule r = new ThreadRule(100);

	@Test
	public void test1() {
		Sample sample = new Sample();
		String retValue = sample.appendComma("abc");
		assertEquals("abc", retValue);
		System.out.println(Thread.currentThread().toString() + " test1");
	}

	@Test
	public void test2() {
		System.out.println(Thread.currentThread().toString() + " test2");
	}
}
