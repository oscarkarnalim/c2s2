package support.stringmatching;

/*
 * tuple untuk menyimpan hasil kesamaan
 */
public class GSTMatchTuple {
	public int patternPosition;
	public int textPosition;
	public int length;
	public GSTMatchTuple(int p, int t, int l){
		this.patternPosition = p;
		this.textPosition = t;
		this.length = l;
	}
	
	public String toString(){
		return patternPosition + ":" + textPosition + ":" + length;
	}
}
