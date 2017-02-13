

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

	public void printMat(int r, int c, int[][] q) {
     for(int i=0; i<r ; i++) {
	    for(int j=0; j< c ; j++) {
        System.out.print(q[i][j]+ " " );
			}
			System.out.println();
		}

	}

	public void transpose() {
		int b[][] = new int[col][row];
    for(int i=0; i<row; i++) {
      for(int j=0; j<col; j++) {	
        b[j][i] = arr[i][j];
			}
		}
		arr = b;

		int temp = row;
		row= col;
		col = temp;
	}

	public Matrix makeAShallowCopy() {
    Matrix m = new Matrix(row,col);
		m.arr = arr;
		return m;
	}

	public void identityMat(int c) {
    int[][] b = new int[c][c];
    for(int i=0; i<c; i++) {	
      b[i][i] = 1;
		}
		arr = b;
		row = c;
		col = c;
	}

	public void matProduct(Matrix m) {
		int p = 0;
		Matrix c = new Matrix(row,m.col);
		if(col != m.row) {
			return;
		} 
    for(int i=0; i<row; i++) {
		  for(int j=0; j<m.col; j++) {
        c.arr[i][j]= giveIndex(i,j,m);
			}
		}
		arr = c.arr;
		row = c.row;
		col = c.col;
	}

	public int giveIndex(int kr, int kc,Matrix s) {
    int p = 0;
		int c = 0;
		for(int i=0; i< s.row ; i++) {
      p = arr[kr][i]*s.arr[i][kc];
			c=c+p;
		}
		return c;
	}

	public int getDet(Matrix m) {
    if(m.row != m.col) {
      return 0;
		}
		if(m.row == 1) {
      return m.arr[0][0];
		}
    if(m.row == 2) {
      for(int i=0; i<2; i++) {
       // a[0][i]*a[]

			}
		}
		return 0;
	}

	public Matrix getSubMatrix(Matrix m, int exCol) {
		int p =0; int q=0; int r=0; int s=0;
		Matrix a = new Matrix(m.row-1,m.col-1);
    for(int i=0,k=0; i<m.col; i++) {
      if(i != exCol) {
        for(int j=0; j<a.row; j++) {
          a.arr[j][k] = m.arr[j+1][i];
				}
				k++;
			}	 
		}
		return a;
	}
}

