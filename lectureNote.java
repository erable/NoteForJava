/* Lecture 2 January 6th 
 * topic 2 basix javaI;
 * file I/O;
 * Java tool: BlueJ;JDK plus text editor; Eclipse;
 * semi-colon  (;) is for separate but not the new line and the space;
 * i++ is means adding up 1 for i, int means integer --> for (int i = 1; i < n; i++ );
 * dynamic typing: must run program to determine the types of expressions 
 * java use static typing: declared with a type --> int x = 14;
 * a variable must be declared before you use !! (the variable would not compile until you declare)
 * 
 * 
 */

// create a new class, same as the name in file 
public class lectureNote { 
	// create the method named main 
	public static void main(String[] args) {
		// indentation problem 
		
		if ( n > 10){ 
			a = 1;b = 2;
		} // the whole brace { } is the group of statement 
		// c = 3; 
		 * 
		 */

	} // end main 


/* question:
 * 1. what is file I/O 
 * 2. 
 * 
 */
 

 /* Lecture 3 January 8 th;
  * 45
  * topc 2 basic java II;
  * basic type used mostly: int and double 
  * final(ketword): Pi is constant and it is not a variable; 
  *  result of 1/3 results is int, which is 0 --> put it in the end of multiplication / let it *1.0 / (double)1/3;
  *  type string: string is object in java 
  *  string is not the list/arrays of character
  *  'a' are type char, single character, unicode from america; "a" is type string;
  *  double equal: it is not equal --> if (s1 == s2) changes into: if (s1.equals(s2));
  *  single euqal: mathematic equal;
  *  
  */
	public static void mainSec(String[] args){
		String month = "January";
		char c = month.charAt(2);
		
		String sub = month.charAt(2,5);
		
		String x = "abc";
		String y = "def";
		// value of x + y? yes, connotation 
		
		// output as string even it is int+ string 
		int a = 6;
		int b = 9;
		System.out.printLn("The total is:" + a + b ); // The total is 96
		System.out.printLn(a + b + "The total is:"); // 15 The total is, run from left to right
		
		String a = "apple";
		String b = "banana";
		int val  a.compareTo(b); // come out as the boolean answer if two output, but there are three in returns here < = >;
		
		import java.util.*;
		
		Scanner keyword = new Scanner(System.in); // create a Scanner object;
		System.out.print("enter yout name(first and last):" ) // why it just the print, not println;
		keyword.next(): String ;
		keyword.nextline()
		
		//???? unfinish 
		keyword.hasNextInt(); // true it is an int;
		
		if (!Keyin.hasNext()){
			Stsrem.out.println("no first name");
			return;
			
		for (;;){// infinity, exit until break 
			
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
	}
	
	
} // end class lectureNote
