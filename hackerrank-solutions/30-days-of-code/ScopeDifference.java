class ScopeDifference {
	private int[] elements;
	public int maximumDifference;

	public ScopeDifference(int[] elements) {
		this.elements = elements;
	}

	public void computeDifference() {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int element : elements) {
			max = Math.max(max, element);
			min = Math.min(min, element);
		}
		maximumDifference = max - min;
	}

} // End of Difference class
