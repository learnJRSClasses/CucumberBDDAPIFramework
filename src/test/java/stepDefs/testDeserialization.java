package stepDefs;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class testDeserialization {
    public static void main(String[] args) throws JsonProcessingException {

        String s = "{\n" +
                "  \"name\" : \"Adam\",\n" +
                "  \"job\" : \"Tester\",\n" +
                "  \"age\" : 50\n" +
                "}" ;

        ObjectMapper obj = new ObjectMapper();
        testPojo tp = obj.readValue(s, testPojo.class);
        Map<String , Object> maps = obj.readValue(s, Map.class);

        System.out.println(tp.getAge());
        System.out.println(tp.getJob());
        System.out.println(maps.get("name"));
    }
}
