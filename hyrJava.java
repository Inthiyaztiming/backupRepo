package Tests;

import java.io.IOException;

import org.testng.annotations.Test;

public class hyrJava {

	//public static void testm(int height, String st)- This is the syntax if we want to declare multiple parameters of same datatype or different

	public static int testm(int height) throws IOException {
		return 1 + height;


	}

	@Test
	public void testmtthod() throws IOException {

		System.err.println(testm(100));
		//testm(100,"if we have multiple parameters");
	}

	@Test
	public void testmethoddd() throws IOException {

		System.err.println(testm(200));
		//testm(100,"if we have multiple parameters");
	}


	// Here we are just declaring parameters in testm and passing different values
	// for height parameter from different methods like testmtthod and testmethoddd

	//	The general rules for naming variables are:
	//
	//		Names can contain letters, digits, underscores, and dollar signs
	//		Names must begin with a letter
	//		Names should start with a lowercase letter, and cannot contain whitespace
	//		Names can also begin with $ and _
	//		Names are case-sensitive ("myVar" and "myvar" are different variables)
	//		Reserved words (like Java keywords, such as int or boolean) cannot be used as names

}
