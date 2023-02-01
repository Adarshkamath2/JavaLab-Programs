//EMPLOYEE PROGRAM

import java.util.*;

class EmployeeDetails{

    int ID;
    String Name,Dept;
    double BasicPay,GrossPay,NetPay;
    Scanner sc = new Scanner(System.in);
    
    void Read(){
        System.out.print("Employee ID : ");
        ID = sc.nextInt();
        System.out.print("Name : ");
        Name  = sc.next();
        System.out.print("Department : ");
        Dept = sc.next();
        System.out.print("Basic Pay : ");
        Dept = sc.next();
    }
    
    void GP(){
        //GIven DA = 58% of Basic Pay, HRA = 16% of Basic Pay
        Double DA,HRA;
        DA = 0.58 * BasicPay;
        HRA = 0.16 * BasicPay;
        GrossPay = BasicPay + DA + HRA;
    }
    
    void NP(){
        EmployeeDetails emp = new EmployeeDetails();
        emp.GP();;
        double Tax;
        double lakhs = 100000;
        if(GrossPay < 2*lakhs)
        Tax = 0;
        else if(GrossPay < 3*lakhs)
        Tax = 0.10 * GrossPay;
        else if(GrossPay < 5*lakhs)
        Tax = 0.15 * GrossPay;
        else //30 % of the Gross Pay, an additional charge of 2% of the tax will be added to total tax
        {
            Tax = 0.30*GrossPay;
            Tax = Tax + 0.02 * Tax;
        }
        NetPay = GrossPay-Tax;
    }
    
    void Display(){
        EmployeeDetails emp = new EmployeeDetails();
        emp.GP();
        emp.NP();
        System.out.println(ID+"\t"+Name+"\t"+Dept+"\t"+BasicPay+"\t"+GrossPay+"\t"+NetPay);
    }      
}

public class Employee{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, choice,N;
        System.out.print("Number Of Employees : ");
        N = sc.nextInt();
        EmployeeDetails E[] = new EmployeeDetails[10];
        
        do{
            System.out.println("\n\n-----------------MAIN MENU--------------\n");
            System.out.println("\n1.Read\n2.Display\n0.Exit\nEnter Your Choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: System.out.println("----------EMPLOYEE DETAILS----------");
                for(i = 0;i<N;i++)
                {
                    E[i] = new EmployeeDetails();
                    System.out.println("\nEMPLOYEE : "+(i+1));
                    E[i].Read();
                }
                break;
                case 2: System.out.println("----------EMPLOYEE DETAILS----------");
                        System.out.println("ID\tName\tDepartment\tBasicPay\tGrossPay\tNetPay");
                        for(i = 0;i<N;i++)
                        {
                            E[i].GP();
                            E[i].NP();
                            E[i].Display();
                        }
                        break;
                case 0 : System.out.println("THANK YOUUUUUUU");break; 
                default: System.out.print("Invalid Choice...");
                    break;
            }
        }while(choice != 0);
        sc.close();
    }
}
