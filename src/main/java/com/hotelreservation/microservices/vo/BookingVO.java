package com.hotelreservation.microservices.vo;

import com.hotelreservation.microservices.common.BookingStatus;
import com.hotelreservation.microservices.entity.Guest;
import com.hotelreservation.microservices.entity.Room;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.Set;

/**
 * Created by e068635 on 6/17/2019.
 */
@Getter
@Setter
@EqualsAndHashCode
public class BookingVO {

    private Integer id;

    private Integer numberOfAdults;

    private Integer numberOfChildren;

    private Date arrivalDate;

    private Date departureDate;

    private Guest guest;

    private Set<Room> rooms;

    private BookingStatus bookingStatus;

}
