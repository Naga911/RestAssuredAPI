package pojo.CreateOrUpdateAPI;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SerializeDeserialize {

    public static CreateApplication createApplication() throws IOException {
        String bodyString;
        //converting from json file to byte array and converting same to string
        byte[] bytesFromJson = Files.readAllBytes(Paths.get("C:\\Users\\Nagaraj\\IdeaProjects\\RestAssuredAPI\\src\\main\\java\\pojo\\CreateOrUpdateAPI\\createapi.json"));
        bodyString = new String(bytesFromJson);

        ObjectMapper objectMapper = new ObjectMapper();
      //  objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

        return objectMapper.readValue(bodyString, CreateApplication.class);



    }
}
