package com.example.regexproblems.basic.linkextaction;

import com.example.regexproblems.basic.linkextraction.LinkExtractor;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

// Creating JUnit test class for LinkExtractor
public class LinkExtractorTest {

    @Test
    void testExtractValidLinks() {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        List<String> links = LinkExtractor.extractLinks(text);

        assertNotNull(links, "The list should not be null");
        assertEquals(2, links.size(), "There should be exactly 2 links");
        assertTrue(links.contains("https://www.google.com"), "List should contain 'https://www.google.com'");
        assertTrue(links.contains("http://example.org"), "List should contain 'http://example.org'");
    }

    @Test
    void testNoValidLinks() {
        String text = "No links in this text.";
        List<String> links = LinkExtractor.extractLinks(text);

        assertNotNull(links, "The list should not be null");
        assertTrue(links.isEmpty(), "List should be empty as there are no links");
    }

    @Test
    void testExtractLinksWithQueryParams() {
        String text = "Check https://www.example.com/search?q=test and https://sub.domain.org/page?ref=abc.";
        List<String> links = LinkExtractor.extractLinks(text);

        assertNotNull(links, "The list should not be null");
        assertEquals(2, links.size(), "There should be exactly 2 links");
        assertTrue(links.contains("https://www.example.com/search?q=test"),
                "List should contain 'https://www.example.com/search?q=test'");
        assertTrue(links.contains("https://sub.domain.org/page?ref=abc"),
                "List should contain 'https://sub.domain.org/page?ref=abc'");
    }

    @Test
    void testExtractLinksWithDifferentProtocols() {
        String text = "Visit https://secure-site.net and ftp://files.com for downloads.";
        List<String> links = LinkExtractor.extractLinks(text);

        assertNotNull(links, "The list should not be null");
        assertEquals(1, links.size(), "Only 1 valid HTTP/HTTPS link should be extracted");
        assertTrue(links.contains("https://secure-site.net"), "List should contain 'https://secure-site.net'");
        assertFalse(links.contains("ftp://files.com"), "List should NOT contain 'ftp://files.com' as it's not HTTP/HTTPS");
    }
}


