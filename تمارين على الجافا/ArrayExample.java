import javax.swing.*;
public class ArrayExample {
    public static void main(String args[]){
        int list1[] = {1,2,3,4,5,6};
        int list2[] = reverse(list1);
        for (int u : list1) {
            System.out.print(u);
        }
        System.out.println("");
        for (int a : list2) {
            System.out.print(a);
        }
       System.out.println(makeArray());
       for(int i=0;i<)
       }
    
    public static int []reverse(int list[]){
        int result[] = new int[list.length];
        for(int i=0,j=result.length-1;i<result.length;++i,--j)
        result[j] = list[i];
        return result ; 

    }
    public static int []makeArray(){
        int []myArray = new int [10];
        for(int i=0;i<myArray.length;++i)
        myArray[i] = i;
        return myArray ;
    }
    
}
