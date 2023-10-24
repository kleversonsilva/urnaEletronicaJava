package Servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Alberto
 */
public class AServidorTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        while (true) {
            
//                Socket soc = server.accept();
            
//                new Thread(new AServidor(soc,server)).start();
            new Thread(new AServidor()).start();
            
//        }
    }

}
