package javanetwork;

import java.io.*;
//author @Mochammad Alie Shodiq F
public class IpConfig {
    
    public IpConfig() throws IOException{
        try {
            String line; 
            String[] cmd = {"cmd.exe", "/c" ,"ipconfig /all"};
            Process p = Runtime.getRuntime().exec(cmd);
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
            
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public static void main(String[] args) throws IOException {
        IpConfig ipconfig = new IpConfig();
    }
}
