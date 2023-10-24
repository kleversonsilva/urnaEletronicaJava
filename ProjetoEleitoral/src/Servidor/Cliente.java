package Servidor;

import java.net.*;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Roberto Nóbrega
 */
public class Cliente {
    
    private static String valor1, valor2;
    
    public String getValor1(){
        
        return valor1;
        
    }
    
    public void setValor1(String valor1){
        
        this.valor1 = valor1;
        
    }
    
    public String getValor2(){
        
        return valor2;
        
    }
    
    public void setValor2(String valor2){
        
        this.valor2 = valor2;
        
    }
    
    
    public static void main(String[] args){
        
        Cliente c = new Cliente();
        
        try{
            
            Socket s = new Socket("localhost",2030);
            DataInputStream in = new DataInputStream(s.getInputStream());
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            
            JOptionPane.showMessageDialog(null,"Cliente");
            
            while(true){
                
              while(true){  
                
                valor1 = JOptionPane.showInputDialog("Digite o primeiro valor");
                out.writeUTF(valor1);
                
                String res = in.readUTF();
                
                if(res.equals("O que foi informado não é um número. Tente Novamente.\n"))
                    
                    continue;
                
                 break;
                        
              }
              
              while(true){  
                
                valor1 = JOptionPane.showInputDialog("Digite o segundo valor");
                out.writeUTF(valor1);
                
                String res = in.readUTF();
                
                if(res.equals("O que foi informado não é um número. Tente Novamente.\n"))
                    
                    continue;
                
                 break;
                        
              }
              
                String r = in.readUTF();
                
                JOptionPane.showMessageDialog(null,"Soma : " + c.getValor1() + " + " + c.getValor2() + " = " + r);
                
                while(true){
                    
                    String n = JOptionPane.showInputDialog("Deseja continuar ? sim ou não");
                    
                    if(n.equalsIgnoreCase("Sim") || n.equalsIgnoreCase("Não"))
                        
                            break;
                        
                     JOptionPane.showMessageDialog(null,"Informação Inválida. Tente Novamente.");
                     
                }
                
                out.writeUTF(r);
                
                if(r.equalsIgnoreCase("Não"))
                    
                    break;
                
                
            }
            
            JOptionPane.showMessageDialog(null,"Saindo do programa.");
            
            in.close();
            out.close();
            s.close();
            
        }catch(IOException e){
            
            JOptionPane.showMessageDialog(null,"Erro");
        }
        
    }
    
}


