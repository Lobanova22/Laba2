package Laba5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Laba2.ArrayGenerator;

public class ArrayGeneratorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {

	boolean prov = false;
	double numb = ArrayGenerator.numb();
	if (numb <=76 && numb >= 25) {
	prov = true;
	}
	assertTrue(prov);
	}
	}