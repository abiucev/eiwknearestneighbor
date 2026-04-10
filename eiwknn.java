import java.io.*;
import java.util.Scanner;
import java.sql.*;
class eiwknn
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
read()
{
int[] m=new int[5];
int[] cl=new int[5];
int p=0,n=0,zz=0;
int i1=0, z,i=0,i2=0,d=0,ii=0,hh=0;
String[] aa=new String[2000];
String[] cc=new String[2000];
int[] bb=new int[2000];
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:traindata");
stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		rs=stmt.executeQuery("Select * from sheet");
		
//System.out.println("aa");	
while(rs.next())
	{
//System.out.println("aa");
	aa[i1]=rs.getString("text");
	bb[i1]=rs.getInt("class");
	i1++;
	}
rs1=stmt.executeQuery("Select * from ipodopi");
	while(rs1.next())
	{
	cc[i2]=rs1.getString("sentence");
	i2++;
//System.out.println("aa");
	}
//System.out.println("aa");
for(int b=0;b<i2;b++)
{
String tem=cc[b];
m[0]=tem.length();
m[1]=tem.length();
m[2]=tem.length();
m[3]=tem.length();
m[4]=tem.length();
for(int a=0;a<i1;a++)
{
hh=0;
Scanner input=new Scanner(aa[a]); 	
	while(input.hasNext())
		{
			String word1=input.next();
			if(tem.length()==word1.length())
			{
				if(word1.compareTo(tem)==0)
				{
				d=0;
				}
				else
				{
				d=0;
					for(i=0;i<tem.length();i++)
					{
					if(tem.charAt(i)!=word1.charAt(i))
					++d;
					}
				}
			}
			if(d<tem.length())
			{
			if(d<m[0])
			{
			m[0]=d;
			cl[0]=bb[a];
			}
			else if(d<m[1])
			{
			m[1]=d;
			cl[1]=bb[a];
			}
			else if(d<m[2])
			{
			m[2]=d;
			cl[2]=bb[a];
			}			
			else if(d<m[3])
			{
			m[3]=d;
			cl[3]=bb[a];
			}				
			else if(d<m[4])
			{
			m[4]=d;
			cl[4]=bb[a];	    		
			}
			}
		}		
}
for(int ok=0;ok<5;ok++)
{
if(cl[ok]==0)
n++;
else
p++;
//System.out.println(n);
//System.out.println(p);
}
if(p>n)
zz=1;
else
zz=0;
	stmt.executeUpdate("insert into opi values('"+ii+"','"+zz+"','"+tem+"')");
			ii++;
			System.out.println(ii);
p=0;
n=0;
}
}
catch(Exception err){}
try
{rs.close();}
catch(Exception ee){}
}
}


