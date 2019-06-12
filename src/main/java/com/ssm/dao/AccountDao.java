package com.ssm.dao;

import com.ssm.domain.Account;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {

    /**
     * 查询所有账户信息
     *
     * @return
     */
    @Select("select * from account")
    List<Account> findAll();

    /**
     * 根据名称给账户存钱
     *
     * @param name
     * @param money
     * @return
     */
    @Update("update account set money = money + #{money} where name = #{name}")
    boolean addMoney(@Param("name") String name, @Param("money") double money);

    /**
     * 根据名称查询余额
     *
     * @param name
     * @return
     */
    @Select("select money from account where name = #{name}")
    Double findRemainingByName(String name);

}
