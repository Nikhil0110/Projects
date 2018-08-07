package com.testersconnect.qm;

import java.io.IOException;
import java.util.Scanner;

public class QuizMakerMain {

	static int score=0;
	static int verbalScore=0;
	static int sportsScore=0;
	static int analyticalScore=0;
	static int programmingScore=0;
	//public static Item[] qItems=new Item[13];
	
	public static void main(String[] args) throws IOException {
		QuizLoader ql=new QuizLoader();
		
		Item[] qItems=ql.loadQuestions( System.getProperty("user.dir")+"//Questions//questions.csv");
		
		for(int j=0;j<=qItems.length-1;j++)
		{
		//Print each question
		 Scanner sc=new Scanner(System.in);  
	     System.out.println(qItems[j].qid+") "+qItems[j].question);
	     System.out.println("Options: a) "+qItems[j].options[0]+" b) "+qItems[j].options[1]+" c) "+qItems[j].options[2]+" d) "+qItems[j].options[3]);
	     
		//Get the answer from the user
	     String userAns=sc.next();
	     if(userAns.equals(qItems[j].ans)) {
	 		//update the score
	    	 score=score+10;
	    	 switch(qItems[j].category)
	    	 {
	    	 case "Verbal": 
	    		 verbalScore+=10;
	    		 break;
	    	 case "Programming":
	    		 programmingScore+=10;
	    		 break;
	    	 case "Sports":
	    		 sportsScore+=10;
	    		 break;
	    	 case "Analytical":
	    		 analyticalScore+=10;
	    		 break;
	    		 
	    		 
	    	 }
	     }
		
		//display the live score
	     System.out.println("Your Score is "+score);
		}
		
	     System.out.println("Sports score is "+sportsScore);
	     System.out.println("Verbal Score is "+verbalScore);
	     System.out.println("Analytical Score is "+analyticalScore);
	     System.out.println("programming Score is "+programmingScore);

		
		

	     
	     //Display Score Category wise
		
		
	}
	
	
}
