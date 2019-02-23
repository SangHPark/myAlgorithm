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

		
	}
	
	public static boolean findMazaPath(int x, int y) {
		if (x < 0 || y < 0 || x >= N || y >= N) {
			
		}
		return false;
	}
	

	
}
