
public class twoDArrayPriject
	{

		public static void main(String[] args)
			{
				int[][] myArray =
					{
						{ 3, 5, 9, 2, -1, 8, 13 },
						{ -2, 5, 1, 11, 8, 2, 0 },
						{ 9, 1, -3, 4, 8, 4, 8 },
						{ 6, 0, 0, -1, 4, 12, 7 },
						{ 2, 6, -1, 5, 3, 10, 1 },
						{ 2, 5, 1, 2, 9, 2, 3 },
						{ -3, 1, 1, 4, 11, 12, 4 } 
					};
				
				int maxvalue = Integer.MIN_VALUE;
				int minvalue = Integer.MAX_VALUE;
				
				for (int row = 0; row < myArray.length; row++)
					{
						for (int col = 0; col < myArray[row].length; col++)
							{
								if (myArray[row][col] > maxvalue)
									{
										
										maxvalue = myArray[row][col];
									}
								else if (myArray[row][col] < minvalue)
									{
										minvalue = myArray[row][col];
									}
								
							}
					}
				System.out.println("Your max value is: " + maxvalue);
				System.out.println("Your min value is: " + minvalue);
				
				int sum = 0;
				
				for(int row = 0; row < myArray.length; row++)
					{
						for (int col = 0; col < myArray[row].length; col++)
							{
								sum += myArray[row][col];
							}
					}
				int averageArray = sum / 49;
				System.out.println("The array average is: " + averageArray);
				
				
			}

	}
