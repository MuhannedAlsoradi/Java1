import java.util.*;
public class Name {
    public static void main(String[] args){
        System.out.print("Enter your name :");
        Scanner input = new Scanner(System.in);
        char name[] = {0,0,0,0,0,0,0,0};
        for(int i = 0 ; i<name.length;++i)
        name[i] = input.next().charAt(0);
       
        name(name);
    }
    public static void name ( char name[]){
        for(int i = name.length-1;i>=0 ; --i)
        System.out.print(name[i]);
    }
    
}
