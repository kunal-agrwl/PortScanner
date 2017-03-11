import java.net.*;
import java.util.*;
class Port
{
	public static void main(String args[])
	{
			int start_port=0, end_port=0;
			String host="www.google.com";
			Socket socket;
			try
			{
				start_port=Integer.parseInt(args[0]);
				end_port=Integer.parseInt(args[1]);
				System.out.println("Start port is : " + start_port);
				System.out.println("End port is : " + end_port);
				for(int i=start_port; i<=end_port; i++)
				{
					//System.out.println(i);
					try
					{
						socket=new Socket();
						socket.connect( new InetSocketAddress(host, i), 300);
						System.out.println("Port no. " + i + " is in listening mode " );
					}
					catch(Exception e)
					{
						//System.err.println("Error");
						//System.err.println(e);
					}
				}
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				//System.err.println(e);
				System.err.println("Usage : java <start_port> <end_port> ");
				//System.exit(1);
			}	
	}
}
