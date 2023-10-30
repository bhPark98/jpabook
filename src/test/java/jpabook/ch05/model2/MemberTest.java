package jpabook.ch05.model2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberTest {

    @Test
    public void test(){
        Member member = new Member();
        member.setId(1L);


    }
}