package lambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by abhisheks on 16-05-2020.
 */
public class Driver {

    public static void main(String[] args) throws Exception {

        HashMap<String, String> hm = new HashMap<>();

        hm.put("appid","celcom");
        hm.put("password","abc123");
        hm.put("text","test message");
        hm.put("intflag","");

       Map<String, String> newMap= hm.entrySet().stream().filter(entry -> !entry.getValue().equals("")).map(entry ->{
            String key = entry.getKey();
            String value= entry.getValue();

            if (key.equals("password"))
                entry.setValue("xxxx");

            return entry;
        }).collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));

        System.out.println(newMap);

    }
}

