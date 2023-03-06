public class testr1 {
    public static void main(String[] args) {
        int sum =0;
        int n =0;
        while(n<20)
        {
            n++;
            
            if(n==10||n==11)
             continue;
             sum+=n;
        }
        System.out.println(sum);
        System.out.println(n);
    }
}
