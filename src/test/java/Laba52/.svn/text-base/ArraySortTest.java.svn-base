package Laba52;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Laba2.ArraySort;

public class ArraySortTest {

		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
		int [] array = {1,2,7,9,5,6,3,4,10,8};
		int [] sortedArray = {1,2,3,4,5,6,7,8,9,10};
		Laba2.ArraySort nov = new Laba2.ArraySort();
		array = ArraySort.Sort(array);
		assertArrayEquals(array, sortedArray);
		}


		@Before
		public void setUp() throws Exception {
		}

		@Test
		public void test() {
		int [] array = {1,2,7,9,5,6,3,4,10,8};
		int [] sortedArray = {1,2,3,4,5,6,7,8,9,10};
		assertArrayEquals(sortedArray,ArraySort.Sort(array));
		}

		@AfterClass
		public static void secondCheck( ) {
		int [] array = {1,2,7,9,5,6,3,4,10,8};
		int [] sortedArray = {1,2,3,4,5,6,7,8,9,10};
		Laba2.ArraySort nov = new Laba2.ArraySort();
		array = ArraySort.Sort(array);
		assertArrayEquals(array,sortedArray);
		}
		}
