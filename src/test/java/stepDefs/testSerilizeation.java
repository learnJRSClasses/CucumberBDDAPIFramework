package stepDefs;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;

import java.util.Map;

public class testSerilizeation {
    public static void main(String[] args) throws JsonProcessingException {

        String s = "{\n" +
                "  \"name\" : \"Adam\",\n" +
                "  \"job\" : \"AdamAdmin\",\n" +
                "  \"age\" : 10\n" +
                "}" ;

        ObjectMapper obj = new ObjectMapper();
        testPojo tp = obj.readValue(s,testPojo.class);
        Map<Object, Object> maps = obj.readValue(s, Map.class);
        System.out.println(maps.get("age"));
        System.out.println(tp.getJob());


        s= JsonPath.parse(s).set("$.age", 40).jsonString();
        System.out.println(s);


    }
}
