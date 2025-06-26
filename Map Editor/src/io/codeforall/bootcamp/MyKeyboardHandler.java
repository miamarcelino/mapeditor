package io.codeforall.bootcamp;

import io.codeforall.bootcamp.grid.Grid;
import io.codeforall.bootcamp.square.Square;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class MyKeyboardHandler implements KeyboardHandler {
	private Keyboard keyboard;
	private Square mySquare;
	private Grid myGrid = new Grid();

	public void init() {

		keyboard = new Keyboard(this);
		KeyboardEvent spaceKey = new KeyboardEvent();
		KeyboardEvent moveUp = new KeyboardEvent();
		KeyboardEvent moveDown = new KeyboardEvent();
		KeyboardEvent moveLeft = new KeyboardEvent();
		KeyboardEvent moveRight = new KeyboardEvent();
		KeyboardEvent clearKey = new KeyboardEvent();

		spaceKey.setKey(KeyboardEvent.KEY_SPACE);
		spaceKey.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

		moveUp.setKey(KeyboardEvent.KEY_UP);
		moveUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
		moveDown.setKey(KeyboardEvent.KEY_DOWN);
		moveDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
		moveLeft.setKey(KeyboardEvent.KEY_LEFT);
		moveLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
		moveRight.setKey(KeyboardEvent.KEY_RIGHT);
		moveRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

		clearKey.setKey(KeyboardEvent.KEY_C);
		clearKey.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

		keyboard.addEventListener(spaceKey);

		keyboard.addEventListener(moveUp);
		keyboard.addEventListener(moveDown);
		keyboard.addEventListener(moveLeft);
		keyboard.addEventListener(moveRight);

		keyboard.addEventListener(clearKey);
	}

	@Override
	public void keyPressed(KeyboardEvent keyboardEvent) {
		switch (keyboardEvent.getKey()) {

			case KeyboardEvent.KEY_SPACE:
				myGrid.paintCell(mySquare.getRow(), mySquare.getCol());
				break;
			case KeyboardEvent.KEY_UP:
				mySquare.moveUp();
				break;
			case KeyboardEvent.KEY_DOWN:
				mySquare.moveDown();
				break;
			case KeyboardEvent.KEY_LEFT:
				mySquare.moveLeft();
				break;
			case KeyboardEvent.KEY_RIGHT:
				mySquare.moveRight();
				break;
			case KeyboardEvent.KEY_C:
				myGrid.clearCell(mySquare.getRow(), mySquare.getCol());
				break;

		}
	}

	@Override
	public void keyReleased(KeyboardEvent keyboardEvent) {
	}

	public void setMySquare(Square mySquare) {
		this.mySquare = mySquare;
	}
}
