package com.example.bytearraystream.utils;

import java.io.*;

public class ImageConverter {
    // Converting image file to byte array
    public static byte[] convertImageToByteArray(String imagePath) {
        try (FileInputStream fis = new FileInputStream(imagePath);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            // Reading image file into byte array
            byte[] buffer = new byte[4096]; // Reading in chunks of 4 KB
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray(); // Returning byte array
        } catch (IOException e) {
            System.out.println("Error occurred while converting image: " + e.getMessage());
            return null;
        }
    }

    // Converting byte array back to image file
    public static void convertByteArrayToImage(byte[] imageData, String outputImagePath) {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageData);
             FileOutputStream fos = new FileOutputStream(outputImagePath)) {

            // Writing byte array to image file
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("Creating new image successfully at: " + outputImagePath);
        } catch (IOException e) {
            System.out.println("Error occurred while writing image: " + e.getMessage());
        }
    }
}

