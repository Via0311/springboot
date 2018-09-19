package com.bw.dao;
import com.bw.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UsersMapper {

//    List<UsersExtends> selectObject(@Param("indexStart")Integer indexStart,@Param("rows")Integer rows,
//                                    @Param("vo")Vo vo);
    Integer selectCount(@Param("vo")Vo vo);

    List<Ticket_infoExtends> selectObjects(@Param("vo")Vo vo, @Param("indexStart")Integer indexStart,@Param("rows")Integer rows);

    Integer updateputaway(Integer tid);

    Integer updateSoldout(Integer tid);

    List<Venue> selectVenue();

    List<Pay_type> selectPayType();

    Integer insertObject(Ticket_infoExtends tk);

    void insertPaytype(Ticket_infoExtends tk);

    Ticket_infoExtends selectObjectById(Integer tid);

    Integer updateObject(Ticket_infoExtends tk);

    Integer delMiddles(Ticket_infoExtends tk);

    Integer insertMiddle(Ticket_infoExtends tk);
}
