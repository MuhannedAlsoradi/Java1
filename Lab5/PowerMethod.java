import java.util.*;
public class PowerMethod {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int a = input.nextInt();
        System.out.println(power(x,a));
       
    
}
public static int power(int x , int a){
    int result = 1;
    for(int i = 0 ; i<a ; ++i)
    result*=x;
    return result ;
}

}
