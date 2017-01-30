

public class MatrixTest {

  public static void main(String[] args) {
    Matrix m = new Matrix(2,2);
		m.print();
		m.fillRand();
		System.out.println("-------matrix m ----------");
		m.print();
		System.out.println("");
    
		Matrix n = new Matrix(2,3);
		n.fillRand();
		System.out.println("-------matrix n----------");
		n.print();
		System.out.println("");
 	
		System.out.println("--------add m and n-------");
		m.add(n);
		m.print();
		System.out.println("");
		
		System.out.println("--------product-------");
		m.multiply(3);
		m.print();
	 System.out.println("");

	  System.out.println("--------transpose-----------");
		Matrix p = new Matrix(2,3);
		p.fillRand();
		p.print();
		System.out.println("-------------------");
		p.transpose();
		p.print();
		System.out.println("");

		System.out.println("--------identity-----------");
		Matrix q = new Matrix(2,3);
		q.identityMat(4);
		q.print();
		System.out.println("");

	}


}
