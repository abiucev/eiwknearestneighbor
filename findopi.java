import java.io.*;
import java.util.Scanner;
import java.sql.*;
class findopi
{
	public static void main(String args[])
	{
read r1=new read();
	}
}
class read
{
int m=0;
ResultSet rs=null,rs1=null;
Connection con=null;
Statement stmt=null;
read()
{
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:traindata");
stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
try
{
rs.close();
}
catch(Exception ee){}
String aa="",ab="";
	File file=new File("C:/Users/acer/Desktop/abi/ipodtagged.txt");
		try
		{
		Scanner input=new Scanner(file);
		while(input.hasNext())
		{
			String word1=input.next();
                                                
			if(word1.contains("_JJ"))
			{
//System.out.println("a");
aa=word1;
String se[]=aa.split("_");
stmt.executeUpdate("insert into tagipod values('"+m+"','"+se[0]+"')");
System.out.println(se[0]);
m++;
			}
			else
			if(word1.contains("|_VB"))
			{
System.out.println("a");
aa=word1;
String se[]=aa.split("_");
stmt.executeUpdate("insert into tagcan values('"+m+"','"+se[0]+"')");
System.out.println(se[0]);
m++;
			}
		}
		}
catch(Exception err){}
}
catch(Exception tt){}
}
}

