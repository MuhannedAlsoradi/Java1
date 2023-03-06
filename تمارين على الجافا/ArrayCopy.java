
public class ArrayCopy {
    public static void  main(String[] args) {
        int sourceArray[] = {1,2,3,4,5};
        int targetArray[] = new int [sourceArray.length];
        System.arraycopy(sourceArray, 0, targetArray, 0, 5);
        for(int i=0;i<targetArray.length;++i)
        System.out.print(targetArray[i]);


        
    }

}