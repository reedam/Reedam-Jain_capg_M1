import java.util.Scanner;

public class PasswordGenerator {
	String str1,str2;
	int num,n;
	int len1=0;
	int len2=0;
	Scanner sc=new Scanner(System.in);
	
	void getData()
	{
		System.out.println("Enter string1=");
		str1=sc.nextLine();
		System.out.println("Enter string2=");
		str2=sc.nextLine();
		System.out.println("Enter number1=");
		num=sc.nextInt();
		System.out.println("Enter number2=");
		n=sc.nextInt();
	}
	
	StringBuilder newPassword(String s1,String s2,int n1,int n2)
	{
		String temp=Integer.toString(num);
		StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder(temp);
		
		len1=s1.length();
		len2=s2.length();
		
		if(len1<len2)
		{
			sb1.append(s1.charAt(0));
		}
		else if(len1==len2)
		{
			char temp1=s1.charAt(0);
			char temp2=s2.charAt(0);
			if(temp1<temp2)
			sb1.append(temp1);
			else 
				sb1.append(temp2);
		}
		else 	
			sb1.append(s2.charAt(0));
		if(len1<len2)
			sb1.append(s2);
		else
			sb1.append(s1);
		System.out.println(sb2);
		sb1.append(sb2.charAt(n-1));
		sb2.reverse();
		sb1.append(sb2.charAt(n-1));
		for(int i=0;i<sb1.length();i++)
		{
			 char c=sb1.charAt(i);
			    if (Character.isLowerCase(c)) {
			        sb1.setCharAt(i, Character.toUpperCase(c));
			    } else {
			        sb1.setCharAt(i, Character.toLowerCase(c));
			    }
		}
		return sb1;
	}
		public static void main(String[] args) {
			PasswordGenerator obj=new PasswordGenerator();
			obj.getData();
			System.out.println(obj.newPassword(obj.str1,obj.str2,obj.num,obj.n));
			

		}
		
	}
