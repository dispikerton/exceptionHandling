package ru.ivanov.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class ExceptionService {

  public void methodThrowsException(){
    throw new PaymentRequiredException(HttpStatus.PAYMENT_REQUIRED, "Требуется оплата");
  }
}
