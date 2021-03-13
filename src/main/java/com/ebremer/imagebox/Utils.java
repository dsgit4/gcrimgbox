package com.ebremer.imagebox;

/**Class with utility methods*/
public class Utils {

    public static String isblackListed(String iiif){
        String msg="";
        System.out.println("isblackListed: ");
        String blackListedUrls = System.getenv("blackListed");

         if(blackListedUrls.contains(iiif))
         {msg = "Image url contains restricted domain name.";}
        System.out.println("isblackListed: "+msg);
        return msg;
      }

}
