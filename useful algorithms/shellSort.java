 // uses insertion, jumps every 3x+1
 public class Shell {
	public static void sort(Comparable[] a){
		int N = a.length;
		int h = 1;
		while (h < N/3) h = 3*h + 1; // 1, 4, 13, 40, 121, 364, ...
			while (h >= 1){ 
				// h-sort the array.
				//itering through table
				for (int i = h; i < N; i++){
					// itering back
					for (int j = i; j >= h && less(a[j], a[j-h]); j -= h)
						// if aj is smaller than aj-h, then replaces them
						exch(a, j, j-h);
					}
			// move to next increment
			h = h/3;
			}
	}
	private static boolean less(Comparable v, Comparable w){
		return v.compareTo(w) < 0;
	}
	private static void exch(Comparable[] a, int i, int j){
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
}