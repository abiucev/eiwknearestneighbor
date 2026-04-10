import java.io.*;
import java.sql.*;
import java.util.Scanner;
class fff
{
public static void main(String args[])throws IOException
{
feat f1=new feat();
}
}
class feat
{
int e=0;
String aa[]=new String[2000];
String bb[]=new String[2000];
String a1,b1;
int i=0,x=0;
ResultSet rs=null,rs1=null;
Connection con=null,con1=null;
Statement stmt=null,stmt1=null;
feat()
{
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:traindata");
stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
rs=stmt.executeQuery("Select * from tagipod");
	while(rs.next())
	{
	aa[i]=rs.getString("sentence");
	i++;
	}
	//System.out.println("aa");

}
catch(Exception ea)
{}
try
{
rs.close();
}
catch(Exception e)
{}
//for(int k=0;k<i;k++)
//System.out.println(aa[k]);
//System.out.println(i);
//System.out.println("\n");
try
{	
	//bb[0]=aa[0];
	for(int p=0;p<i;p++)
		{e=0;
		for(int q=p;q<i;q++)
			{
//System.out.println(aa[p]+"  "+aa[q]);
			if(aa[p].equals(aa[q]))
				{
				e++;
//System.out.println(e);
				}
			}
			if(e==1)
				{
				bb[x]=aa[p];
System.out.println(bb[x]);
				x++;
				}
		}
}
catch(Exception aa){}
try
{
for(int t=0;t<x+1;t++)
{
stmt.executeUpdate("insert into ipodopi values('"+bb[t]+"')");
System.out.println(":");
}
System.out.println(x);
}
catch(Exception aaa){}
try
{
rs.close();
stmt.close();

con.close();
}
catch(Exception e)
{}
}
}




