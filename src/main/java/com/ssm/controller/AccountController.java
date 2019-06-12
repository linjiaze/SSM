package com.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.ssm.domain.Account;
import com.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView();
        List<Account> accountList = accountService.findAll();
        mv.addObject("accountList", accountList);
        mv.setViewName("list");
        return mv;
    }

    @RequestMapping("/findPages/{pageNum}/{pageSize}")
    public ModelAndView findPages(@PathVariable("pageNum") Integer pageNum, @PathVariable("pageSize") Integer pageSize){
        ModelAndView mv = new ModelAndView();
        PageHelper.startPage(pageNum, pageSize);
        List<Account> accountList = accountService.findAll();
        mv.addObject("accountList", accountList);
        mv.setViewName("list");
        return mv;
    }


    @RequestMapping("/transMoney")
    public ModelAndView transMoney(String from, String to, Double money){
        ModelAndView mv = new ModelAndView();
        boolean b = accountService.transMoney(from, to, money);
        if (b){
            mv.addObject("msg", "转账成功");
        } else {
            mv.addObject("msg", "转账失败");
        }
        mv.setViewName("transMoney");
        return mv;
    }

}
