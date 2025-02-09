package com.order.service.exception;

import com.ecommerce.app.config.EcomResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<EcomResponse<Object>> InvalidUser(RuntimeException cex, WebRequest wr) {
        EcomResponse<Object> response = new EcomResponse<>(cex.getMessage());
        response.setStatusCode(401);
        response.setStatus(HttpStatus.UNAUTHORIZED);
        return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<EcomResponse<Object>> handleAllException(RuntimeException cex, WebRequest wr) {
        EcomResponse<Object> response = new EcomResponse<>(cex.getMessage());
        response.setStatusCode(401);
        response.setStatus(HttpStatus.UNAUTHORIZED);
        return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
    }
}
