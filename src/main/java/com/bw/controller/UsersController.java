package com.bw.controller;

import com.bw.entity.*;
import com.bw.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UsersController {

    @Resource
    private UsersService usersService;

    @RequestMapping("list")
    public String list(HttpServletRequest request, Vo vo,@RequestParam(defaultValue = "1",value = "page")Integer
                       page,@RequestParam(defaultValue = "3",value = "rows")Integer rows){

       Integer total = usersService.selectCount(vo);

       Integer pages = total%rows==0?total/rows:total/rows+1;

        if(page>pages){
            page=pages;
        }
       if(page<0){
           page=1;
       }

       Integer indexStart  = (page-1)*3;

       List<Ticket_infoExtends> entities = usersService.selectObjects(vo,indexStart,rows);

       request.setAttribute("entities",entities);

       request.setAttribute("total",total);
       request.setAttribute("vo",vo);
       request.setAttribute("page",page);
       request.setAttribute("pages",pages);

       return  "list";
    }


    @RequestMapping("putaway")
    @ResponseBody
    public Integer putaway(Integer tid){

        Integer i  = usersService.updateputaway(tid);

        return i;
    }

    @RequestMapping("soldout")
    @ResponseBody
    public Integer soldout(Integer tid){

        Integer i  = usersService.updatesoldout(tid);

        return i;
    }

    @RequestMapping("preAdd")
    public String preAdd(){
        return "add";
    }

    @RequestMapping("venue")
    @ResponseBody
    public List<Venue> venue(){
        List<Venue> listVenue = usersService.selectVenue();
        return listVenue;
    }
    @RequestMapping("paytype")
    @ResponseBody
    public List<Pay_type> paytype(){
        List<Pay_type> listPayType = usersService.selectPayType();
        return listPayType;
    }
    @RequestMapping("edit")
    @ResponseBody
    public Integer add(Ticket_infoExtends tk, Ticket_pay_type tt){
        Integer i=0;
        if(tk.getTid()==null){
           i  = usersService.insertObject(tk);
        }else{
           i = usersService.updateObject(tk,tt);
        }

        return i;
    }
    @RequestMapping("preUpd")
    public String preUpd(Integer tid,HttpServletRequest request){
        Ticket_infoExtends  te = usersService.selectObjectById(tid);

      /*  Venue venue =  new Venue();
        venue.setVid(te.getVid());
        request.setAttribute("venue",venue);*/
        request.setAttribute("entities",te);
        return "update";
    }
}
