package com.bw.service.impl;

import com.bw.dao.UsersMapper;
import com.bw.entity.*;
import com.bw.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Resource
    private UsersMapper usersMapper;


    @Override
    public Integer selectCount(Vo vo) {
        return usersMapper.selectCount(vo);
    }

    @Override
    public List<Ticket_infoExtends> selectObjects(Vo vo,Integer indexStart,Integer rows){

        return usersMapper.selectObjects(vo,indexStart,rows);
    }

    @Override
    public Integer updateputaway(Integer tid) {
        return usersMapper.updateputaway(tid);
    }

    @Override
    public Integer updatesoldout(Integer tid) {
        return usersMapper.updateSoldout(tid);
    }

    @Override
    public List<Venue> selectVenue() {
        return usersMapper.selectVenue();
    }

    @Override
    public List<Pay_type> selectPayType() {
        return usersMapper.selectPayType();
    }

    @Override
    public Integer insertObject(Ticket_infoExtends tk) {
        Integer i = usersMapper.insertObject(tk);
        usersMapper.insertPaytype(tk);
        return i;
    }

    @Override
    public Ticket_infoExtends selectObjectById(Integer tid) {
        return  usersMapper.selectObjectById(tid);
    }

    @Override
    public Integer updateObject(Ticket_infoExtends tk, Ticket_pay_type tt) {
        Integer i = usersMapper.updateObject(tk);
        Integer j = usersMapper.delMiddles(tk);
        Integer k = usersMapper.insertMiddle(tk);
        return i;
    }


}

