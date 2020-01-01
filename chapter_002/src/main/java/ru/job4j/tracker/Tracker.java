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
			return items[indexOf(id)];
				}
	public Item[] replace(String id, Item item) {
		Item[] rpl = new Item[position];
         items[indexOf(id)] = item;
            return rpl;
	}
	public Item[] delete(String id) {
		int position = 4;
		Item[] item = new Item[position];
		int start = indexOf(id) + 1;
		int distPos = indexOf(id);
		int size = position - indexOf(id) - 1;
		System.arraycopy(item, start, item, distPos, size);
		position--;
		item[position] = null;
		return item;
	}
	private int indexOf(String id) {
		int rsl = -1;
		for (int index = 0; index < position; index++) {
			if (items[index].getId().equals(id)) {
				rsl = index;
				break;
			}
		}
		return rsl;
	}
}
			


