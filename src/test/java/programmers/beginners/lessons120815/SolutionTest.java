package programmers.beginners.lessons120815;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void gcdTest() {
        //given
        int num1 = 10;
        int num2 = 6;

        //when
        int gcd = Solution.gcd(num1, num2);

        //then
        assertThat(gcd).isEqualTo(2);
    }

    @Test
    void lcmTest() {
        //given
        int num1 = 10;
        int num2 = 6;

        //when
        int lcm = Solution.lcm(num1, num2);

        //then
        assertThat(lcm).isEqualTo(30);
    }
}