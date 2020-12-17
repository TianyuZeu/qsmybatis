package com.qianshan;

import com.qianshan.dao.AccountDao;
import com.qianshan.entity.Account;
import jdk.nashorn.internal.runtime.AccessorProperty;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class test {
    public static void main(String[] args) {
        //加载配置
        InputStream inputStream = test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory =  sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //获取实现接口的代理对象
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);

        //新增
        Account account = new Account(3L,"王五","333333",24);
        int result = accountDao.save(account);
        sqlSession.commit();
        //修改
//        Account account = new Account(3L,"赵六","6666666",88);
//        int result = accountDao.update(account);
//        sqlSession.commit();
        //查询
//        List<Account> list = accountDao.findAll();
//        for (Account l:list
//             ) {
//            System.out.println(l.toString());
//        }
//        System.out.println("==================");
//        Account account1 = accountDao.findById(3L);
//        System.out.println(account1.toString());
        //删除
//        accountDao.deleteById(3L);
//        sqlSession.commit();
    }
}

/*注意事项
* 1.写操作（save、delete、update）需要使用事物的commit操作；读操作（select）不需要
*
* */