package pojo.RegistrationAPI;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SerializeDeserialize {

    public static Register register() throws IOException {
        String path= System.getProperty("user.dir");
        String bodyString;

        byte[] bytesFromJson = Files.readAllBytes(Paths.get(path+"\\src\\main\\java\\pojo\\RegistrationAPI\\register.json"));
        bodyString = new String(bytesFromJson);
        ObjectMapper objectMapper = new ObjectMapper(); //object mapper provides functionality for reading and writing json
       // objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper.readValue(bodyString,Register.class); // mapping Registration register.json file & pojo class
    }
}
