public class MinimumMethod {
    public static void main(String[] args){
        System.out.println(min(4,5,6));


    }
    /*public static double min(double num1 , double num2){
        double result;
        if(num1<num2)
        result = num1;
        else
        result = num2;
        return result ;

    
}*/

public static double min(double num1 , double num2 , double num3){
    double min ;
    if(num2<num1)
    min = num2 ;
    else if(num3<num1)
    min = num3 ;
    else 
    min = num1 ;

    return min;
}
}
