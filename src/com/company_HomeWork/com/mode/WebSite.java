package com.company_HomeWork.com.mode;


import java.util.List;
import static java.util.Arrays.asList;

public class WebSite {
    private List<Page> pages = asList(
            new Page("login", "http://mywebsite.com/login", "<login>", Browser.CHROME, Browser.FIREFOX),
            new Page("home", "http://mywebsite.com/", "<home>", Browser.CHROME, Browser.FIREFOX),
            new Page("about", "http://mywebsite.com/about", "<about>", Browser.FIREFOX),
            new Page("about", "http://mywebsite.com/info/about", "<about-info>", Browser.FIREFOX),
            new Page("forum", "http://mywebsite.com/forum", "<forum>", Browser.CHROME),
            new Page("forum", "http://mywebsite.com/info/forum", "<forum-info>", Browser.CHROME)
    );

    public List<Page> getPages() {
        return pages;
    }

}
