package stepDefs;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class pojoSerialize {

    public static void main(String[] args) throws JsonProcessingException {
        testPojo tp = new testPojo();
        tp.setAge(30);
        tp.setName("Amit");
        tp.setJob("QA");

        ObjectMapper obj = new ObjectMapper();
        String res = obj.writerWithDefaultPrettyPrinter().writeValueAsString(tp) ;
        System.out.println(res);
    }
}
