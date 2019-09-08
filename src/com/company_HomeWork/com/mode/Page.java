package com.company_HomeWork.com.mode;

import java.util.List;

import static java.util.Arrays.asList;

public class Page {


    private String title;
    private String url;
    private String htmlContent;

    private List<String> browsers;

    public Page(String title, String url, String htmlContent, String ... browsers) {
        this.title = title;
        this.url = url;
        this.htmlContent = htmlContent;
        this.browsers = asList(browsers);
    }

    public List<String> getBrowsers() {
        return browsers;
    }

    public void load() {
        System.out.println(htmlContent);
    }

    public void refresh() {
        System.out.println(htmlContent);
    }

    public String htmlBuilder() {
        return htmlContent;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public String getHtmlContent() {
        return htmlContent;
    }

    @Override
    public String toString() {
        return "Page{" +
                "title='" + title + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}

