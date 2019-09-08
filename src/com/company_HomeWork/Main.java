package com.company_HomeWork;


import com.company_HomeWork.com.mode.Browser;
import com.company_HomeWork.com.mode.Page;
import com.company_HomeWork.com.mode.WebSite;

import java.util.HashSet;
import java.util.Set;

public class Main {


        public static void main(String[] args) {

            System.out.println ("Create Browser with all pages");

            WebSite webSite = new WebSite();

            System.out.println("Print all pages");
            System.out.println(webSite.getPages());

            System.out.println(" Chrome Pages");
            for (Page page: webSite.getPages()) {
                if (page.getBrowsers().contains(Browser.CHROME)){
                    System.out.println(page);
                }
            }

            System.out.println(" HTML Builder of the first page");
            System.out.println(webSite.getPages().get(0).htmlBuilder());

            System.out.println(" SET OF UNIQUE TITLES");
            Set<String> pageTitleSet  = new HashSet<>();
            for (Page page: webSite.getPages()) {
                pageTitleSet.add(page.getTitle());
            }
            System.out.println(pageTitleSet);


        }

    }






