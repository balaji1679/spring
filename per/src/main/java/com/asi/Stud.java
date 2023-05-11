package com.asi;

public class Stud {
private int roll_num;
private  String Name;
private int English; 
private int History ;
private int Geography ;
private int Maths ;
public Stud(int roll_num, String name, int english, int history, int geography, int maths) {
	super();
	this.roll_num = roll_num;
	Name = name;
	English = english;
	History = history;
	Geography = geography;
	Maths = maths;
}
public void perce() {
	System.out.println("Student  roll_num="+this.roll_num);
	System.out.println("Studen  name="+this.Name);
	System.out.println("Marks of english="+this.English);
	System.out.println("Marks of history="+this.History);
	System.out.println("Marks of geography="+this.Geography);
	System.out.println("Marks of maths="+this.Maths);
	System.out.println("value of percen="+((this.English+this.History+this.Geography+this.Maths)/4));
}
}
