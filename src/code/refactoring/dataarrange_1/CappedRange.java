package code.refactoring.dataarrange_1;

public class CappedRange extends IntRange{

	CappedRange(int low, int high) {
		super(low, high);
	}
	
	public int get_high() {
		return Math.min(super.get_high(), getCap());
	}

	private int getCap() {
		return 0;
	}
	
}
