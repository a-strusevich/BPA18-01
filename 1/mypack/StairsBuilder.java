package mypack;

public class StairsBuilder {
    void output(int n) {
		System.out.println(Thread.currentThread().getName());
		for (int stroke = 1; stroke <= n; stroke++) {
			for (int symbol = 1; symbol <= n - stroke; symbol++) {
				System.out.print(' ');
			}
			for (int symbol = 1; symbol <= stroke; symbol++) {
				System.out.print('#');
			}
			System.out.print('\n');
		}
	}
}
