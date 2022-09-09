package ru.ivanov.exceptionhandler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.RequiredArgsConstructor;

@RestController
@RestControllerAdvice
@RequiredArgsConstructor
public class Controller {
  private final ExceptionService service;

  @GetMapping
  public void method() {
    service.methodThrowsException();
  }
}
