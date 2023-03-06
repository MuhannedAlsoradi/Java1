public class arr1 {
    public static void main(String[] args)
    {
        int x[][] = {{1,2,3} , {4,5,6,7} , {8,9} , {5,4,3,2,1}};
        int sum = 0 ;
        for(int i = 0 ; i<x.length ; ++i)
        for(int j = 0 ;j<x[i].length ; ++j)
        sum+=x[i][j];
        System.out.println(sum);

       
    }
}
