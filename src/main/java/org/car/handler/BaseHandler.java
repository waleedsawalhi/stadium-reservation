package org.car.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

public class BaseHandler implements ApiHandler {
    @Override
    public ResponseEntity<?> responseHandler(final Object obj, final HttpStatus httpStatus) {
        return initResponse(httpStatus)
                .contentType(MediaType.APPLICATION_JSON)
                .body(obj);
    }
}
