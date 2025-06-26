package io.codeforall.bootcamp;

import io.codeforall.bootcamp.grid.Grid;
import io.codeforall.bootcamp.grid.GridMaker;
import io.codeforall.bootcamp.square.Square;
import io.codeforall.bootcamp.square.SquareMaker;

public class Program {

	Grid grid;
	Square square;
	MyKeyboardHandler keyboardHandler = new MyKeyboardHandler();

	public Program() {
		grid = GridMaker.makeGrid();
		square = SquareMaker.makeSquare();
	}

	public void start() {
		keyboardHandler.setMySquare(square);
		keyboardHandler.init();
	}
}

