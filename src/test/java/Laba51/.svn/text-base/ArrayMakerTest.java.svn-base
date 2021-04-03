package Laba51;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Laba2.ArrayMaker;

public class ArrayMakerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	Laba2.ArrayMaker abcd = new Laba2.ArrayMaker();
	int[] arrayCheck = ArrayMaker.getArray();
	int[] arrayResult = new int [10];
	assertEquals(arrayCheck.length, arrayResult.length);
	}

	@BeforeClass
	public static void setUp() {
	Laba2.ArrayMaker arrayMaker = new Laba2.ArrayMaker();
	int[] arrayCheck = ArrayMaker.getArray();
	for(int i=0; i < arrayCheck.length; i++) {
	assertNotNull(("Нулевой элемент: " + i), arrayCheck[i]);
	}
	}

	}
