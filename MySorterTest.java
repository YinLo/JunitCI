import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MySorterTest
{
	// test empty set
	private double tc1[][] = { {}, {} };
	// test single element set
	private double tc2[][] = { { 1.0 }, { 1.0 } };
	// test set with incremental order
	private double tc3[][] = { { 1.0, 1.1, 2.0, 2.1, 10.10, 100 },
			{ 1.0, 1.1, 2.0, 2.1, 10.10, 100 } };
	// test set with decremental order
	private double tc4[][] = { { 100, 10.10, 2.1, 2.0, 1.1, 1.0 },
			{ 1.0, 1.1, 2.0, 2.1, 10.10, 100 } };
	// test set with random order
	private double tc5[][] = { { 2.0, 2.1, 1.1, 10.10, 100, 1.0 },
			{ 1.0, 1.1, 2.0, 2.1, 10.10, 100 } };
	// test set with all integer value
	private double tc6[][] = { { 1, 2, 5, 4, 3 }, { 1, 2, 3, 4, 5 } };
	// test set with negative number
	private double tc7[][] = { { 1, 2, -99 }, { 1, 2, -99 } };

	private MySorter sorter;
	
	private void assertArrayEquals (double[] expected, double[] actual)
	{
		assertEquals(expected.length, actual.length);
		for (int i = 0; i < expected.length; i++)
		{
			assertEquals(expected[i], actual[i], 0.0001);
		}
	}
	
	@Before
	public void setUp() throws Exception {
		sorter = new MySorter();
	}

	@After
	public void tearDown() throws Exception {
		sorter = null;
	}
	
	@Test
	public void test1(){
		sorter.sort(tc1[0]);
		assertArrayEquals(tc1[1], tc1[0]);
	}
	
	@Test
	public void test2(){
		sorter.sort(tc2[0]);
		assertArrayEquals(tc2[1], tc2[0]);
	}
	
	@Test
	public void test3(){
		sorter.sort(tc3[0]);
		assertArrayEquals(tc3[1], tc3[0]);
	}
	
	@Test
	public void test4(){
		sorter.sort(tc4[0]);
		assertArrayEquals(tc4[1], tc4[0]);
	}
	
	@Test
	public void test5(){
		sorter.sort(tc5[0]);
		assertArrayEquals(tc5[1], tc5[0]);
	}
	
	@Test
	public void test6(){
		sorter.sort(tc6[0]);
		assertArrayEquals(tc6[1], tc6[0]);
	}
	
	@Test
	public void test7(){
		sorter.sort(tc7[0]);
		assertArrayEquals(tc7[1], tc7[0]);
	}
}
