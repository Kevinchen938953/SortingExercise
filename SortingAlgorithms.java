public class SortingAlgorithms
{
	private int[] nums = new int[100];
	public SortingAlgorithms()
	{
		
	}
	public void bubbleSort()
	{
		int temp=0;
		for(int i=0; i<nums.length; i++)
		{
			for(int x=0; x<nums.length-1; x++)//Loops through by n squared
			{
				if(nums[x]>nums[x+1]; //if the left hand number is greater than the right hand number
				{
					temp = nums[x];//temp holds value of the value at position x;
					nums[x] = nums[x+1];//left hand number's position is taken by the smaller right hand value;
					nums[x+1] = temp;//Right hand position taken over by the larger left hand value.
				}
			}
		}
	 }
	 public void insertionSort()
	 {
		 for(int i=1; i<nums.length-1; i++)//we assume first value is already sorted.
		 {
			 int tTemp = nums[i];//tTemp takes value of value at position i;
			 int y = i; //int y is set to incrementing i value;
			 while(y>0 && nums[y-1]>tTemp)//while y does not reach 0 and the left hand sorted value is less than the temporary value
			 {
				 nums[y]= nums[y-1];//the greater value at y-1 is shifted one space to the right.
				 y--;//continue this process until a sorted value is greater than the value at index i;
		     }
		     nums[y] = tTemp;//leave value as is if an unsorted value is right next to the value it is less than. 
		  }
	 }
	 public void selectionSort()
	 {
		 for(x=0; x<nums.length-1; x++){//loops through values from 0 to second to last value in array
		 int min = x;//minimum variable is set to x;
			for(int y=1; y<n; y++)//values from one to end of array are candidates to be compared
			{
				if(nums[y]<nums[min])//loops through the array to find the smallest number
				{
					min = y;//get position of smallest number
				}
				int temp = nums[x];//temp takes value of wherever x is
				nums[x] = nums[min];//that space takes the position of the smallest number
				nums[min] = temp;//the greater number takes place of the smallest number's original position
			}
		}
	}
}
			 
			 
		 
			 
		 
		
