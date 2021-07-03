package com.kdroid.kotlintuts.codingquestion.arrays;

public class CloneArray {

	public static void main(String[] args) {

		Dog[] dogs = new Dog[4];
		dogs[0] = new Dog("a");
		dogs[1] = new Dog("b");
		dogs[2] = new Dog("c");
		dogs[3] = new Dog("d");
		
	    Dog[] myDogsClone = dogs.clone();
//	    System.out.println(dogs[0] == myDogsClone[0] ? "Same":"Different");
//	    System.out.println(dogs[1] == myDogsClone[1] ? "Same":"Different");
//	    System.out.println(dogs[2] == myDogsClone[2] ? "Same":"Different");
//	    System.out.println(dogs[3] == myDogsClone[3] ? "Same":"Different");
	    myDogsClone[0].setName("Ruff"); 
	   
	    for (Dog dog : dogs) {
			System.out.println(dog.getName());
		}
	    
	    int[] a = {1,2,3};
	    int[] b = a.clone();

	  //  System.out.println(a == b ? "Same Instance":"Different Instance");
	    //Outputs different instance


	}

	

}

class Dog {

	private String name;

	public Dog(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
