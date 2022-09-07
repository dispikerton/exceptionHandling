package ru.ivanov.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class Controller {
  private final ExceptionService service;

  @GetMapping
  public ResponseEntity<String> method() {
    try {
      service.methodThrowsException();
      return new ResponseEntity<>(HttpStatus.OK);
    } catch (CustomException e) {
      return new ResponseEntity<>("Требуется оплата", HttpStatus.PAYMENT_REQUIRED);
    }
  }
}
