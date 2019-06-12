package com.itheima.dao;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {

    @Select("select * from account")
    List<Account> findAll();

    @Update("update account set money = money + #{money} where name = #{name}")
    boolean addMoney(@Param("name") String name, @Param("money") double money);

    @Select("select money from account where name = #{name}")
    Double findRemainingByName(String name);

}
