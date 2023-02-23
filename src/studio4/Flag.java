package studio4;

import java.awt.Color;
import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(StdDraw.GRAY);
		StdDraw.filledSquare(1, 1, 1);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledRectangle(.5, .5, .3, .2); //10 points for a 5 point star
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledEllipse(.3,.6,.025,.025);
		StdDraw.filledEllipse(.4, .65, .015, .015);
		StdDraw.filledEllipse(.38, .57, .015, .015);
		StdDraw.filledEllipse(.34, .49, .015, .015);
	}
}