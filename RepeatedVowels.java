
/**
A program to show the number of repeated vowels from a text file as well as plot a histogram.
*/
import java.util.Scanner;

public class RepeatedVowels{
public static void main(String args[]){
int[] vowel_amount = new int[5];
char[] vowels = {'a','e','i','o','u'};

Scanner scan = new Scanner(System.in);

while(scan.hasNextLine()){
	String sentence = scan.nextLine();
	Scanner scan2 = new Scanner(sentence);
	while(scan2.hasNext()){
		String sentence2 = scan2.next();
		sentence2.toLowerCase();
		for(int i=0;i<sentence2.length()-1;i++){
			for(int j=0;j<vowel_amount.length;j++){
				if(sentence2.charAt(i)==vowels[j] && sentence2.charAt(i+1) == vowels[j]){
					vowel_amount[j]++;
				}
			}
		}
	}
}

System.out.println("aa:  " +vowel_amount[0]);
System.out.println("aa:  " +vowel_amount[1]);
System.out.println("aa:  " +vowel_amount[2]);
System.out.println("aa:  " +vowel_amount[3]);
System.out.println("aa:  " +vowel_amount[4]);
System.out.print("\n");

double log_a = Math.log(vowel_amount[0]);
double log_e = Math.log(vowel_amount[1]);
double log_i = Math.log(vowel_amount[2]);
double log_o = Math.log(vowel_amount[3]);
double log_u = Math.log(vowel_amount[4]);



System.out.print("aa||");
for(int aasterik = 0 ; aasterik< log_a ;aasterik++){
	System.out.print("*" + "\t");
}
System.out.println();

System.out.print("ee||");
for(int easterik = 0 ; easterik< log_e ;easterik++){
	System.out.print("*" + "\t");
}

System.out.println();

System.out.print("ii||");
for(int iasterik = 0 ; iasterik< log_i ;iasterik++){
	System.out.print("*" + "\t");
}

System.out.println();

System.out.print("oo||");
for(int oasterik = 0 ; oasterik< log_o ;oasterik++){
	System.out.print("*" + "\t");
}

System.out.println();

System.out.print("uu||");
for(int uasterik = 0 ; uasterik< log_u ;uasterik++){
	System.out.print("*" + "\t");
}

    System.out.println("\n");
	System.out.println("__________________________");
	System.out.println("     1 2 3 4 5 6 7 8 9 10");



	System.out.println("aa: " + vowel_amount[0]);
	System.out.println("ee: " + vowel_amount[1]);
	System.out.println("ii: " + vowel_amount[2]);
	System.out.println("oo: " + vowel_amount[3]);
	System.out.println("uu: " + vowel_amount[4]);
	}

}


			

