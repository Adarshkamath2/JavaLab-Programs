import java.util.*;

class Student{
    Scanner sc = new Scanner(System.in);
    String Name;
    int m[] = new int[3];
    int Total;
    int i,N,ch,high1,high2,high3,highest;

    Student s[] = new Student[20];

    void Read(int N){
        for(int i =0;i<N;i++)
        {
            s[i] = new Student();
            System.out.println("\n----------Details of Student "+(i+1)+"--------------\n");
            System.out.print("Name : ");
            s[i].Name = sc.next();
            System.out.print("Enter the marks of Student in 3 Subjects : ");
            s[i].m[0] = sc.nextInt();
            s[i].m[1] = sc.nextInt();
            s[i].m[2] = sc.nextInt();
        }
    }

    void Display(){
            for(int i = 0;i<N;i++)
            System.out.println(s[i].Name+"\t"+s[i].m[0]+"\t"+s[i].m[1]+"\t"+s[i].m[2]);      
    }
    
    void Total(){
        Total = m[0]+m[1]+m[2];
    }

    void TotalDisplay(){   
        for(int i =0;i<N;i++){
            s[i].Total();
            System.out.println(s[i].Name+"\t"+s[i].m[0]+"\t"+s[i].m[1]+"\t"+s[i].m[2]+"\t"+s[i].Total);
        }
    }

    void SubHigh(int j){
        int sh = 0;
        high1 = s[0].m[j];
        for(int i =0;i<N;i++){
            if(s[i].m[j] > high1){
                high1 = s[i].m[j];
                sh = i;
            }
        }
        System.out.println("Highest mark in Subject " + j +" : "+s[sh].Name);
    }

    void TotalHigh(){
        int ht = 0;
        highest = s[0].Total;
        for(int i = 0;i<N;i++)        {
            if(s[i].Total>highest)           {
                highest = s[i].Total;
                ht = i;
            }
        }
        System.out.print("Student wiht Highest Total : "+ s[ht].Name);
    }
}

public class AnnualExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        Student stud = new Student();
        System.out.print("Number of Students : ");
        int N = sc.nextInt();
        do{
            System.out.println("\nEnter Your Choice \n1.Read\n2.Display\n3.Total\n4.Subject Highset\n6.Total Highest\n6.Exit\n");
            choice = sc.nextInt();

            switch (choice) {
                
                case 1: System.out.println("--------------Student Details---------- ");
                        stud.Read(N);
                        break;
                case 2: System.out.println("Student details are : ");
                        System.out.println("Name\tSub 1\tSub 2\tSub 3");
                        stud.Display();
                        break;
                case 3: System.out.println("Student details are : ");
                        System.out.println("Name\tSub 1\tSub 2\tSub 3\tTotal");
                        stud.TotalDisplay();
                        break;
                case 4: for(int i = 0;i<3;i++)
                            stud.SubHigh(i);
                        break;
                case 5: stud.TotalHigh();break;
                case 6: System.out.println("Exitting Application.......");break;
                default: System.out.println("Invalid choice....");break;
            }
        }while(choice!=6);
        sc.close();
    }    
}
