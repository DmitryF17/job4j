package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;

public class AttachmentSort {
	public static void main(String[] args) {
		List<Attachment> attachments = Arrays.asList(
		new Attachment("image 1", 100),
		new Attachment("image 2", 34),
		new Attachment("image 3", 13)
		);
		Comparator comparator = new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return  ((Attachment) o1).getSize() - ((Attachment) o2).getSize();
			}
		};
		attachments.sort(comparator);
		System.out.println(attachments);

		Comparator comparator1 = new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((Attachment) o1).getName().compareTo(((Attachment) o2).getName());
			}
		};
		attachments.sort(comparator1);
		System.out.println(attachments);
	}
}

