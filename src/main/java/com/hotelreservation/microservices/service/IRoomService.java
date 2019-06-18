package com.hotelreservation.microservices.service;


import com.hotelreservation.microservices.entity.Room;
import com.hotelreservation.microservices.exceptions.RoomAlreadyExistsException;
import com.hotelreservation.microservices.exceptions.RoomNotFoundException;
import com.hotelreservation.microservices.vo.RoomVO;

import java.util.List;

/**
 * Created by e068635 on 6/6/2019.
 */
public interface IRoomService {

    /**
     *
     * @param roomNumber
     * @return
     */
    RoomVO findByRoomNumber(String roomNumber) throws RoomNotFoundException;

    /**
     *
     * @return
     */
    List<RoomVO> findAll();


    /**
     *
     * @param newRoom
     * @return
     * @throws RoomAlreadyExistsException
     */
    RoomVO createNewRoom(Room newRoom) throws RoomAlreadyExistsException;



}
