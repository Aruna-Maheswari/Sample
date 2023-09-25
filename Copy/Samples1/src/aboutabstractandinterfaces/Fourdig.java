package aboutabstractandinterfaces;

public class Fourdig {
	public static void main(String[] args) {
        int n1,r=0;
        for(int i=1000;i<=9999;i++)
        {
            n1=i;
            int sum=0;
            while(n1>0)
            {
                r=n1%10;
                sum=sum+r;
            }
            if(sum==9)
            {
                System.out.println(n1);
                
            }
        }
    }
    

}
