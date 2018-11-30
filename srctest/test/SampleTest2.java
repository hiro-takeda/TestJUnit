package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleTest2 {
	@Test
	public void testNum() {
		assertEquals(10, Sample2.num());
		assertEquals("10じゃない!!", 10, Sample2.num() );
	}
}
