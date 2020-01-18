package ru.job4j.singleton;

import ru.job4j.tracker.Item;

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