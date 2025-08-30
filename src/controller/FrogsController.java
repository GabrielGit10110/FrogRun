package controller;

public class FrogsController extends Thread {
	private final int frog;
	private final int maxJumpSize; // random
	private final int lapSize; // 100m
	private int distanceTraveled;
	private static int placement = 0;
	
	public FrogsController(int frog, int maxJumpSize, int lapSize) {
		this.frog = frog;
		this.maxJumpSize = maxJumpSize;
		this.lapSize = lapSize;
		this.distanceTraveled = 0;
		
	}
	
	@Override
	public void run() {
		frogGame();
	}

	// Game logic
	private void frogGame() {
		
		while (distanceTraveled < lapSize) {
			int jumpSize = (int)(Math.random() * maxJumpSize) + 1;
			StringBuilder buffer = new StringBuilder();
			
			distanceTraveled = distanceTraveled + jumpSize;
			
			buffer.append("Sapo n° ").append(frog);
			buffer.append(" deu um salto de ").append(jumpSize).append("m");
			buffer.append(" e percorreu ").append(distanceTraveled).append("m");
			
			System.out.println(buffer.toString());
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			
			
		}
		
		// First time I'm using this, no idea how It works, just implemented It and works just fine ( ° u °)_b
		// I need to ask what does It do in the next class.
		synchronized (FrogsController.class) {
			placement++;
			System.out.println("Sapo n° " + frog + " terminou a corrida na " + placement + "° posicao \n");
			
		}


	}

}
