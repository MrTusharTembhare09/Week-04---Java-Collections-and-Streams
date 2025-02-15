package com.example.regexproblems.advanced.ipvalidator.utils;

import java.util.regex.Pattern;

public class IpValidator {
    // Defining regex pattern for validating IPv4 address
    private static final String IPV4_PATTERN =
            "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.){3}" +
                    "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$";

    private static final Pattern pattern = Pattern.compile(IPV4_PATTERN);

    // Validating the given IP address
    public static boolean isValidIp(String ip) {
        return ip != null && pattern.matcher(ip).matches();
    }
}

