import java.util.Scanner;
class SortArray{
    public static void MergeArray(int a[],int b[],int n1,int n2,int c[]){

        int i =0,k=0,j=0;
        while(i<n1 && j<n2){
            if(a[i] < b[j])
                c[k++]=a[i++];
            else 
                c[k++]= b[j++];

        }
        while(i<n1)
            c[k++] = a[i++];
        while(j<n2)
            c[k++] = b[j++];
    }
    
    public static void main(String[] args) {
        int i;
        Scanner in = new Scanner(System.in);
        int a[] = new int [10];
        int b[] = new int [10];
        System.out.print("Enter the Number of elements of the First arrsy : ");
        int n1 = in.nextInt();
        System.out.print("enter the Number of elements of the second Array : ");
        int n2 = in.nextInt();

        System.out.println("Enter the Elements of array 1 : ");
        for(i=0;i<n1;i++)
        {
            a[i] = in.nextInt();
        }
        System.out.println("Enter the Elements of array 2 : ");
        for(i=0;i<n2;i++)
        b[i] = in.nextInt();

        int c[] = new int [n1+n2];
        MergeArray(a, b, n1, n2, c);
        System.out.println("Array after Merging is :");
        for(i=0;i<c.length;i++)
        System.out.print(c[i]+"\t");
        System.out.println(" ");
        in.close();

    }    
    
}
