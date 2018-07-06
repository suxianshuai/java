package test;

public class test2 {
		static double sqrt(double c) {

		double err = 1e-15;
		double t = c;
		if(c<0)
			return Double.NaN;
	
		while(Math.abs(t-c/t)>err *t)
			t = (c/t + t)/2.0;
	    return t;
		
	}
		static int[] copy(int[] c) {
		int  N = c.length;
		int[] b = new int [N];
		for(int i=0;i<N;i++) {
			b[i]=c[i];
		}
		return b;
	}
		static int[][] matrix(int[][] a, int[][] b){
			int N = a.length;
			int[][] c = new int[N][N];
			for(int i = 0;i<N;i++) 
				for(int j = 0;j<N;j++) {
					for(int k = 0;k<N;k++)
						c[i][j]+=a[i][k]*b[k][j];
					
				}
			return c;       
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double a=sqrt(15.9);
		int[] a = new int[] {1,2,3,4};
		int [][] b = new int[2][2];
		int [][] c = new int[2][2];
		for(int i=0;i<2;i++)
			for(int j=0;j<2;j++) {
				b[i][j]=1;
		        c[i][j]=0;
			}
		System.out.println(sqrt(15.9));
		System.out.println(a);
		System.out.println(matrix(b,c));
	}

}
