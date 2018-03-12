package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class AppConfig {

	public static void main(String[] args) {

		ExpressionParser parser = new SpelExpressionParser();
		StandardEvaluationContext context = new StandardEvaluationContext();
		/** Literal expressions */

		String stringValue = (String) parser.parseExpression("'Hello world'").getValue();
		Double doulbeValue = (Double) parser.parseExpression("6.0221415E+23").getValue();
		int intValue = (Integer) parser.parseExpression("12").getValue();
		boolean booleanValue = (boolean) parser.parseExpression("true").getValue();
		Object nullValue = parser.parseExpression("null").getValue();

		/** Properties, Arrays, Lists, Maps, Indexers */
		Sample sample = new Sample();
		sample.setDataOne("User Object Value....");
		String objectDirectValue = (String) parser.parseExpression("dataOne").getValue(sample);
		System.out.println("objectDirectValue : " + objectDirectValue);

		StandardEvaluationContext spelContext = new StandardEvaluationContext(sample);
		String objectConextValue = (String) parser.parseExpression("dataOne").getValue(spelContext);
		System.out.println("objectConextValue : " + objectConextValue);

		List<String> listData = new ArrayList<String>();
		listData.add("1");
		listData.add("2");
		listData.add("3");
		sample.setDataList(listData);

		String listValue = (String) parser.parseExpression("dataList[2]").getValue(sample);
		System.out.println("listValue One: " + listValue);

		sample.getDataList().add("4");
		listValue = (String) parser.parseExpression("dataList[3]").getValue(sample);
		System.out.println("listValue Two: " + listValue);

		listValue = (String) parser.parseExpression("personList[0].name").getValue(sample);
		System.out.println("list Property Value : " + listValue);

		parser.parseExpression("personList[0].name").setValue(sample, "Suresh");
		listValue = (String) parser.parseExpression("personList[0].name").getValue(sample);
		System.out.println("Modify list Property Value : " + listValue);

		Map<String, String> mapData = new HashMap<String, String>();
		mapData.put("1", "XXXX");
		mapData.put("3", "YYY");
		sample.setDataMap(mapData);

		String mapValue = (String) parser.parseExpression("dataMap['0']").getValue(sample);
		System.out.println("Map Value One : " + mapValue);
		mapValue = (String) parser.parseExpression("dataMap['1']").getValue(sample);
		System.out.println("Map Value Two : " + mapValue);
		sample.getDataMap().put("6", "Ani");
		mapValue = (String) parser.parseExpression("dataMap['6']").getValue(spelContext);
		System.out.println("Map Value Three : " + mapValue);

		/** Inline lists */
		List inlineList = (List) parser.parseExpression("{'anish','suresh','sindhu'}").getValue();
		System.out.println("Inline List : " + inlineList);
		List inlineListOfList = (List) parser.parseExpression("{{'1','2'},{'3','4'}}").getValue();
		System.out.println("Inline List Of List : " + inlineListOfList);
		System.out.println("Inline List Of particular List : " + inlineListOfList.get(0));

		/** Inline Maps */
		Map inlineMap = (Map) parser.parseExpression("{name:'suresh',age:'26'}").getValue();
		System.out.println("Inline Map: " + inlineMap);
		Map inlineMapOfMap = (Map) parser.parseExpression("{dateOne:{name:'xx',age:'20'},dateTwo:{name:'yy',age:'20'}}")
				.getValue();
		System.out.println("Inline Map of Map : " + inlineMapOfMap);
		System.out.println("Inline Map of particular Map : " + inlineMapOfMap.get("dateTwo"));

		/** Array construction */
		int[] inlineArray = (int[]) parser.parseExpression("new int[5]").getValue();
		System.out.println("Inline Single Dimensional Declaration : " + inlineArray);
		inlineArray = (int[]) parser.parseExpression("new int[]{2,3,2}").getValue();
		System.out.println("Inline Single Dimensional Initialiation : " + inlineArray.length);
		int[][] inlineArrays = (int[][]) parser.parseExpression("new int[5][3]").getValue();
		System.out.println("Inline multiple Dimensional Initialiation : " + inlineArrays);
		// inlineArrays = (int[][])parser.parseExpression("new
		// int[][]{{1,2},{3,2}}").getValue();
		// System.out.println("Inline multiple Dimensional Initialiation :
		// "+inlineArrays);

		/** Methods */
		String customMethod = (String) parser.parseExpression("check('')").getValue(spelContext);
		System.out.println("Custom Method One : " + customMethod);
		customMethod = (String) parser.parseExpression("check('Ha')").getValue(sample);
		System.out.println("Custom Method Two : " + customMethod);

		/** Operators -Relational */
		boolean relationalOpers = parser.parseExpression("2<0").getValue(Boolean.class);
		System.out.println("Relation Operation One : " + relationalOpers);
		relationalOpers = parser.parseExpression("'block' > 'black'").getValue(Boolean.class);
		System.out.println("Relation Operation Two : " + relationalOpers);
		relationalOpers = parser.parseExpression("'xyz' instanceof T(Integer)").getValue(Boolean.class);
		System.out.println("Relation Operation Three : " + relationalOpers);
		relationalOpers = parser.parseExpression("'5.00' matches '\\^-?\\d+(\\.\\d{2})?$'").getValue(Boolean.class);
		System.out.println("Relation Operation Four : " + relationalOpers);

		/** Operators -Logical */
		boolean logicalOpers = parser.parseExpression("true or false").getValue(Boolean.class);
		System.out.println("OR Operator : " + logicalOpers);
		logicalOpers = parser.parseExpression("true AND false").getValue(Boolean.class);
		System.out.println("AND Operator : " + logicalOpers);
		logicalOpers = parser.parseExpression("!true or false").getValue(Boolean.class);
		System.out.println("NOT Operator : " + logicalOpers);
		logicalOpers = parser.parseExpression("check('Ha') == 'valid'").getValue(spelContext, Boolean.class);
		System.out.println("Operator Method Calling : " + logicalOpers);

		/** Operators -Mathematical */
		int two = parser.parseExpression("1 + 1").getValue(Integer.class);
		System.out.println("Numerical Operation " + two);
		String testString = parser.parseExpression("'test' + ' ' + 'string'").getValue(String.class);
		System.out.println("Concat Operation " + testString);

		/** Operators - Ternary (If-Then-Else) */
		String ternaryOpers = parser.parseExpression("false ? 'true' : 'false'").getValue(String.class);
		System.out.println("Ternary Condition : " + ternaryOpers);

		/** Constructors */
		Sample constructorCall = parser.parseExpression("new com.demo.Sample()").getValue(Sample.class);
		System.out.println("Constructor Call or Object Creation : " + constructorCall);

		/** Variables */
		System.out.println("Before Cahnge the Varibale Value : " + sample.dataOne);
		spelContext.setVariable("sampleData", "Ojebt");
		parser.parseExpression("dataOne = #sampleData").getValue(spelContext);
		System.out.println("After Cahnge the Varibale Value : " + sample.dataOne);

		List<Integer> primes = new ArrayList<Integer>();
		primes.addAll(Arrays.asList(2, 3, 5, 7, 11, 13, 17));
		context.setVariable("primes", primes);
		List<Integer> primesGreaterThanTen = (List<Integer>) parser.parseExpression("#primes.?[#this>10]")
				.getValue(context);
		System.out.println("use of #this and #root : " + primesGreaterThanTen);

		/** Collection Selection (?)*/
		List<Person> personList = sample.getPersonList();
		System.out.println("\n Before Filter the List : "+personList);
		personList = (List<Person>) parser.parseExpression("personList.?[name == 'Y']").getValue(spelContext);
		System.out.println("\n After Filter the List : "+personList);
		
		System.out.println("\n Before Filter the Map : "+sample.getDataMap());
		System.out.println("\n After Filter the Map(Value) : "+parser.parseExpression("getDataMap().?[value=='YYY']").getValue(spelContext));
		System.out.println("\n After Filter the Map(Key) : "+parser.parseExpression("getDataMap().?[key=='1']").getValue(spelContext));
		
		
		
		
	}

}
