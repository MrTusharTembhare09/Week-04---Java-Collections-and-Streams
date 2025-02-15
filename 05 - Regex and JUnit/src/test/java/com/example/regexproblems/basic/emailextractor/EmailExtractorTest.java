package com.example.regexproblems.basic.emailextractor;

import com.example.regexproblems.basic.emailextractor.EmailExtractor;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

// Creating JUnit test class for EmailExtractor
public class EmailExtractorTest {

    @Test
    void testExtractEmails() {
        String text = "Contact us at support@example.com and info@company.org";
        List<String> emails = EmailExtractor.extractEmails(text);

        assertEquals(2, emails.size());
        assertTrue(emails.contains("support@example.com"));
        assertTrue(emails.contains("info@company.org"));
    }

    @Test
    void testNoEmails() {
        String text = "This text contains no email addresses.";
        List<String> emails = EmailExtractor.extractEmails(text);
        assertTrue(emails.isEmpty());
    }

    @Test
    void testEmailsWithSpecialCharacters() {
        String text = "Emails: first.last@example.co.uk, user_123@domain.net, valid-email@sub.domain.com";
        List<String> emails = EmailExtractor.extractEmails(text);

        assertEquals(3, emails.size());
        assertTrue(emails.contains("first.last@example.co.uk"));
        assertTrue(emails.contains("user_123@domain.net"));
        assertTrue(emails.contains("valid-email@sub.domain.com"));
    }
}

