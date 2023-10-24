package Servidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import projetoeleitoral.Principal;

/**
 *
 * @author Alberto
 */
public class AServidor implements Runnable {

    ServerSocket server;
    Socket client;
    Principal p = new Principal();

    public AServidor() {
//        this.client = a;
//        this.server = s;
    }

//public void go() throws IOException{
//    ObjectInputStream ois = null;
//  try{
////    server = new ServerSocket( 2900 );
////    client = server.accept();
//    System.out.println("Servidor ligado.\n Esperando solicitação.");
//    ois = new ObjectInputStream( client.getInputStream() );
////    SerializeiDocumet sdoc = (SerializeiDocument) ois.readObject();
//    Urna urna = (Urna) ois.readObject();
//    //Pronto... sdoc está pronto para ser usado no servidor...
//    }catch( Exception e ){}
//    finally{ 
//      ois.close();
//      client.close();
//   }
// }
    @Override
    public void run() {
        ObjectInputStream in = null;
        ObjectOutputStream out = null;
        try {
            server = new ServerSocket(3000);
            client = server.accept();
            System.out.println("Servidor ligado.\nEsperando solicitação.");
            
            in = new ObjectInputStream(client.getInputStream());
            out = new ObjectOutputStream(client.getOutputStream());
            
            String mens;

            mens = "CLIENTE CONECTADO";
            out.writeUTF(mens);

            mens = in.readUTF();
            System.out.println("mensagem recebida: " + mens);

            out.writeUTF("OK");

            UrnaAAA urna = new UrnaAAA();
            out.writeObject(urna);

//            out.writeUTF("OK");
            if (mens.equalsIgnoreCase("sair")) {
//                break;
            }

//            Urna urna = (Urna) ois.readObject();
            //Pronto... sdoc está pronto para ser usado no servidor...
        } catch (Exception e) {
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(AServidor.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
