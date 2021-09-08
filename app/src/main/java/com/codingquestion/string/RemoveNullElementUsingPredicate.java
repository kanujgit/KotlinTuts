package com.codingquestion.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 
 * @author anuj Remove elements from a List that satisfy given predicate in Java
 *
 */
public class RemoveNullElementUsingPredicate {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(Arrays.asList("Anuj", null, "kdroid"));
		//System.out.println(list);

		// creating predicate using null
		// Creating a Predicate condition checking for null
		Predicate<String> isNull = item -> Objects.nonNull(item);

		// Removing nulls using iterator and Predicate
	//	list = removeNullUsingIterator(list, isNull);

		Predicate<String> isRemove = item -> (item != "Anuj" && item !=null);
		//list = removeAllElement(list, isRemove);
		list = removeAllElementByLambda(list);
		// Print the list
		System.out.println("List  values removed: " + list);

	}

	private static <T> List<T> removeAllElement(List<T> list, Predicate<T> p) {
		Collection<T> collections = new ArrayList<>();
		for (T t : list) {
			if (p.test(t)) {
				collections.add(t);
			}
		}
		System.out.println("Print all remove element " + collections);

		list.removeAll(collections);
		return list;
	}
	private static <T> List<T> removeAllElementByLambda(List<T> list) {
		
//		list = list.stream().filter(p).collect(Collectors.toList());
		list = list.stream().filter(item->(item!=null)).collect(Collectors.toList());
		return list;
	}

	private static <T> List<T> removeNullUsingIterator(List<T> list, Predicate<T> p) {
		Iterator<T> iterator = list.iterator();
		while (iterator.hasNext()) {
			// Fetching the next element
			T t = iterator.next();
			// Checking for Predicate condition
			if (!p.test(t)) {

				// If the condition matches,
				// remove that element
				iterator.remove();
			}
		}
		return list;
	}

}
