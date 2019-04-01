package cn.devit.demo


import javax.annotation.PostConstruct;

import static org.hamcrest.core.Is.is
import static org.hamcrest.core.IsEqual.equalTo

import org.junit.Test

import groovy.mock.interceptor.MockFor
import groovy.mock.interceptor.StubFor;;

class AccountTest {

    @Test
    @PostConstruct
    public void test() {
        Account a = new Account(password: "p", username: "junit" )
        List list = new ArrayList();
        
        list.add(a);
        assert list.size()==1;

    }

    @Test
    public void test1(){
        def mock = new MockFor(Account);
        mock.demand.reset{}
        mock.use{
            Account b = new Account();
            b.reset();
        }

    }
}
