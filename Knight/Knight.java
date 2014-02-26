public class Knight{
    public int[][] board;
    public int size = 0;
    public boolean solved = false;
    
    public Knight(int n){
	board = new int[n][n];
	size = n;
	for (int x=0; x<size; x++){
	    for (int y=0; y<size; y++){
		board[x][y] = 0;
	    }
	}
    }

    public void solve(){
	solved = false;
	solve(0, 0, 1);
    }

    public void solve(int x, int y, int n){
	if (n <= size*size){
	    if (x>=0 && x<size && y>=0 && y<size){
		if (board[x][y] == 0){
		    board[x][y] = n;
		    if(!solved)solve(x+2, y+1, n+1);
		    if(!solved)solve(x+2, y-1, n+1);
		    if(!solved)solve(x-2, y+1, n+1);
		    if(!solved)solve(x-2, y-1, n+1);
		    if(!solved)solve(x+1, y+2, n+1);
		    if(!solved)solve(x-1, y+2, n+1);
		    if(!solved)solve(x+1, y-2, n+1);
		    if(!solved)solve(x-1, y-2, n+1);
		    if(!solved)board[x][y] = 0;
		    if(solved)
			System.out.println("Step " + n + ": " + x + " , " + y);
		}
	    }
	}
	else
	    solved = true;
    }

    public String toString(){
	String s = "";
	for (int x=0; x<size; x++){
	    for (int y=0; y<size; y++){
		if (board[y][x] < 10)
		    s = s + "0" + board[y][x] + " ";
		else
		    s = s + board[y][x] + " ";
	    }
	    s = s + "\n";
	}
	return s;
    }

}
