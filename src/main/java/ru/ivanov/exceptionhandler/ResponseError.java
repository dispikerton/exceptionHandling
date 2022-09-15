package ru.ivanov.exceptionhandler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;

@Getter
public class ResponseError {
  private final HttpStatus status;
  private final String message;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
  private final LocalDateTime time = LocalDateTime.now();

  public ResponseError(String message, HttpStatus status) {
    this.message = message;
    this.status = status;
  }
}
