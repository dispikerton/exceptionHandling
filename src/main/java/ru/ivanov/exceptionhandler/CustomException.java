package ru.ivanov.exceptionhandler;

public class CustomException extends RuntimeException {
  public CustomException(String message) {
    super(message);
  }
}
