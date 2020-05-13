package edu.academy;

import java.util.Comparator;

public class UrlInfo  {
    private String protocol;
    private String url;
    private String domain;
    private String upperDomain;

    public UrlInfo (String protocol, String url, String domain, String upperDomain) {
        this.protocol = protocol;
        this.url = url;
        this.domain = domain;
        this.upperDomain = upperDomain;
    }
    public UrlInfo () {}

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getUpperDomain() {
        return upperDomain;
    }

    public void setUpperDomain(String upperDomain) {
        this.upperDomain = upperDomain;
    }

}
