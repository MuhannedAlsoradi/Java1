import java.util.*;
public class arr {
    public static void main(String[] args){
        int x[][] = new int[2][3];
        int y[][] = new int[2][3];
        int i =0 , j = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the values of the member of array x[][]");
        for(i=0 ; i<x.length ; ++i)
        for(j=0 ; j<x[i].length ; ++j)
        x[i][j] = input.nextInt();
        System.out.println("Enter the values of the member of array y[][]");
        for(i=0 ; i<y.length ; ++i)
        for(j=0 ; j<y[i].length ; ++j)
        y[i][j] = input.nextInt();
        int z[][] = new int[2][3];
        for( i=0 ; i<z.length ; ++i)
        for( j=0 ; j<z[i].length ; ++j)
        z[i][j] = x[i][j] + y[i][j];
        for( i=0 ; i<z.length ; ++i)
        for( j=0 ; j<z[i].length ; ++j) 
        System.out.print(z[i][j]);

        





    }
    
}
