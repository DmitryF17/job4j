package ru.job4j.singleton;

import ru.job4j.tracker.Item;

public class TrackerStFinalClass {
	private TrackerStFinalClass() {
	}
	public static TrackerStFinalClass getInstance() {
		return Holder.INSTANCE;
	}
	public Item add(Item model) {
		return model;
	}
	private static final class Holder {
		private static final TrackerStFinalClass INSTANCE = new TrackerStFinalClass();
	}
	public static void main(String[] args) {
		TrackerStFinalClass tracker = TrackerStFinalClass.getInstance();
	}
}
