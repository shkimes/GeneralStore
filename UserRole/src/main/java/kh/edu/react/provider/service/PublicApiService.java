package kh.edu.react.provider.service;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;

@Service
public class PublicApiService {

    // final = 상수
    // static = 프로그램 실행 중 지속적으로 유지되며 모든 곳에서 데이터를
    // 확인하고 공유할 수 있도록 설정

    private final RestTemplate REST_TEMPLATE = new RestTemplate();
    private static final String BASE_URL = "http://apis.data.go.kr/B552645/katOrigin";
    private static final String API_KEY = "KP3OW%2FIgF46HjBjfKLfvalHbVNIFOxz9eg%2FxJBrJPrA6nB8UAOyoP9St0M%2B%2BG6YR6ILkRwHNvZ55AJWL1OMG5A%3D%3D";

    public String getTradeData(Map<String, String> params){
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(BASE_URL)
        .queryParam("api_key", API_KEY)
        .queryParam("dataType", "JSON");

        params.forEach(builder::queryParam);

        return REST_TEMPLATE.getForObject(builder.toUriString(), String.class);
    }
}
