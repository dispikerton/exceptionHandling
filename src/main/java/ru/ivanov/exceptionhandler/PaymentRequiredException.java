package ru.ivanov.exceptionhandler;

public class PaymentRequiredException extends RuntimeException {

  public PaymentRequiredException( String reason) {
    super(reason);
  }
}
