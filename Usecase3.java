class Usecase3
{
	public static void main(String args[])
	{
		int checkno=(int)(Math.floor(Math.random()*10)%3);
		int salary=0, parttime=1, wage_per_hr=20, fulltime=2,emphrs=0;
		if(checkno==fulltime)
		{
			System.out.println("Employee is present fulltime...!");
			emphrs=8;
		}
		else
		{
			if(checkno==parttime)
			{
				System.out.println("Employee is present parttime...!");
				emphrs=4;
			}

			else
			{
				System.out.println("Employee is absent....!");
				emphrs=0;
			}
		}
		 	salary=wage_per_hr*emphrs;
                        System.out.println("Employee salary "+salary);
		
	}
}

