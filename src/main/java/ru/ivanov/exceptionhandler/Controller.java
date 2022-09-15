package ru.ivanov.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
public class Controller {
  private final ExceptionService service;

  @GetMapping
  public void method() {
    service.methodThrowsException();
  }

  @ExceptionHandler
  public ResponseEntity<String> handle(PaymentRequiredException exception) {
    log.error(exception.getMessage(), exception);
    return new ResponseEntity<>(exception.getMessage(), HttpStatus.PAYMENT_REQUIRED);
  }
}