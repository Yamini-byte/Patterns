package Lec3;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int nsp1 = n-1;
		int nst = 1;
		int nsp2 = n-1;
		
		while(row <= n) {
			int csp1 = 1;
			while(csp1<=nsp1) {
				System.out.print(" ");
				csp1++;
			}
			int cst=1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			int csp2=1;
			while(csp2<=nsp2) {
				System.out.print(" ");
				csp2++;
			}
			System.out.println();
			row++;
			nsp1--;
			nsp2--;
			nst+=2;
		}
		

	}

}
