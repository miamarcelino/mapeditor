package io.codeforall.bootcamp.square;

import io.codeforall.bootcamp.grid.Grid;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import static io.codeforall.bootcamp.grid.Grid.CELLSIZE;
import static io.codeforall.bootcamp.grid.Grid.PADDING;

public class Square{

	Rectangle square;
	private int col = 0;
	private int row = 0;

	public Square() {
		square = new Rectangle(Grid.PADDING, Grid.PADDING, Grid.CELLSIZE, Grid.CELLSIZE);
		makeSquare();
	}

	private void makeSquare() {
		square.setColor(Color.PINK);
		square.fill();
	}

	public void moveUp() {
		if (row > 0) {
			square.translate(0, -20);
			row -= 1;
		}
	}
	public void moveDown() {
		if (row < 19) {
			square.translate(0, 20);
			row += 1;
		}
	}
	public void moveLeft() {
		if (col > 0) {
			square.translate(-20, 0);
			col -= 1;
		}
	}
	public void moveRight() {
		if (col < 19) {
			square.translate(20, 0);
			col += 1;
		}
	}


	public int getCol() {
		return col;
	}
	public int getRow() {
		return row;
	}


}
