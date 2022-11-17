package com.example.singletontest;
class ConnectionType  // make it as singleton
{
	private static ConnectionType c;
	private ConnectionType()
	{
		
	}
	public static ConnectionType getConnectionType()
	{
		if(c==null)
		{
			System.out.println("h4e");
			c=new ConnectionType();
			return c;
		}
		else
			return c;
		
	}
	
}
public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ConnectionType c1=new ConnectionType();
		
		//ConnectionType c2=new ConnectionType();
		
		//ConnectionType c3=new ConnectionType();
		
		ConnectionType c1=ConnectionType.getConnectionType();
		ConnectionType c2=ConnectionType.getConnectionType();
		ConnectionType c3=ConnectionType.getConnectionType();

		
		System.out.println(c1.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c2.hashCode());
	}

}
