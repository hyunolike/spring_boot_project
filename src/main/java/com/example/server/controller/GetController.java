package com.example.server.controller;


import com.example.server.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") //Locallhost:8080/api
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path = "/getMethod")
    public String getRequest(){


        return "Hello dev hyunolike hihi";
    }

    @GetMapping("/getParameter") // localhost:8080/api/getParameter?id=1234&password=abcd
    public String getParameter(@RequestParam String id, @RequestParam(name = "password") String pwd){

        String password = "bbbb";

        System.out.println("id: " +id );
        System.out.println("password: " +pwd );

        return id + pwd;

    }


    //localhost:8080/api/multiParameter?account=abcd&email=study@naver.com&page=10...
    //객체를 통해서 고고 씽~~~~
    @GetMapping("/getMultiParameter")
    public SearchParam getMultiParameter(SearchParam searchParam){
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        //{"account":"", "email":"", "page": 0} json형식으로

        return searchParam;
    }
}
