import java.util.Scanner;
import java.util.StringTokenizer;

import DList.DList;


public class Main {
	
	static String [] array = {"huh...", "what bitch?", "dafaq you talking bout", "get the fuk out of here","i cant understand fuckboi","ill slap u bitch",
			"dirty hoe fucking talking shit", "hey poes what u saying", };
	
	private static void print(Object string){
		System.out.println(string);
	}
	
	static DList<Integer> list = new DList<Integer>();
	
	
	private static String input(String print){
		Scanner in = new Scanner(System.in);
		print(print);
		String value = in.nextLine();
		in.close();
		return value;
	}
	
	
	public static void deque(){
		boolean running = true;
		
		Scanner in = new Scanner(System.in);
		
		
		while(running){
			String unknown = array[Tools.randomInt(0, 7)];
			print("enter command:");
			
			StringTokenizer line = new StringTokenizer(in.nextLine());
			String command = line.nextToken();
			
			switch(command.toUpperCase()){
				case "END":
					print("ending...");
					in.close();
					running = false;
					break;
				case "ADDLAST":{
					Integer value = Integer.parseInt(line.nextToken());
					list.addLast(value);
					print(list.toString());
					break;}
				case "ADDFIRST":{
					Integer value = Integer.parseInt(line.nextToken());
					list.addFirst(value);
					print(list.toString());
					break;}
				case "REMOVELAST":{
					print(list.removeLast());
					print(list.toString());
					break;
				}
				case "REMOVEFIRST":{
					print(list.removeFirst());
					print(list.toString());
					break;
				}
				case "GETFIRST":{
					print("firs element:");
					print(list.first());
					print(list.toString());
					break;
				}
				case "GETLAST":{
					print("last element:");
					print(list.last());
					print(list.toString());
					break;
				}
				
				default:
					print(unknown);
					
					break;
				
			}
		}
		in.close();
	}
	
	
	public static void main(String [] args){
		deque();
	}
}
