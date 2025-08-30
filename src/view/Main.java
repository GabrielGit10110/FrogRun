package view;

import controller.FrogsController;

public class Main {

	public static void main(String[] args) {
		int maxJumpSize = 50;
		int lapSize = 100;

		for (int i = 0; i < 5; i++) {
			FrogsController frog = new FrogsController(i + 1, maxJumpSize, lapSize);
			frog.start();
		}
	}

}
