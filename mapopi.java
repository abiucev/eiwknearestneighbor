import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.sql.*;
class mapopi
{
	public static void main(String args[])
	{
read1 r1=new read1();
	}
}
class read1
{
ResultSet rs=null,rs1=null;
Connection con=null;
Statement stmt=null;
String strLine1;
read1()
{
int[] m=new int[5];
int[] cl=new int[5];
int p=0,n=0,zz=0;
int i1=0, z=0,i=0,i2=0,d=0,ii=0,hh=0;
String senti="";
String[] aa=new String[2000];
String[] cc=new String[2000];
String[] bb=new String[2000];
int[] dd=new int[2000];
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:traindata");
stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
rs=stmt.executeQuery("Select * from feaipod");
	while(rs.next())
	{
	aa[i1]=rs.getString("feature");
	bb[i1]=rs.getString("sentence");	
i1++;
	}
rs1=stmt.executeQuery("Select * from opi");
	while(rs1.next())
	{
	cc[i2]=rs1.getString("sentimenttext");
	dd[i2]=rs1.getInt("sentiment");
	i2++;
	}
for(int b=0;b<i1;b++)
{
Scanner input=new Scanner(bb[b]); 
	//System.out.println(input);
	while(input.hasNext())
	{
	String word1=input.next();
	
	for(int a=0;a<i2;a++)
		{
			String word2=cc[a];
			if(word1.equals(word2))
			{
System.out.print(word1);
System.out.println(word2);

				d=dd[a];	
System.out.print(d);
				if(d==0)
				n++;
				else
				p++;
			}
		}
	}
	
hh=p-n;
if(hh>0&&((p/2)>n))
senti="SP";
else if(hh>0&&((p/2)<n))
senti="WP";
else if(hh<0&&((n/2)>p))
senti="SN";
else if(hh<0&&((n/2)<p))
senti="WN";
else if(hh==0)
senti="M";
//System.out.println(p);
try
{
stmt.executeUpdate("insert into ipodsen values('"+ii+"','"+aa[b]+"','"+bb[b]+"','"+p+"','"+n+"','"+hh+"','"+senti+"')");
			ii++;
			System.out.println(ii);
}
catch(Exception sss){}
p=0;
n=0;
}
}
catch(Exception err){}
try
{rs.close();
rs1.close();}
catch(Exception ee){}
}
}

