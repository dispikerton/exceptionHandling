package ru.ivanov.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
public class CustomExceptionHandler {

  @ExceptionHandler
  @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
  public ResponseError handle(PaymentRequiredException exception) {
    log.error(exception.getMessage(), exception);
    return new ResponseError(exception.getMessage(), HttpStatus.PAYMENT_REQUIRED);
  }
}
