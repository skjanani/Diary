package janani;
import java.util.Scanner;
public class Diary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,n,a1,sum=0;
System.out.println("enter the elements");
Scanner ja=new Scanner(System.in);
n=ja.nextInt();
System.out.println("enter the number");
int []a=new int[n];
for(i=0;i<n;i++){
	a[i]=ja.nextInt();
}
for(i=0;i<n;i++){
	a1=a[i];
	for(j=a1-1;j>0;j--){
		sum=sum+j;
	}
	System.out.println(sum);
}
	}

}
