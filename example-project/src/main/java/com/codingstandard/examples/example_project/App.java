package com.codingstandard.examples.example_project;

/**
 * Program Description goes here
 * 
 * @author Martha Sikwese
 * @date 19 April, 2019
 * @version 0.01
 * @copyright 2019 MSikwese Ltd. All rights reserved. 
 * 
 */

import com.codingstandard.examples.example_project.models.*;
import com.codingstandard.examples.example_project.services.*;

import java.security.InvalidParameterException;
import java.util.Date; 

import java.util.ResourceBundle; 
import javax.swing.DefaultListModel; 

import javax.swing.JList;


public class App {

	//* A class implementation comment can go here. * 
	//* classVar1 documentation comment *

	int length;
	int width;

	//Getters & Setters
	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setWidth(int width) {
		this.width = width;
	}


	public App(int length, int width) {
		this.length = length;
		this. width = width;
	}

	public int getArea() {
		return length * width;
	}
	
	public void setSize(int length, int width) throws InvalidParameterException
	{
		if (length < 0 || width < 0) {
			throw new InvalidParameterException();
	}
		this.length = length;
		this.width = width;
	}
public static void main( String[] args )
{
	System.out.println( "Hello Martha !" );
	App ans = new App (20, 55); 
	System.out.println("Area = " + ans.getArea());

}
}



