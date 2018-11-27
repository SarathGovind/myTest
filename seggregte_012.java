public class seggregte_012
{
	public static void main(String args[])
	{
	int []a =new int[]{1,0,0,1,2,2,0,0,1,2,0,0};
	int low=0,mid=0;
	int high=(a.length)-1;
	int temp;
	//System.out.println(high);
	while(mid<=high)
		{
		switch (a[mid])
			{
			case 0 :
			temp=a[low];
			a[low]=a[mid];
			a[mid]=temp;
			mid++;
			low++;
			break;
			
			case 1 :
			mid++;
			break;

			case 2 :
		//	swap(a[mid],a[high]);
			temp=a[mid];
			a[mid]=a[high];
			a[high]=temp;
			//mid++;
			high--;
			break;
			}
		}
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]);
		}
	        /*void swap(int a[],int b[])
		{
		
		}*/
	}
/*	public void swap(int a,int b)
	{
	}*/
}
