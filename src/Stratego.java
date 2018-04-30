import java.util.ArrayList;

public class Stratego {
	
	int size;
	int game[][];
	int row[];
	int column[];
	int up[];
	int down[];
	
	Stratego(int size){
		this.size = size;
		this.column = new int[size];
		this.row = new int[size];
		this.up = new int[2*size - 1];
		this.down = new int[2*size - 1];
		}
	
	private void fillPoints(){
		for(int i = 0; i < up.length; i++) {
			
		}
	}
	
	private class Move {
		private int x, y;
		Move(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	public void loadBoard(int board[][]) {
		this.game = board;
	}
	
	private void print() {
		for(int[] a : game) {
			for(Integer i : a) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public ArrayList<Move> checkPossibleMoves() {
		ArrayList<Move> possibleMoves = new ArrayList<Move>();
		int counter = 0;
		for(int i = 0; i < game.length; i++) {
			for(int j = 0; j < game.length; j++) {
				if(game[i][j] == 0) {
					counter++;
					possibleMoves.add(new Move(i, j));
					System.out.println("Move " + counter + ": (" + i + ", " + j + ")" );
				}
			}
		}
		return possibleMoves;
	}
	
	public int move(int x, int y, int gamer) {
		boolean isZero = false;
		int result = 0;
		game[x][y] = gamer;
		for(int i = 0; i < game.length && !isZero; i++) {
			if(game[x][i] == 0) {
				isZero = true;
			}
		}
		if(!isZero) {
			result += 5;
		}
		isZero = false;
		for(int i = 0; i < game.length && !isZero; i++) {
			if(game[i][y] == 0) {
				isZero = true;
			}
		}
		isZero = false;
		if(!isZero) {
			result += 5;
		}
		for(int i = 0; i < (x - y); i++) {
			if(game[x+i][y+i] == 0) {
				isZero = true;
			}
		}
		isZero = false;
		if(!isZero) {
			result += (x - y);
		}
		isZero = false;
		int temp = (y - x);
		if(temp < 0) {
			temp = -temp;
		}
		for(int i = game.length; i < temp; i++) {
			if(game[i-x][i-y] == 0) {
				isZero = true;
			}
		}
		if(!isZero) {
			result += temp;
		}
		return result;
	}
	
	private void printPoints() {
		
	}
	
	private int column(int x, int y) {
		return 0;
	}
	
	private int row() {
		return 0;
	}
	
	private int diagonal() {
		return 0;
	}
}
