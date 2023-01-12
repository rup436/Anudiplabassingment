package com.example;

public class PerfectSquare {
		
		private static boolean PerfectSquare(int[]arr) //method
		{
			int psq=0,n=0;
			
			for(int i=0;i<arr.length;i++) // for loop
			{
				psq=(int)Math.sqrt(arr[i]); 
				psq=n*n;
				
				if(psq!=arr[i]) // if statement
				{
					return false;
				}
			}
			
			return true;
		}

		public static void main(String[] args) 
		{
			int[]arr= {16,144,169,224}; //given input
			if( PerfectSquare(arr))  // use if else statement
			{
				System.out.println("The Array is Perfect Square Array.");
			}
			else 
			{
				System.out.println("The Array is no a Perfect Square Array.");
			}

		}

		

	}


