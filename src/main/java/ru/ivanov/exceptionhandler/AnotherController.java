package ru.ivanov.exceptionhandler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/another")
@RequiredArgsConstructor
public class AnotherController {
  private final ExceptionService service;

  @GetMapping
  public void method() {
    service.methodThrowsException();
  }

}
