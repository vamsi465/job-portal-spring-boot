package com.vamsi.springProject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class GlobalExceptionHandler {
 @ExceptionHandler(JobNotFoundById.class)
 public ResponseEntity<String> handlejobNotFound(JobNotFoundById ex){
   return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
 }
}
