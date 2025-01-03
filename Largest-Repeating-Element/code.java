import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }
        int c=1,count=0,max=a[0];
        for(int i=0;i<n-1;i++){
            if(a[i]==a[i+1]){
                c++;
            }else{
                if(c>=count)
                {
                    count=c;
                    max=a[i];
                }
                c=1;
            }
        }
        if(c>=count){
            count=c;
            max=a[n-1];
        }
        System.out.print(max);
    }
}