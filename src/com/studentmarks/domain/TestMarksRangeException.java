package com.studentmarks.domain;

import java.util.Scanner;

public class TestMarksRangeException 
{

	public static void main(String[] args) //throws MarksRangeException 
	{
		TestMarksRangeException tm = new TestMarksRangeException();
		
		 
	
	try {
		int number=
				tm.read();
		tm.validate(number);
	} catch (MarksRangeException e) {
		System.out.println("marks must be between 0 and 100");
		System.out.println("Exception Message: "+e.getMessage());
		
	}
	
	catch(NumberFormatException ne)
	{    
		System.out.println("You must enter a number for the marks!");
		tm.read();
		
	}
//	finally{
//	number = 
//		tm.read();
//	 tm.validate(number);
//
//	}
		 
	
	}
	
	public int read()
	{    int marks=0;
		Scanner readInput = new Scanner(System.in);
		 System.out.println("do u want to enter more marks");
		 String input = readInput.next();
		 
		try{
		  marks = Integer.parseInt(input);
		 
		}
		catch(NumberFormatException ne)
		{    
			throw new NumberFormatException("You must enter a number for the marks!");
			
		}
		
		return marks;	
	}
	
	
	public void validate(int number) throws MarksRangeException
	{
        
		//try{
			MarksRangeException me;
			if(number>100||number<0){
				me = new MarksRangeException("error occured");	
				throw me;
			//System.out.println("error occured");
		//int number = Integer.parseInt(line);
			}
			
		}
//		catch(MarksRangeException e)
//		{
//			System.out.println("marks must be between 0 and 100");
//			System.out.println("Exception Message: "+e.getMessage());
//			
//	    }
//		
//		catch(NumberFormatException ne)
//		{
//			System.out.println("You must enter a number for the marks!");
//		}
//		finally{
//			 
//
//		}
//		
		
		
	}

