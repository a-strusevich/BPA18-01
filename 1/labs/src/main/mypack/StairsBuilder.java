package main.mypack;

public class StairsBuilder {

	private int par;

	public StairsBuilder(int par) {
		this.par = par;
	}

	public StairsBuilder (){
	}

    void output() {
		System.out.println(Thread.currentThread().getName());
		for (int stroke = 1; stroke <= par; stroke++) {
			for (int symbol = 1; symbol <= par - stroke; symbol++) {
				System.out.print(' ');
			}
			for (int symbol = 1; symbol <= stroke; symbol++) {
				System.out.print('#');
			}
			System.out.print('\n');
		}
	}

	public int getStairs() {
		return par;
	}
 
	public void setStairs(int par) {
		this.par = par;
	}
}
