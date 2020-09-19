package ru.job4j.singleton;

public class TrackerFinalField {
	private static final TrackerFinalField INSTANCE = new TrackerFinalField();

		private TrackerFinalField() {
		}

		public static TrackerFinalField getInstance() {
			return INSTANCE;
		}
		public Item add(Item model) {
			return model;
		}
		public  static void main(String[] args) {
			TrackerFinalField tracker = TrackerFinalField.getInstance();
	}
}