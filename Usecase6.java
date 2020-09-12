class Usecase6 {
        public static void main(String args[])
        {
                int salary=0, totalsalary=0, emphrs=0, totalhrs=0, Days=0;
                final int FullTime=1, PartTime=2, NoofDays=20, Wage_perhr=20, MaxHrs=100;
                while(totalhrs < MaxHrs && Days < NoofDays)
                {
			int checkno=(int)(Math.floor(Math.random()*10)%3);
			Days+=1;
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
			totalhrs+=emphrs;
                        System.out.println("salary of employee on "+Days+"th day is "+salary);
                        totalsalary+=salary;

                }
                System.out.println("Total salary of Employee...!"+totalsalary);
        }
}
