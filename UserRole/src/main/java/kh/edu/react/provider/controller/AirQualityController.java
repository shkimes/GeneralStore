package kh.edu.react.provider.controller;


import kh.edu.react.provider.service.AirQualityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/air-quality")
public class AirQualityController {


    private final AirQualityService airQualityService;

    public AirQualityController(AirQualityService airQualityService) {
        this.airQualityService = airQualityService;
    }

    // GetMapping으로 미세먼지 정보 가져오는 기능
    // -> Service 방식이 아닌 webConnfig 사용할때 사용방법
    // public Mono<String> getFrorCast (RequestParam String date){
    // setvice 에서 직접적으로 불러올 대는 mono와 같은 객체 사용 x

    @GetMapping("forecast")
    /*
    public String getFroeCast (@RequestParam(name="searchDate") String searDate){
    "status": 400,
    "error": "Bad Request",
    "trace": "org.springframework.web.bind.MissingServletRequestParameterException: Required request parameter 'searDate'
        "message": "Required parameter 'searDate' is not present.",


     */
    public String getFroeCast (@RequestParam(name="searchDate") String searDate){
        return airQualityService.getAirQuality(searDate);
    }

}
