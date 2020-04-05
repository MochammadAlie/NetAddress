/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanetwork;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * @author Mochammad Alie Shodiq F
*/
public class JavaNetwork {
    
    public JavaNetwork() throws UnknownHostException{
        InetAddress infoIp = InetAddress.getLocalHost();
        
        System.out.println("######################################");
        System.out.println("#          HOST INFORMATION          #");
        System.out.println("#          ----------------          #");
        System.out.println("");
        System.out.println("IP Address   :   " + infoIp.getHostAddress());
        System.out.println("Hostname     :   " + infoIp.getHostName());
        
    }
    
    public static void main(String[] args) throws Exception{
        JavaNetwork getIp = new JavaNetwork();
    }
    
}
