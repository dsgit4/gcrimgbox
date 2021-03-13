package com.ebremer.imagebox;

/**Class with utility methods*/
public class Utils {

    public static String isblackListed(String iiif){
        String msg="";
        String blackListedUrls = System.getenv("blackListed");

         if(blackListedUrls.contains(iiif))
         {msg = "Image url contains restricted domain name.";}

        return msg;
      }

}
