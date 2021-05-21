class Search
{
	static int lsearch(int a[],int x)
	{
		int n = a.length;
		for(int i=0;i<n;i++)
		{
			if(a[i]==x)
				return i;
		}
		return -1;
	}
	static int bsearch(int a[],int s,int e,int x)
	{
		int m;
		if(e>=s)
		{
			m = (s+e)/2;
			if(a[m]==x)
				return m;
			if(a[m]>x)
				return bsearch(a,s,m-1,x);
			return bsearch(a,m+1,e,x);
		}
		return -1;	
	}
	public static void main(String args[])
	{
		System.out.println("\t\tLINEAR SEARCH AND BINARY SEARCH");
		int ar[]={2,3,4,10,40};
		int x=10;
		int r = lsearch(ar,x);
		if(r==-1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at index "+r);
		int arr[]={2,3,4,10,40};
		int y = 40;
		int s = bsearch(arr,0,4,y);
		if(s==-1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at index "+s);
		
	}
}