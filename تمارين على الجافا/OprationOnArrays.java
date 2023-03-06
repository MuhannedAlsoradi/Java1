public class OprationOnArrays {
    public static void main(String args[]){
        printMax(2,3,4,5,36,56.5);
        printMax(new double[]{1,2,3,4,6,7,10});
        
    }
    public static void printMax(double... numbers){
        if(numbers.length==0)
        {
          System.out.println("no value passed");
        return;
        }
        double result = numbers[0];
        for(int i=0;i<numbers.length;++i)
        if(numbers[i]>result)
          result=numbers[i];
          System.out.println(result);
          
}
    
}
