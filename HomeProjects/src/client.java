
import java.io.*;
import java.net.*;

public class client {

	public static void main(String[] args) {
		try{
			System.out.println(" client started.....");
			String messIn="";
			String messOut="";
			Socket cs = new Socket("127.0.0.1",4321); // server ip and port
		
			//creates output/inut streams
			DataInputStream dis = new DataInputStream(cs.getInputStream()); //grabs input
			DataOutputStream dos = new DataOutputStream(cs.getOutputStream());//grabs output
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			while (!messIn.equals("exit")){ //runs till message is not exit
				
				messOut= br.readLine(); //grabs the outgoing message and saves it
				dos.writeUTF(messOut);// print server message
				messIn = dis.readUTF();//reads the message
				System.out.println(messIn);// prints the server message
				dos.flush(); //flush the buffer
				
			}
			cs.close();
			System.out.println("client closed");
			
		}catch (Exception e){
			
			
			
			
		}
	}

}