package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;
public class Tracker {
	private final Item[] items = new Item[100];
	private int position = 0;
	public Item add(Item item) {
		item.setId(this.generateId());
		items[this.position++] = item;
		return item;
	}
	private String generateId() {
		Random rm = new Random();
		return String.valueOf(rm.nextLong() + System.currentTimeMillis());
	}
	public Item[] findAll() {
		Item[] result = new Item[position];
		int size = 0;
		for (int index = 0; index < items.length; index++) {
			Item item = this.items[index];
			if (item != null) {
				result[size] = item;
				size++;
			}
		}
		result = Arrays.copyOf(result, size);
			return result;
		}
		public Item[] findByName(String key) {
			Item[] nameskey = new Item[position];
			int size = 0;
			for (int index = 0; index < nameskey.length; index++) {
				Item item = this.items[index];
				if (item.getName().equals(key)) {
					nameskey[size] = item;
					size++;
				}
			}
        nameskey = Arrays.copyOf(nameskey, size);
        return nameskey;
		}
		public Item findById(String id) {
			Item nameid = null;
			Item[] itemsarea = new Item[position];
			for (int index = 0; index < itemsarea.length; index++) {
				Item item = this.items[index];
				if (item.getId().equals(id)) {
					nameid = item;
					break;
				}
			}
			return nameid;
		}
}
			


