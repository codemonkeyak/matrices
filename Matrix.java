

public class Matrix {

  public Matrix(int r, int c) {
     row = r;
		 col = c;
		 arr = new int[r][c];
	}

	private int[][] arr;

	private int row;
	private int col;

	public void print() {
    for(int i=0; i<row ; i++) {
			for(int j=0; j< col ; j++) {
        System.out.print(arr[i][j]+ " " );
			}
			 System.out.println();
		}
	}

	public void fillRand() {
		 for(int i=0; i<row ; i++) {
			 for(int j=0; j< col ; j++) {
				 int x = (int)(Math.random()*(50))+0;
         arr[i][j] = x;
			 }
		 }
	}

	public void add(Matrix m) {
		if(row != m.row || col != m.col) {
		  return;
		} else {
      int p = 0;
      for(int i=0; i<row ; i++) {
			  for(int j=0; j< col ; j++) {
          arr[i][j] = arr[i][j]+m.arr[i][j];
			  }
		  }
		}
	}

	public void multiply(int x) {
     for(int i=0; i<row ; i++) {
			 for(int j=0; j< col ; j++) {
         arr[i][j] = arr[i][j]*x;
			 }
		 }

	}
}

