package com.pratice;

public class Movie {
	String movie_name;
	String hero;
	String heroian;
	double budget;

	public Movie() {
		this("varsham", "prabhas");
		System.out.println("no args");
	}


	public Movie(String movie_name, String hero) {
		this("varsham", "prabhas","Trisha");
		System.out.println("2 args");
	}
	public Movie(String movie_name, String hero,String heroian) {
		this("varsham", "prabhas","Trisha",1009.65);
		System.out.println("3 args");
		
	}
	public Movie(String movie_name, String hero, String heroian, double budget) {
		this.movie_name = movie_name;
		this.hero = hero;
		this.heroian = heroian;
		this.budget = budget;
	}

	public static void main(String[] args) {
		System.out.println("main method");
		Movie m = new Movie();
		Movie m1 = new Movie();
		Movie m2 = new Movie("Darling","Prabhas","Kajal");
		m.display();
		System.out.println("______________________________________________");
		m1.display();
		System.out.println("______________________________________________");
		m2.display();


	}

	void display() {
		System.out.println("movie name:" + movie_name);
		System.out.println("hero name: " + hero);
		System.out.println("heroian name: " + heroian);
		System.out.println("budget movie" + budget);
	
	}

}
