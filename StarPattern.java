package PatternsAssignment;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			* 
//	      * * 
//	    * * * 
//	  * * * * 
//	* * * * * 
		/*work done--->
		 * nsp spaces, nst stars
		 * initial values-->
		 * nsp = n-1 nst = 1;
		 * updation--->
		 * nsp--; nst++; row++; ln();
		 * */
		int n = 5;
		
		int row = 1;
		int nsp = n-1;
		int nst = 1;
		while(row<=n) {
			int csp = 1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst = 1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			
			System.out.println();
			row++;
			nsp--;
			nst++;
		}
	}

}
