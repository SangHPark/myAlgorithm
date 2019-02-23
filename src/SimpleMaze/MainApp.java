package SimpleMaze;

public class MainApp {
	private static int N = 8;
	private static int[][] maze = {
						{0,0,0,0,0,0,0,1},
						{0,1,1,0,1,1,0,1},
						{0,0,0,1,0,0,0,1},
						{0,1,0,0,1,1,0,0},
						{0,1,1,1,0,0,1,1},
						{0,1,0,0,0,1,0,1},
						{0,0,0,1,0,0,0,1},
						{0,1,1,1,0,1,0,0}
								};
	
	private static final int PATHWAY_COLOR = 0;
	private static final int WALL_COLOR = 1;
	private static final int BLOCKED_COLOR = 2;
	private static final int PATH_COLOR = 3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMaze();
		findMazaPath (0,0);
		printMaze();
	}
	
	public static void printMaze() {
		for (int x = 0; x < N; x ++) {
			for (int y = 0; y < N; y ++) {
				System.out.print(maze[x][y]);
			}
			System.out.println("");
		}
	}
	public static boolean findMazaPath(int x, int y) {
		System.out.print("x= " + x + " y= " + y);
		if (x < 0 || y < 0 || x >= N || y >= N) {
			System.out.println(" maze= out of maze");
		} 
		else {
			System.out.println(" maze= " + maze[x][y]);
		}
		
		if (x < 0 || y < 0 || x >= N || y >= N) {
			return false;
		}
		else if (maze[x][y] != PATHWAY_COLOR) {
			return false;
		}
		else if (x == N-1 && y == N-1) {
			maze[x][y] = PATH_COLOR;
			return true;
		}
		else {
			maze[x][y] = PATH_COLOR;
			if (findMazaPath(x-1,y) || findMazaPath(x,y+1) 
				|| findMazaPath(x+1,y) || findMazaPath(x,y-1)) {
//				System.out.println("return true");
				return true;
			}
			maze[x][y] = BLOCKED_COLOR;
			return false; 
		}
	}
	

	
}
