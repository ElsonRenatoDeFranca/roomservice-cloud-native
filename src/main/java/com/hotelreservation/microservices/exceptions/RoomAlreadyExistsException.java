package com.hotelreservation.microservices.exceptions;

/**
 * Created by e068635 on 6/18/2019.
 */
public class RoomAlreadyExistsException extends Exception {

    private static final long serialVersionUID = 7899928512143785128L;

    public RoomAlreadyExistsException(String message) {
        super(message);
    }

}
