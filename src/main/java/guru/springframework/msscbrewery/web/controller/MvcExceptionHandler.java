package guru.springframework.msscbrewery.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jt on 2019-05-25.
 */
@ControllerAdvice
public class MvcExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List> validationErrorHandler(MethodArgumentNotValidException e){
        List<String> errors = new ArrayList<>(e.getFieldErrors().size());

        e.getFieldErrors().forEach(fieldError -> {
            errors.add(fieldError.getField() + " : " + fieldError.getDefaultMessage());
        });

        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(BindException.class)
    public ResponseEntity<List> handleBindException(BindException ex){
        return new ResponseEntity(ex.getAllErrors(), HttpStatus.BAD_REQUEST);
    }
}
