package com.demo;

import java.util.GregorianCalendar;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class AppConfig {

	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = null;
		EvaluationContext context = null;

		System.out.println("---- Printing a Literal Value ----");
		exp = parser.parseExpression("'Hello World..'");
		System.out.println(exp.getValue()); // Need a explicit Typecast is must

		System.out.println("\n---- String operation on Literal Value ----");
		exp = parser.parseExpression("'Hello World'.concat('!')");
		System.out.println(exp.getValue()); // Need a explicit Typecast is must
		
		exp = parser.parseExpression("'Hello World'.toUpperCase()");
		System.out.println(exp.getValue());
		
		exp = parser.parseExpression("'Hello Wold...'.replace('.','!!')");
		System.out.println(exp.getValue()); // Need a explicit Typecast is must
		
		exp = parser.parseExpression("'Hello World'.bytes.length");
		System.out.println(exp.getValue());
		
		System.out.println("\n---- Explicit Type casting ----");
		exp = parser.parseExpression("'Hello World'.bytes");
		System.out.println((byte[]) exp.getValue());

		System.out.println("\n---- Sending the class type to the Argument");
		exp = parser.parseExpression("'Hello World'.bytes.length");
		System.out.println(exp.getValue(Integer.class));

		System.out.println("\n---- String operation on String Object ----");
		exp = parser.parseExpression("new String('Hello World').toUpperCase()");
		System.out.println(exp.getValue());

		System.out.println("\n---- Passing User defined object to the SPeL using EvaluationContext");
		GregorianCalendar c = new GregorianCalendar();
		c.set(1856, 7, 9);
		// The constructor arguments are name, birthday, and nationality.
		Inventor tesla = new Inventor("Nikola Tesla", c.getTime(), "Serbian");
		exp = parser.parseExpression("country");
		context = new StandardEvaluationContext(tesla);
		String name = (String) exp.getValue(context);
		System.out.println(name);

		System.out.println("\n---- Passing User defined object to the SPeL without using EvaluationContext");
		String name1 = (String) exp.getValue(tesla); // Without using EvaluationContext
		System.out.println(name1);
		
		System.out.println("\n---- Passing User defined object to the SPeL using boolean operator");
		exp = parser.parseExpression("name == 'Nikola TeSla'");
		System.out.println(exp.getValue(context, Boolean.class));
		
		System.out.println("\n---- Manipulating ther List Object ----");
		Simple simple = new Simple();
		simple.booleanList.add(true);
		System.out.println("Old Value : "+simple.booleanList);
		context = new StandardEvaluationContext(simple);
		parser.parseExpression("booleanList[0]").setValue(context,"false");
		System.out.println("New Value : "+simple.booleanList);
				
		
		
		

	}
}
