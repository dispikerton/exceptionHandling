package ru.ivanov.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
public class CustomExceptionHandler {

  @ExceptionHandler
  public ResponseEntity<String> handle(PaymentRequiredException exception) {
    log.error(exception.getMessage(), exception);
    return new ResponseEntity<>(exception.getMessage(), HttpStatus.PAYMENT_REQUIRED);
  }
}
