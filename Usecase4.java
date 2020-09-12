class Usecase4
{
	public static void main(String args[])
	{
		int checkno=(int)(Math.floor(Math.random()*10)%3);
		int salary=0,emphrs=0;
		final int FullTime=1, PartTime=2, Wage_perhr=20;

		switch(checkno)
		{
			case FullTime:
				System.out.println("Employee is Full Time....!");
				emphrs=8;
			break;
			case PartTime:
				System.out.println("Employee is part time...!");
				emphrs=4;
			break;
			default:
				System.out.println("Employee is absent..!");
			break;
		}
		salary=Wage_perhr*emphrs;
		System.out.println("salary of employee is.."+salary);
	}
}
