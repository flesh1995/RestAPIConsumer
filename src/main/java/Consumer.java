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

        дополнительно создал класс User со всеми полями,он нужен для методов. Написал четыре метода  как в видео . Из Get запроса вытащил cookie в виде строки : cookie = responseHeaders.getFirst("Set-Cookie");  Сама строка c cookie выглядит так - JSESSIONID=0D59FE4E09E53630D66D7B4945115DF9; Path=/; HttpOnly . Добавил ее в следующи три запроса (в header) headers.add("Cookie", cookie);  Когда вызываешь методы по отдельности, не передав заголовок, то последние два выдают ошибку :" 400 : Пользователя с таким id не существует....",  дальше вызвал все четыре метода по порядку.
        String body = result.getBody(); - это и будет 6-ти значный код в каждом из трех методов полсе Get.
    }
}
