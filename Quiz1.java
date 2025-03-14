 //Quiz
import java.io.*;
import java.util.Scanner;
public class Quiz1
{
	public static void main(String args[])throws IOException
	{
		String name="";
		BufferedReader Name=new BufferedReader(new InputStreamReader(System.in));
		try
		{
		System.out.println("Who Are You ? Admin Or User");
		name=Name.readLine();
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
		if(name.equalsIgnoreCase("USER"))
		{
				int i=0;
		String s,s1;
		int score=0;
		char ch,ch1;
		Scanner sc=new Scanner(System.in);
		FileReader f= new FileReader("C:/Luqman/Question.txt");//file object for question file(change the file location where the file is saved)
		FileReader f2= new FileReader("./Question.txt");//file object for question file(change the file location where the file is saved)
		BufferedReader bf=new BufferedReader(f);
		FileReader f1= new FileReader("C:/Luqman/Answer.txt");// file object for answer file(change the file location where the file is saved)
		FileReader f3= new FileReader("./Answer.txt");// file object for answer file(change the file location where the file is saved)
		BufferedReader bf1=new BufferedReader(f1);
		while(true)
		{
		s=bf.readLine();//reading the question
		if (s==null)
		break;
		System.out.println(s);
		
		
		s=bf.readLine();//reading option a from question file 
		System.out.println(s);
		if (s==null)
		break;
		
		s=bf.readLine();//reading option b from question file
		System.out.println(s);
		if (s==null)
		break;
		
		s=bf.readLine();//reading option c from question file
		System.out.println(s);
		if (s==null)
		break;
		
		s=bf.readLine();//reading option d from question file
		System.out.println(s);
		if (s==null)
		break;
		
		System.out.println("Enter the correct option (a,b,c,d)");//taking answer as input
		ch=sc.next().charAt(0);
		
		
		s1=bf1.readLine();//reading the answer from the answer file
		ch1=s1.charAt(0);
		if(ch==ch1)//comparing the input answer with the correct answer
		{
			System.out.println("correct answer");
			score++;
		}
		else
		{
			System.out.println("wrong answer");
			//break;
		}
		
		}
		System.out.println("Your score is "+score);//displaying the score
		}

////

		else if(name.equalsIgnoreCase("ADMIN"))
		{
			int i=0;
		String q="";
		char ch;
		FileWriter f= new FileWriter("C:/Luqman/Question.txt",true);//file object for question file
		FileWriter f2= new FileWriter("./Question.txt",true);//file object for question file (change the file location where you want to save the file)
		BufferedWriter bf=new BufferedWriter(f);
		FileWriter f1= new FileWriter("C:/Luqman/Answer.txt",true);// file object for answer file
		FileWriter f3= new FileWriter("./Answer.txt",true);// file object for answer file(change the file location where you want to save the file)
		BufferedWriter bf1=new BufferedWriter(f1);
		//BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the question");
		q=sc.nextLine();//taking question as input
		bf.write(q);//writing question to the question file
		bf.write("\n");
		
		System.out.println("Enter option (a)");
		q=sc.nextLine();//taking option a as input
		bf.write("(a) ");
		bf.write(q);//writing to the question file
		bf.write("\n");
		
		System.out.println("Enter option (b)");
		q=sc.nextLine();//taking option b as input
		bf.write("(b) ");
		bf.write(q);//writing to the question file
		bf.write("\n");
		
		System.out.println("Enter option (c)");
		q=sc.nextLine();//taking option c as input
		bf.write("(c) ");
		bf.write(q);//writing to the question file
		bf.write("\n");
		
		System.out.println("Enter option (d)");
		q=sc.nextLine();//taking option d as input
		bf.write("(d) ");
		bf.write(q);//writing to the question file
		bf.write("\n");
		
		System.out.println("Enter the correct option (a,b,c,d)");
		q=sc.nextLine();//taking answer as input
		bf1.write(q);//writing to the answer file
		bf1.write("\n");
		
		
		bf.close();//closing question file
		bf1.close();//closing answer file
		}
			else
			System.out.println("Plz Enter Correct Option!!!");
		}
}
/*
<html>  
<body>  
<applet code="Quiz1.class" width="600" height="600">  
</applet>  
</body>  
</html>  
*/