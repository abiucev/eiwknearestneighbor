import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.sql.*;
class map
{
	public static void main(String args[])
	{
read r1=new read();
	}
}
class read
{
ResultSet rs=null,rs1=null;
Connection con=null;
Statement stmt=null;
String strLine1;
read()
{
int i1=0, z,i=0;
String[] aa=new String[1000];
String[] fea={"flash","memory","card","LCD","resolution","camera","picture","battery","software","apple","music","MP3","Screen","quality","size","charge","iTunes","Computer","iPod","Flash","Memory","Card","Resolution","Camera","Picture","Battery","Software","Apple","Music","screen","Quality","Size","Charge","computer"};
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:traindata");
stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
rs=stmt.executeQuery("Select * from sencam");
	while(rs.next())
	{System.out.println("aa");
	aa[i1]=rs.getString("sentence");
i1++;
}
for(int a=0;a<i1;a++)
{
Scanner input=new Scanner(aa[a]); 
int rr=1;
		while(input.hasNext())
		{
			String word1=input.next();
			for(z=0;z<34;z++)
			{
			if(word1.contains(fea[z]))
			{
 rr=0;
			System.out.println(aa[a]);
			try{
			stmt.executeUpdate("insert into fesencam values('"+aa[a]+"')");
				i++;
			}
			catch(Exception eeee){}
			}
if(rr==0) break;
			}
	    	}
}
}
catch(Exception err){}
try
{rs.close();}
catch(Exception ee){}
}
}
