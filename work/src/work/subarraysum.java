package work;

public class subarraysum {

	static boolean issubsetSum(int set[],int n,int sum) {
		boolean subset[][]=new boolean[sum+1][n+1];
		for(int i=0;i<=n;i++) {
			subset[0][i]=true;
			
		}
		for(int i=1;i<=sum;i++) {
			subset[i][0]=false;
		}
		for(int i=1;i<=sum;i++) {
			for(int j=1;j<=n;j++) {
				subset[i][j]=subset[i][j-1];
				if(i>=set[j-1]) {
					subset[i][j]=subset[i][j]||subset[i-set[j-1]][j-1];
				}
				
			}
		}
		return subset[sum][n];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int set[]= {2,3,7,8,10};
		int sum=10;
		int n=set.length;
		
		if(issubsetSum(set,n,sum)==true) {
			System.out.println("Found a subset with sum");
		}
		
		else {
			System.out.println("No Subset with sum");
		}
		
		

}
}
