package ru.ivanov.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ExceptionService {

  public void methodThrowsException() {
    try {
      methodWherePaymentIsRequired();
    } catch (PaymentRequiredException e) {
      throw new ResponseStatusException(HttpStatus.PAYMENT_REQUIRED, e.getMessage());
    }
  }

  private void methodWherePaymentIsRequired() {
    throw new PaymentRequiredException("Требуется оплата");
  }
}
