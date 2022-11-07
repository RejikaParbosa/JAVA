// To illustrate the us eof "Constructor Overloaidng"

import java.io.*;
class Room
{
	int length;
	int breadth;
	Room(int x, int y)
	{
		length = x;
		breadth = y;
	}
	Room(int x)
	{
		length = breadth = x;
	}
	int area()
	{
		return(length * breadth);
	}
}

class overload
{
	public static void main(String args[])
	{
		int area1;
		Room ob = new Room(25,15);
		Room ob1 = new Room(20);
		area1 = ob1.area();
		System.out.println("Area: " + area1);
	}
}
