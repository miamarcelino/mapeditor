package io.codeforall.bootcamp.grid;


import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class Grid{

	public static final int PADDING = 10;
	public static final int CELLSIZE = 20;
	private int cols = 20;
	private int rows = 20;

	private Rectangle[][] grid;

	public Grid() {
		grid = new Rectangle[cols][rows];
		makeGrid();
	}




	public void makeGrid() {
		for (int col = 0; col < cols; col++) {
			for (int row = 0; row < rows; row++) {

				int x = PADDING + col * CELLSIZE;
				int y = PADDING + row * CELLSIZE;

				Rectangle cell = new Rectangle(x, y, CELLSIZE, CELLSIZE);
				cell.draw();

				grid[col][row] = cell;
			}
		}
	}

	public void paintCell(int col, int row) {
		grid[col][row].setColor(Color.PINK);
		grid[col][row].fill();
	}

	public void clearCell(int col, int row) {
		grid[col][row].draw();
	}

}