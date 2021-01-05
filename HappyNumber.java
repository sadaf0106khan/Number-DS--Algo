package numbers;

public class HappyNumber {
public static void main(String[] args) {
	System.out.println(happyNumber(1111111));
}
	
	
	public static boolean happyNumber(int n) {
		  int sum=n;
			while(sum!=1) {
	            if(sum==1)
	                return true;
	            else{
	                int temp=sum;
	                sum=0;
	                while(temp!=0){

	                int rem=temp%10;
	                sum+=rem*rem;
	                temp/=10;
	                }
	                  if(sum>1&&sum<9&&sum!=7) {
				        return false;
			            } 
	            }
			}
			
			return true;
	    }
}
