import java.util.*;
class BookDetails{

    String title;
    int id;
    float UnitPrice,TotalPrice;
    int Quantity;
    int i;
    Scanner sc = new Scanner(System.in);
    
    int ReadNumber(){
        int a;
        System.out.print("Number Of Books : ");
        a = sc.nextInt();
        return a;
    }
    int n = ReadNumber();
    BookDetails B[] = new BookDetails[n];
    void Read(){
        for(i = 0;i<n;i++){
            B[i] = new BookDetails();
            System.out.print("Title : ");
            B[i].title = sc.next();
            System.out.print("Book ID : ");
            B[i].id = sc.nextInt();
            System.out.print("Unit Price : ");
            B[i].UnitPrice = sc.nextFloat();
            System.out.print("Quantity : ");
            B[i].Quantity = sc.nextInt();
        }
    }

    void TotPrice(){
        TotalPrice = UnitPrice* Quantity;
    }

    void Display(){
        for(i= 0;i<n;i++){
            B[i].TotPrice();
            System.out.println("\n| "+B[i].title+"|\t"+B[i].id+"|\t"+B[i].UnitPrice+"|\t"+B[i].Quantity+"|\t"+B[i].TotalPrice+"|");
        }
    }
}

public class Book{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookDetails book = new BookDetails();
        int ch;
        book.ReadNumber();
        System.out.println("---------------| BOOK DETAILS |-------------");
        do{
            System.out.println("Enter \n1.Read\n2.Display\n3.Exit\n");
            System.out.print("Your Choice : ");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1 : book.Read();break;
                case 2 : System.out.print("| Title\t|\tID\t|\tUnit Price\t|\tQuantity\t|\tTotalPrice|"); book.Display();break;
                case 3 : System.out.print("THANK YOOOUUUUUU");break;
                default : System.out.print("Invalid Choice..");break;
            }
        }while(ch != 3);
        sc.close();
    }
}
