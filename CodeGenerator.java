/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punchr;
import java.security.SecureRandom;
import java.util.HashSet;
import java.lang.StringBuilder;

/**
 *
 * @author marisa
 */
public class CodeGenerator {
    
    static HashSet<String> rewardCodes;
    static HashSet<String> punchCodes;
    static final String AB = "0123456789abcdefghijkmnopqrstuvwxyz";
    static SecureRandom rnd;
    
    public static String getCode(String typeOfCode)
    {
        rewardCodes = new HashSet<>();
        punchCodes = new HashSet<>();
        rnd = new SecureRandom();
        int currentSizeRC = rewardCodes.size();
        int currentSizePC = punchCodes.size();
        
                StringBuilder sb;
        switch (typeOfCode) {
            case "rewardCode":
                sb = new StringBuilder(8);
                while (rewardCodes.size() == currentSizeRC)
                {
                    for(int i = 0; i < 8; i++)
                        sb.append(AB.charAt(rnd.nextInt(AB.length())));
                    rewardCodes.add(sb.toString());}
                return sb.toString();
            case "punchCode":
                sb = new StringBuilder(6);
                while (punchCodes.size() == currentSizePC) {
                    for(int i = 0; i < 6; i++)
                        sb.append(AB.charAt(rnd.nextInt(AB.length())));
                    punchCodes.add(sb.toString());}
                return sb.toString();
            default:
                return "error";
        }
    }
    
    
    
    
    
    
}
