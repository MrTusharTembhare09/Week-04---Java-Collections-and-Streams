package com.example.bytearraystream.test;

import com.example.bytearraystream.utils.ImageConverter;
import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.*;

class ImageConverterTest {
    private final String inputImagePath = "src/main/resources/input_image.jpg";
    private final String outputImagePath = "src/main/resources/output_image.jpg";

    @Test
    void testImageConversion() {
        // Converting image to byte array
        byte[] imageData = ImageConverter.convertImageToByteArray(inputImagePath);
        assertNotNull(imageData, "Byte array conversion failed!");
        assertTrue(imageData.length >= 0, "Byte array is empty!");

        // Converting byte array back to image
        ImageConverter.convertByteArrayToImage(imageData, outputImagePath);

        // Checking if output file exists
        File outputFile = new File(outputImagePath);
        assertTrue(outputFile.exists(), "Output image file was not created!");
    }
}

