package ru.ivanov.exceptionhandler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
@RestControllerAdvice
public class Controller {
  private final ExceptionService service;

  @GetMapping
  public void method() {
    service.methodThrowsException();
  }

}