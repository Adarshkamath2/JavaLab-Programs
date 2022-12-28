import java.util.Scanner;

class Cube{
    Scanner in = new Scanner(System.in);
    int vol,tot,j=1,k=1;

    int a[] = new int[20];

    void Read(int n){
        for(int i =0;i<n;i++)
        {
            System.out.print("Enter the Length of side of cube "+i+": ");
            a[i] = in.nextInt();
            j++;
        }
    }
  
    void Calculate(int n){
      
        for (int i = 0;i<n;i++)
        {
            vol = a[i]*a[i]*a[i];
            tot = 6*a[i]*a[i];
            System.out.println("Volume of Cube "+ (i+1) + " = "+vol);
            System.out.println("Outer area of Cube "+ (i+1) + " = "+tot);
        }
    }
}

public class CubeVolume{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter the Number of Cubes : ");
        n = in.nextInt();
        Cube cu = new Cube();
        cu.Read(n);
        cu.Calculate(n);
    }
}
