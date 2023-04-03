import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class Consumer {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://94.198.50.185:7081/api/users";
        String response = restTemplate.getForObject(url, String.class);

        System.out.println(response);

//        Map<String, String> stringMap = new HashMap<>();
//        stringMap.put("id", "3");
//        stringMap.put("name", "James");
//        stringMap.put("lastName", "Brown");
//
//        HttpEntity<Map<String,String>> request = new HttpEntity<>(stringMap);
//        String url1 = "http://94.198.50.185:7081/api/users";
//        String response1 = restTemplate.postForObject(url1, request, String.class);
//
//
//
//        System.out.println(response1);
    }
}
