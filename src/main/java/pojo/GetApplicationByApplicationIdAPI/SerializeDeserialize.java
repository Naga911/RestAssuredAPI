package pojo.GetApplicationByApplicationIdAPI;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SerializeDeserialize {

    public static GetApplicationId getApplicationId() throws IOException {
        String path= System.getProperty("user.dir");
        String bodyString;

        byte[] bytesFromJson = Files.readAllBytes(Paths.get(path+"\\src\\main\\java\\pojo\\GetApplicationByApplicationIdAPI\\getapplication.json"));
        bodyString = new String(bytesFromJson);
        ObjectMapper objectMapper = new ObjectMapper(); //object mapper provides functionality for reading and writing json
       // objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper.readValue(bodyString,GetApplicationId.class); // mapping Registration register.json file & pojo class
    }
}
