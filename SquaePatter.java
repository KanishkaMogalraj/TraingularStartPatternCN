import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
        int i=1;
    int n;
        n=s.nextInt();
            if(n>0 && n<=50)
            {
                while(i<=n)
                {
                    int j=1;
                    while(j<=i)
                    {
                        System.out.print("*");
                        j++;
                        
                    }
                    
                      System.out.println();
                    i++;
                }
            }
		
	}

}
