import java.awt.Component;
import java.util.Random;

import javax.swing.JOptionPane;


public class Tools {
	
	/**
	 * @param min min value
	 * @param max  maxt value
	 * @return random integer
	 * */
	public static int randomInt(int min , int max){
		Random random = new Random();
		return random.nextInt(max - min + 1) + min;
	}
	
	/**
	 * @param min min value
	 * @param max  maxt value
	 * @return random Double
	 * */
	public static  double randomDouble(int min, int max){
		Random random = new Random();
		return min + (max - min ) *random.nextDouble();
	}
	
	/**
	 * @param string string to be printed to the console
	 * */
	public static void print(Object string){
		System.out.println(string);
	}
	
	public static Object msgBox(Component parentComponent, String label,String textbox){
		String result = JOptionPane.showInputDialog(parentComponent,label, textbox);
		return (Object)result;
	}
}
