package package1;     //This java file is inside package named package1 inside src folder.
import java.util.*;       //importing all classes from java's util library.. Because it has Arrays class which has many inbuilt functions used in this program.

/*
 * This assignment helped me to master the concepts of sorting of Strings and sorting of characters inside the String. 
 */

public class Assignment7_2    //Class declaration containing main function. 
{
	public static void main(String[] args)     //main function declaration. and because it is static, program execution starts from main function. 
	{
		String mainString="I have learnt Java and Android courses from ACADGILD";    //Generated the String to sort the data as asked in the problem statement.
		
		System.out.println("I have learnt Java and Android courses from ACADGILD\n");
		String[] wordArray= mainString.split(" ");
		       //Creating array of words which are space seperated in the String.
		       //For that we have used the function split() to seperate the word and passes single space to chooce seperating parameter.
		
		Arrays.sort(wordArray,String.CASE_INSENSITIVE_ORDER);
		     //We have used inbuilt function sort() of Arrays class to sort the words in the String.
		     //We have passed the first parameter as array of string and second parameter as inbuilt comparator which will ignore the case sensitivity.
		     //So, this sorting is case insensitive.
		
		int arrayLength=wordArray.length;      //Finding length of array of Strings.
		
		//for loop to sort characters of every word.
		for(int i = 0 ; i < arrayLength ; i++)
		{
			char[] charsWord = wordArray[i].toCharArray();
			          //Converting characters of each word of string array to character array to sort.
			          //To convert, we have used the function toCharArray() of Arrays class located in java.util library.
			
			Arrays.sort(charsWord);     //sort() function of Arrays class to sort the array of characters.
			
			String newWord=new String(charsWord);     //Converting String again from sorted characters by passing char array in the constructor of String class.
			
			wordArray[i]=newWord;             //Assigning new value to the word of String array.
		}
		
		//Now, we are trying to recreate the whole sentence by the help of StringBuilder.
		StringBuilder sortedString=new StringBuilder(mainString.length());    //Creating object of StringBuilder class to create sorted words of original String.
		
		//for loop for creating the sorted String by array of  Strings.
		for(int i = 0 ; i < arrayLength ; i++)
		{
			sortedString.append(wordArray[i]);
			      //Appending String at the i'th place of sorted array of Strings to the sorted string by use of append() function of StringBuilder class.
			sortedString.append(" ");
			      //Appending space after each word of String.
		}
		
		System.out.println(sortedString.toString());     //Printing sorted String.
		      //We have used toString() function of String class to convert StringBuilder object to String.
		
	}     //End of main function.

}      //End of class.
