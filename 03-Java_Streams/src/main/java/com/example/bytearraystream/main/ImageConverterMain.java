package com.example.bytearraystream.main;

import com.example.bytearraystream.utils.ImageConverter;

public class ImageConverterMain {
    public static void main(String[] args) {
        // Defining input and output image paths
        String inputImagePath = "src/main/resources/input_image.jpg";
        String outputImagePath = "src/main/resources/output_image.jpg";

        // Converting image to byte array
        byte[] imageData = ImageConverter.convertImageToByteArray(inputImagePath);
        if (imageData != null) {
            System.out.println("Converting image to byte array successfully! Size: " + imageData.length + " bytes");

            // Converting byte array back to image
            ImageConverter.convertByteArrayToImage(imageData, outputImagePath);
        }
    }
}

