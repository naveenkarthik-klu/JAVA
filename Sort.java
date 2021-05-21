class Sort
{
	void bubbleSort(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n-1; i++)
			for (int j = 0; j < n-i-1; j++)
				if (arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
		printArray(arr);		
	}

	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[])
	{
		Sort ob = new Sort();
		System.out.println("\t\tBUBBLE SORTING");
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
		System.out.println("Sorted array");
		ob.bubbleSort(arr);
		//ob.printArray(arr);
	}
}