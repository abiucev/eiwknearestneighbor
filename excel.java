import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.sql.*;
class excel
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
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:dataset");
stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

rs=stmt.executeQuery("Select * from [Sheet1$]");
System.out.println("aa");
	while(rs.next())
	{
	aa[i1]=rs.getString("text");
System.out.println(aa[i1]);
i1++;
}}
catch(Exception err){}
try
{rs.close();}
catch(Exception ee){}
}}
