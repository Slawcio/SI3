
public class Main {
	
	static int[][] game1 = {
			{0, 1, 2, 0, 0},
			{2, 1, 0 ,0, 0},
			{0, 0, 0, 0, 1},
			{0, 1, 2, 1, 0},
			{1, 2, 1, 0, 0}};

	public static void main(String[] args) {
		Stratego stratego = new Stratego(5);
		stratego.loadBoard(game1);
		stratego.checkPossibleMoves();
		System.out.println(stratego.move(0, 3, 1));
	}
}
