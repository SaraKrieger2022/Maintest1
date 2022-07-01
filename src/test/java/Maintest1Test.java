import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Maintest1Test {

    @Test
            void addition1(){

        // given
        int bananas = 20;
        int apples = 30;


        // when
        int actual = Maintest1.add(bananas, apples);

        // then

        int expected = 50;
        Assertions.assertEquals(50, actual);
    }




}