package task102;

import java.util.Scanner;

public class Main {
	public void main(){
	Scanner sc = new Scanner(System.in);
	String text = sc.nextLine();
	sc.nextLine();
	String a = sc.nextLine();
	String[] parts = text.toLowerCase().split("[ ,]");
	for(int i = 0;i<parts.length;i++)
	{
		if (a.equals(parts[i])) {
			System.out.println("This word exist in the sentence : "+parts[i]);
		} else {
			System.out.println("There is no such word : "+parts[i]);
		}
		sc.close();
	}}}
