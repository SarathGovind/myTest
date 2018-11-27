public class seggregate_posi_nega{

	public static void main(String args[]){
	int []a=new int[]{2,-1,-4,4,5,7,-8,0,-10};
	int low=0;
	int high=a.length-1;
	int temp,k=0;
	while(low<=high)
	{
		if(a[low] <0)
		{
		a[k]=a[low];
		k++;
		low++;
		}
		else
		{
		a[high]=a[low];
		high--;
		low++;
		}
	low++;

	}
	for(int i=0;i<a.length;i++)
	{
	System.out.print(a[i]);
	}
}
}
