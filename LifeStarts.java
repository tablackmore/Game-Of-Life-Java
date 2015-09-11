/*
Any live cell with fewer than two live neighbours dies, as if by needs caused by underpopulation.
Any live cell with more than three live neighbours dies, as if by overcrowding.
Any live cell with two or three live neighbours lives, unchanged, to the next generation.
Any dead cell with exactly three live neighbours cells will come to life.
*/
class LifeStarts {
	public static void main(String[] args)
	 throws java.lang.InterruptedException{
		Life earth = new Life(55);
		earth.drawWorld();
		while(true){
			Thread.sleep(200);
			earth.nextGeneration();
			earth.drawWorld();
		}
	}
}