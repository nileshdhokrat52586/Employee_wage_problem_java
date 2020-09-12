class Usecase5 {
        public static void main(String args[])
        {
                int checkno=(int)(Math.floor(Math.random()*10)%3);
                int salary=0, totalsalary=0, emphrs=0;
                final int FullTime=1, PartTime=2, NoofDays=20, Wage_perhr=20;
                for(int i=0; i<NoofDays; i++)
                {
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
                        totalsalary+=salary;

                }
                System.out.println("Total salary of Employee...!"+totalsalary);
        }
}
