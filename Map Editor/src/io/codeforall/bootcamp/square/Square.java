package io.codeforall.bootcamp.square;

import io.codeforall.bootcamp.grid.Grid;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import static io.codeforall.bootcamp.grid.Grid.CELLSIZE;
import static io.codeforall.bootcamp.grid.Grid.PADDING;

public class Square{

	Rectangle square;
	private int col;
	private int row;

	public Square() {
		square = new Rectangle(PADDING, PADDING, CELLSIZE, CELLSIZE);
		makeSquare();
	}

	private void makeSquare() {
		square.setColor(Color.PINK);
		square.fill();
	}

	public void moveUp() {
		square.translate(0, -20);
		col -= 1;
	}
	public void moveDown() {
		square.translate(0, 20);
		col += 1;
	}
	public void moveLeft() {
		square.translate(-20, 0);
		row -= 1;
	}
	public void moveRight() {
		square.translate(20, 0);
		row += 1;
	}


	public int getCol() {
		return col;
	}
	public int getRow() {
		return row;
	}


}
