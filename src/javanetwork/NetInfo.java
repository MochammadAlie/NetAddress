package javanetwork;

import java.net.*;
//author @Mochammad Alie Shodiq F
public class NetInfo {

    //Declaration Variable
    InetAddress ip, localhost;
    NetworkInterface net, netInt;
    byte[] mac;
    StringBuilder sb;
    
    public NetInfo() throws UnknownHostException, SocketException{
        //initialization variable
        ip = InetAddress.getLocalHost();                                        // Ip Address
        net = NetworkInterface.getByInetAddress(ip);                            
        localhost = Inet4Address.getLocalHost();                                
        netInt = NetworkInterface.getByInetAddress(localhost);                  // Subnet Mask 
        mac = net.getHardwareAddress();                                         // Mac Address
        sb = new StringBuilder();
        for (int i = 0; i < mac.length; i++) {
            sb.append(String.format("%02X%s", mac[i], (i < mac. length - 1) ? "-" : ""));
        }

        System.out.println("----------------------------------------------------");
        System.out.println("                   Network Information              ");
        System.out.println("");
        System.out.println("IP Address          :       " + ip.getHostAddress());
        System.out.println("Subnet Mask         :       " + netInt.getInterfaceAddresses().get(0).getNetworkPrefixLength());
        System.out.println("Mac Address         :       " + sb.toString());        
    }
    
    public static void main(String[] args) throws UnknownHostException, SocketException {
        NetInfo netInfo = new NetInfo();
    }  
}
