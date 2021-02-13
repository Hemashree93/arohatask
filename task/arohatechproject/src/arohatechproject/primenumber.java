package arohatechproject;


public class primenumber {
	
	public static void userPrime() {
		int arr[] =new int[178];
		int num, i=0,j,count=0,c=0,a;

	
		
		
		for(num=89; num<178; num++) {
			
			
			for(j=1; j<=num;j++) {
	
		if(num%j==0) {
			
			c++;
		}
	}
			if(c==2) {
	arr[i] = num;
	i++;
	count++;
}
if(count==17) {
	break;
}
c=0;
		}
		System.out.println("prime number from 89 to 178 are : ");
		for(a=0;a<178;a++) {
			System.out.println(arr[a]);
		
	}

}

	public static void main(String[] args) {
		primenumber p=new primenumber();
		p.userPrime();
		
		
}
}
