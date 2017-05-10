	//knuth shuffle:
	// shuffle items in an array.
	public class StdRandom{
		//...
		public static void shuffle(Object[] a){
			int N = a.length;
			// itering through array
			for (int i = 0; i < N; i++){
				// generates random item from range equal to current item index.
				int r = StdRandom.uniform(i + 1);
				// replaces current item placed at randomly generated index number.
				exch(a, i, r);
			}
		}
	}