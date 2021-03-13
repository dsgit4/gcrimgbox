package com.ebremer.imagebox;

/**Class with utility methods*/
public class Utils {

    public static boolean isblackListed(String iiif){
        String blackListedUrls = System.getenv("blackListed");
          return  blackListedUrls.contains(iiif);

      }
}
