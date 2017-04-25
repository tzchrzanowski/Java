public class Hamming{
	private String a;
	private String b;

	public Hamming( String a, String b){
		this.a = a;
		this.b = b;
		if(a.length() != b.length()){
			throw new IllegalArgumentException("input strings does not have the same length!");
		}
	}
	int occurances = 0;
	public int getHammingDistance(){
		for(int i = 0; i <a.length(); i++){
			if(a.charAt(i) != b.charAt(i)) occurances += 1;
		}
		return occurances;
	}
}
