package code.refactoring.dataarrange_1;

public class IntRange {

	private int _low, _high;
	
    IntRange (int low, int high) {
        _low = low;
        _high = high;
    }

    boolean includes (int arg) {
        return arg >= get_low() && arg <= get_high();
    }

    void grow(int factor) {
    	_high = get_high() * factor;
    }

	public int get_low() {
		return _low;
	}

	public void set_low(int _low) {
		this._low = _low;
	}

	public int get_high() {
		return _high;
	}

	public void set_high(int _high) {
		this._high = _high;
	}
    
    
}
