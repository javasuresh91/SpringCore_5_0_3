package com.demo.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppDiCollection {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config_collection.xml");
		System.out.println(".....................Loading Completed..................");
		
		CollectionBasedInjection collectionBean =  (CollectionBasedInjection) context.getBean("collectionBean");
		System.out.print("Email Details :"+collectionBean.getEmailDetails().getProperty("to"));
		System.out.print(" "+collectionBean.getEmailDetails().getProperty("from"));
		System.out.println(" "+collectionBean.getEmailDetails().getProperty("content"));
		
		System.out.println("Collection List : "+collectionBean.getListObject());
		System.out.println("Collection Map : "+collectionBean.getMapObject());
		System.out.println("Collection Set : "+collectionBean.getSetObject());
		
		System.out.println("\n Merging Collection Values of Two Beans\n");
		
		CollectionBasedInjection mergingCollection =  (CollectionBasedInjection) context.getBean("mergingCollection");
		System.out.print("Email Details :"+mergingCollection.getEmailDetails().getProperty("to"));
		System.out.print(" "+mergingCollection.getEmailDetails().getProperty("from"));
		System.out.print(" "+mergingCollection.getEmailDetails().getProperty("content"));
		System.out.println(" "+mergingCollection.getEmailDetails().getProperty("date"));
		
		System.out.println("Collection List : "+mergingCollection.getListObject());
		System.out.println("Collection Map : "+mergingCollection.getMapObject());
		System.out.println("Collection Set : "+mergingCollection.getSetObject());
		
		
		
	}

}
