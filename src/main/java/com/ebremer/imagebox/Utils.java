package com.ebremer.imagebox;

import java.util.Arrays;
import java.util.List;

/**Class with utility methods*/
public class Utils {

    public static String isWhiteListed(String iiif){
        String msg="";
        System.out.println("Verify if domain in the parameter is one of the whiteListed Ones: ");
        String whiteListedUrls = System.getenv("whiteListedUrls");
        List<String> whiteListedDomainList = Arrays.asList(whiteListedUrls.split(","));

        for (String whiteURL :whiteListedDomainList ){
           // System.out.println("1. whiteURL- " + whiteURL);
            if (iiif.startsWith(whiteURL.trim())){
                msg = whiteURL;
          //  System.out.println(" match from param and whiteListed :) ");
            }
        }
        return msg;
      }

}
