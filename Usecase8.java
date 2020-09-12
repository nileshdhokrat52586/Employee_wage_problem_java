class Usecase8 {

 public static final int FullTime=1, PartTime=2;
public void employeewage(String company, int NoofDays,int Wage_perhr,int MaxHrs)
        {
                int salary=0, totalsalary=0, emphrs=0, totalhrs=0, Days=0;
                while(totalhrs < MaxHrs && Days < NoofDays)
                {
                        int checkno=(int)(Math.floor(Math.random()*10)%3);
                        Days+=1;
                        switch(checkno)
                        {
                                case FullTime:
                                        System.out.println("Employee is Full Time...!");
                                        emphrs=8;
                                break;
                                case PartTime:
                                        System.out.println("Employee is part time...!");
                                        emphrs=4;
                                break;
                                default:
                                        System.out.println("Employee is absent...!");
                                break;
                        }

                        salary=Wage_perhr*emphrs;
                        totalhrs+=emphrs;
                        System.out.println("salary of employee on "+Days+"th day is "+salary);
                        totalsalary+=salary;

                }
                System.out.println("Total Employee wage for company "+company+" is "+totalsalary);
        }

public static void main(String args[])
        {
                Usecase8 uc=new Usecase8();
                uc.employeewage("oracle",20,6,50);
		uc.employeewage("infosys",25,8,70);


        }
}
