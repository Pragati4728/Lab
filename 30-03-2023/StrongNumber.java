class StrongNumber{
	public static void main(String[]args){
		for(int i=1;i<=100;i++)
		{
			int num=i;
			int sum=0;
			while(num>0)
			{
				int digit=num%10;
				sum+=factorial(digit);
				num/=10;
			}
			if(i==sum)
			{
				 System.out.println(i + " is a Strong number");
			}
		}
	}
  public static int factorial(int n) {
	int fact=1;
	for(int i=1;i<n;i++)
	{
		fact*=i;
	}
	return fact;

		
		}
		
}
