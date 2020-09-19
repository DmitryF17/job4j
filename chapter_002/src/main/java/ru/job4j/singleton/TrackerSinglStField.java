package ru.job4j.singleton;

public class TrackerSinglStField {
	private static TrackerSinglStField instance;
	
	private TrackerSinglStField() {
	}
	
	public static TrackerSinglStField getInstance() {
		if (instance == null) {
			instance = new TrackerSinglStField();
		}
		return instance;
	}
	public Item add(Item model) {
		return model;
	}
}