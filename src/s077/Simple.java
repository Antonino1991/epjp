package s077;

public class Simple {
	public int negate(int value) {
		if (value == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("Can't negate MIN_VALUE");
		}
		return -value;
	}

	public int negate2(int value) {
		if (value == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("Can't negate MIN_VALUE");
		}
		return -value;
	}
}

//	public static void main(String[] args) {
//		Simple simple = new Simple();
//		try {
//		int x = simple.negate2(Integer.MIN_VALUE);
//		System.out.println("my value negated is :" + x);
//	} catch (MyBegateException  ) {
//		System.out.println();
//	}
//}
//
//class MyNegateException extends Exception {
//	private int alternativeValue;
//
//	public MyNegateException(int alternativevalue) {
//		this.alternativeValue = alternativeValue;
//
//	}
//
//	public int getAlternativeValue() {
//		return alternativeValue;
//	}
//}