
import java.io.*;
import java.net.*;
public class server {

	public static void main(String[] args) {
	
		try{
			System.out.println(" server started...");
			String messIn="";
			String messOut="";
			ServerSocket ss = new ServerSocket(4321); // server ip and port
			Socket s = ss.accept();
			//creates output/inut streams
			DataInputStream dis = new DataInputStream(s.getInputStream()); //grabs input
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());//grabs output
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			while (!messIn.equals("exit")){ //runs till message is not exit
				messIn = dis.readUTF();//reads the message
				System.out.println(messIn);//print client message
				messOut= br.readLine(); //grabs the outgoing message and saves it
				dos.writeUTF(messOut);// writes the outgoing message
				dos.flush(); //flush the buffer
				
			}
			ss.close();
			System.out.println(" server closed...");
		}catch (Exception e){
			
			
	}

	}
}
