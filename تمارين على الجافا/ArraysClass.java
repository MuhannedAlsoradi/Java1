import java.util.Arrays;
public class ArraysClass {
    public static void  main(String[] args){
        int arr[] = {1,30,2,19,18,16,5,0,4,55};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;++i)
        System.out.println(arr[i]);
        int list[] = {2,7,4,10,11,45,50,59,66,60,70,69,79,78};
        Arrays.sort(list);
        System.out.println("(1)Index is " + Arrays.binarySearch(list, 10));
        System.out.println("(2)Index is " + Arrays.binarySearch(list, 12));
        char chars[] = {'a','c','g','b','x','y','z'};
        Arrays.sort(chars);
        System.out.println("(3)Index is " + Arrays.binarySearch(chars, 'a'));
        System.out.println("(4)Index is " + Arrays.binarySearch(chars, 't'));



    }
}
