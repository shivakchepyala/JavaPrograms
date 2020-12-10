package array;

public class SortingArrayElements {

	public static void main(String[] args) {

		int[] arrayList = {11, 9, 12, 56, 12, 66, 5, 45, -1};
		// Original -> random
		// Excepted -> ascending 

		int arrayLength = arrayList.length;		

		for(int i=0; i<=arrayLength-1; i++)
		{
			for(int j=i+1; j<=arrayLength-1;j++)
			{
				if(arrayList[i]>arrayList[j])
				{
					int temp=0;
					temp = arrayList[i];
					arrayList[i]=arrayList[j];
					arrayList[j]=temp;
				}
			}
			System.out.print(arrayList[i]+" ");
		}
		System.out.println("\n");
	}

}
