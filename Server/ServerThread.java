package Server;

public class ServerThread extends Thread{
    ReceiverServer rs;
    public void run() {
        System.out.println("in run");
        ReceiverServer.serverstatus=true;
        rs=new ReceiverServer();
    }
    
}
