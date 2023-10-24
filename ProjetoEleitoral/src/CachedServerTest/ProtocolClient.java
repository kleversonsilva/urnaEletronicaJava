package CachedServerTest;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import projetoeleitoral.*;

/**

 */
public class ProtocolClient {
    Principal p;
    Urna u;
    
    public ProtocolClient(){
        p = new Principal();
        u = new Urna(p);
    }
    

    public static void main(String[] args) throws IOException {
        String fromUser;
        int[]votacao = new int[5];

        Socket s = new Socket("localhost", 4444);
        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));// cria um objeto que le do teclado
        while (true) {
            fromUser = stdIn.readLine();// o método readLine ler uma linha do teclado
            
            out.writeUTF(fromUser);
            System.out.println(in.readUTF());
            if (fromUser.equals("Bye")) {
                break;
            }
        }
        in.close();
        out.close();
        stdIn.close();
        s.close();
    }
}
