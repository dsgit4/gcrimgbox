package com.ebremer.imagebox;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**Class with utility methods*/
public class Utils {

    public static String isWhiteListed(String iiif){
        String msg="";
        Logger.getLogger(Utils.class.getName()).log(Level.INFO,"Verify if domain in the parameter is " +
                "one of the whiteListed Ones...");
        String whiteListedUrls = System.getenv("whiteListedUrls");
        List<String> whiteListedDomainsList = Arrays.asList(whiteListedUrls.split(","));

        for (String whiteURL :whiteListedDomainsList ){
         //   System.out.println("whiteURL- " + whiteURL);
            if (iiif.trim().startsWith(whiteURL.trim())){
                msg = whiteURL;
                Logger.getLogger(Utils.class.getName()).log(Level.INFO,
                        whiteURL+ "  [param starts with whitelisted one.]) ");
            }
        }
//        if(msg.isEmpty()){
//        System.out.println("msg- " + msg+" empty check: "+msg.isEmpty());
//        }
        return msg;
      }

}
