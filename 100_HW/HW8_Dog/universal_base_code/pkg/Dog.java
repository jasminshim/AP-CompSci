package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
		String name; 
		int age;
		String breed; 
	public Dog() {
		name = "clifford";
		age = 3;
		breed = "big red dog"; 
	}
	public Dog(String n){
		name = n;
		age = 1;
		breed = "dog dog";
	}
	public Dog(String n, String b){
		name = n;
		age = 1;
		breed = b;
	}
	public Dog(String n, int a){
		name = n;
		age = a;
		breed = "dog dog";
	}
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	
	public void setName(String n){
		n = name;
	}
	public void setAge(int a){
		a = age;
	}
	public void setBreed(String b){
		b = breed;
	}
	
	public boolean isSleeping(){
		if((int)(Math.random()*2)+1 == 1){
			return true;
		}
		return false;	
	}
	public void bark(){
		System.out.println(name + " is barking!");
	}
	
	}


