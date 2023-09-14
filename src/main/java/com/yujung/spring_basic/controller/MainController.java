package com.yujung.spring_basic.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// description: Controller - 레이어드 아키텍처 상의 프레젠테이션 영역 //
// description: 클라이언트로부터 요청(입력)을 받고 서비스 결과를 응답(출력)하는 영역 //

// description: @RestController - REST API 형식 Controller를 만들고자 할 때 사용하는 어노테이션 //
// description: Response Body의 타입이 JSON 형태의 데이터를 반환 //
@RestController
// description: @RequestMapping - Request의 URL 패턴에 따라 클래스 및 메소드를 결정하는 어노테이션 //
@RequestMapping("/") // http://localhost:4000/**
// @RequestMapping("/main") http://localhost:4000/main/**
public class MainController {

  // http://localhost:4000/hello GET
  @RequestMapping(value = "hello", method = {RequestMethod.POST})
  public String hello() {
    return "Hello Spring framework!!";
  }

  // description: @RequestMapping 중 GET Method에 한정하여 인식 //
  // description: 데이터를 얻기 위한 요청 //
  // description: 데이터 입력시 URL로 입력 //
  @GetMapping("")
  public String getMethod() {
    return "This method is Get Method";
  }

  // description: @RequestMapping 중 POST Method에 한정하여 인식 //
  // description: 데이터를 생성하기 위한 요청 //
  // description: 데이터 입력시 Body로 입력 //
  @PostMapping("")
  public String postMethod() {
    return "This method is Post Method";
  }

  // description: @RequestMapping 중 PUT Method에 한정하여 인식 //
  // description: 데이터를 수정하기 위한 요청 (전체를 수정) //
  // description: 데이터 입력시 Body로 입력 //
  @PutMapping("")
  public String putMethod() {
    return "This method is Put Method";
  }

  // description: @RequestMapping 중 PATCH Method에 한정하여 인식 //
  // description: 데이터를 수정하기 위한 요청 (일부를 수정) //
  // description: 데이터 입력시 Body로 입력 //
  @PatchMapping("")
  public String patchMethod() {
    return "This method is Patch Method";
  }

  // description: @RequestMapping 중 DELETE Method에 한정하여 인식 //
  // description: 데이터를 삭제하기 위한 요청 //
  // description: 데이터 입력시 URL로 입력 //
  @DeleteMapping("")
  public String deleteMethod() {
    return "This method is Delete Method";
  }

  @GetMapping("path-variable/{variable}")
  public String getPathVariable(
    @PathVariable("variable") String varialbe
  ) {
      return "Parameter value : " + varialbe;
  }


}
