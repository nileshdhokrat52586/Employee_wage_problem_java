class Usecase2
{
	public static void main(String args[])
	{
		int checkno=(int)(Math.floor(Math.random()*10)%2);
		int salary=0, present=1, wage_per_hr=20, full_day=8;
		if(checkno==present)
		{
			System.out.println("Employee is present...!");
			salary=wage_per_hr*full_day;
			System.out.println("Employee salary "+salary);
		}
		else
		{
			System.out.println("Employee is absent....!");
			System.out.println("Employee salary "+salary);
		}
	}
}

