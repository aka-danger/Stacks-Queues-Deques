import java.util.Scanner;
import java.util.StringTokenizer;

import DList.DList;
import SList.SList;


public class Main {
	
	static String [] array = {"huh...", "what bitch?", "dafaq you talking bout", "get the fuk out of here","i cant understand fuckboi","ill slap u bitch",
			"dirty hoe fucking talking shit", "hey poes what u saying", };
 	
	
	private static void print(Object string){
		System.out.println(string);
	}
	
	static DList<Integer> list = new DList<Integer>();
	static SList<Integer> list2 = new SList<>();
	
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
	
	public static void stack(){
		boolean running = true;
		Scanner in = new Scanner(System.in);
		print("#Stack#");
		print("end - end program");
		print("push- add value [CMD][VALUE]");
		print("pop - remove top value and print");
		print("peek - look at top value");
		while(running){
			String unknown = array[Tools.randomInt(0, 7)];
			
			print("----------------------------------");
			print("enter command:");
			
			StringTokenizer line = new StringTokenizer(in.nextLine());
			String command = line.nextToken();
			
			switch(command.toUpperCase()){
				case "END":
					print("ending...");
					in.close();
					running = false;
					break;
				case "PUSH":{
					int value = Integer.parseInt(line.nextToken());
					list2.push(value);
					print(list2.toString());
					break;
				}
				case "POP":{
					print(list2.pop());
					print(list2.toString());
					break;
				}
				case "PEEK" :{
					print(list2.top());
					print(list2.toString());
					break;
				}
				
				default:
					print(unknown);
					
					break;
			}
		}
		in.close();
	}
	
	public static void que(){
		
	}
	
	public static void options(){
		boolean running = true;
		Scanner in = new Scanner(System.in);
		print("#Options#");
		print("1) Stack");
		print("2) que");
		print("3) deque");
		print("0) exit");
		while(running){
			String unknown = array[Tools.randomInt(0, 7)];
			
			print("----------------------------------");
			print("enter command:");
			
			StringTokenizer line = new StringTokenizer(in.nextLine());
			int value = Integer.parseInt(line.nextToken());
			
			switch(value){
				case 0:
					print("ending...");
					in.close();
					running = false;
					break;
				case 1:{
					stack();
					break;
				}
				case 2:{
					print("nothin found");
					
					break;
				}
				case 3 :{
					deque();
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
		options();
	}
}
