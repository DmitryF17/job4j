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
			return Arrays.copyOf(this.items, this.position);
		}
		public Item[] findByName(String key) {
			Item[] nameskey = new Item[position];
			int size = 0;
			for (int index = 0; index < position; index++) {
				Item item = this.items[index];
				if (item.getName().equals(key)) {
					nameskey[size] = item;
					size++;
				}
			}
        return Arrays.copyOf(nameskey, size);
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
			


