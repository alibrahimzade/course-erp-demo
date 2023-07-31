package az.atl.courseerpbackend.controller;

import az.atl.courseerpbackend.models.base.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public BaseResponse<String> test(){
        return BaseResponse.success("Course ERP");
    }
}
