package models;

import java.util.ArrayList;

public class RangeAge {

	private ArrayList<String> range;

	public RangeAge() {
		this.range = new ArrayList<>();
	}

	public void createRange(String range) {
		if (range.isEmpty()) {
			return;
		}
		this.range.add(range);
	}

	public String readRange(int index) {
		if (index < 0) {
			return null;
		}

		if (index >= this.range.size()) {
			return null;
		}

		return this.range.get(index);
	}

	public void updateRange(String oldRange, String newRange) {
		int index = this.searchRange(oldRange);
		if (index < 0) {
			return;
		}

		this.range.set(index, newRange);
	}

	public void deleteRange(String range) {
		int index = this.searchRange(range);
		if (index < 0) {
			return;
		}

		this.range.remove(index);
	}

	private int searchRange(String range) {
		int index = 0;
		for (String r : this.range) {
			if (r == range) {
				break;
			}
			index++;
		}

		if (index >= this.range.size()) {
			index = -1;
		}

		return index;
	}
}
