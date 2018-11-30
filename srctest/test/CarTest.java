package test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CarTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@After
	public void cleanUpStreams() {
		System.setOut(System.out);
	}

	@Test
	public void oilingTest() {
		Car c = new Car();

		//値をセット
		c.carName = "テスト車";

		// oiling()メソッドを実行
		c.oiling();

		//期待値を設定
		final String expected = "テスト車は、ガソリンスタンドで給油した。" + System.lineSeparator();

		//実数の値を取得
		final String actual = outContent.toString();

		// assertEqualsで判定
		assertEquals(expected, actual);
	}

	@Test
	public void distanceTest() {
		Car c = new Car();
		StringBuilder sb = new StringBuilder();
		//改行
		String ln = System.lineSeparator();

		//値をセット
		int km = 100;
		c.fuel = 60;
		// distance()メソッドを実行
		c.distance(km);

		//期待値を設定
		sb.append("100km走って、10Lのガソリンを消費した。");
		sb.append(ln);
		sb.append("残りの燃料は50Lです。");
		sb.append(ln);
		final String expected = sb.toString();

		// 実際の値を取得
		final String actual = outContent.toString();

		// assertThatで判定
		assertThat(actual, is(expected));
	}

}
