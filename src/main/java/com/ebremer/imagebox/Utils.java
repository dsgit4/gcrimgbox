package com.ebremer.imagebox;

import java.util.Arrays;
import java.util.List;

/**Class with utility methods*/
public class Utils {

    public static String isblackListed(String iiif){
        String msg="";
        System.out.println("1. isblackListed: "+iiif);
        String blackListedUrls = System.getenv("blackListed");
        List<String> blackList = Arrays.asList("abc.com, badguys.com, corruptimages.com, aws.com, s3.amazonaws.com".split(","));

        for (String blackUrl :blackList ){
       //     System.out.println("2. ");
            if(iiif.contains(blackUrl.trim())) {
                msg = blackUrl;
                System.out.println("blackUrl- " + blackUrl);
            }
        }
        return msg;
      }

}
