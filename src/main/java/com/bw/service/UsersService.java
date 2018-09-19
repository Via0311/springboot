package com.bw.service;

import com.bw.entity.*;

import java.util.List;

public interface UsersService {


    Integer selectCount(Vo vo);


    List<Ticket_infoExtends> selectObjects(Vo vo, Integer indexStart, Integer rows);

    Integer updateputaway(Integer tid);

    Integer updatesoldout(Integer tid);

    List<Venue> selectVenue();

    List<Pay_type> selectPayType();

    Integer insertObject(Ticket_infoExtends tk);

    Ticket_infoExtends selectObjectById(Integer tid);

    Integer updateObject(Ticket_infoExtends tk, Ticket_pay_type tt);
}
