package numbers;

public class GCD {
	public static void main(String[] args) {
		System.out.println(gcd(8,-20));
	}
public static int gcd(int a,int b) {
	
	//in all method u need to set both number +ive
	//if any of them is -ve set positive
	
	a=(a>0?a:-a);
	b=(b>0?b:-b);
	
	
//	int i=1;
//	int g_cd=1;
//	while(i<=a&&i<=b) {
//		if(a%i==0&&b%i==0&&i!=1) {
//			g_cd=i;
//		}
//	i++;
//	}
//	return g_cd;
	
	//****2nd method*****
	
//	while(a!=b) {
//		if(a>b) {
//			a-=b;
//		}
//			else
//				b-=a;
//		}
//		return b;
		//or u can also return a
		
		
		//******third method using recurrsion
		
		if(b%a==0)
			return a;
		
			return gcd(b,b%a);
		
		
	
}
}
