public class Array2 {
    public static void main(String args[]){
        int m[] = {1,2,3,4,5};
        int reverse[] = new int[5];
        for(int i=0,j=reverse.length-1;i<m.length;++i,--j)
        {
            reverse[j] = m[i];
        }
        for(int i=0;i<m.length ;++i){
        System.out.print(m[i]);
        }
        System.out.println("");
        for(int j=0;j<reverse.length;++j)
        System.out.print(reverse[j]);

    }
    
}
