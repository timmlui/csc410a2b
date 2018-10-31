package nl.tudelft.jpacman;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Test the functionality of SquareFree 
 *
 * @author Ivan Shen and Timothy Lui
 */
class JPFSquareFreeTest{

        private SquareFree squareFree;

        @BeforeEach
        void setUp() throws Exception {
            this.squareFree = new SquareFree();
        }

        @Test
        void test0() {
            assertThat(squareFree.isSquareFree(-100)).isFalse();
        }

        @Test
        void test1() {
            assertThat(squareFree.isSquareFree(1)).isTrue();
        }

        @Test
        void test2() {
            assertThat(squareFree.isSquareFree(100)).isFalse();
        }

        @Test
        void test3() {
            assertThat(squareFree.isSquareFree(98)).isFalse();
        }

        @Test
        void test4() {
                assertThat(squareFree.isSquareFree(99)).isFalse();
        }

        @Test
        void test5() {
                assertThat(squareFree.isSquareFree(96)).isFalse();
        }

        @Test
        void test6() {
                assertThat(squareFree.isSquareFree(97)).isTrue();
        }

        @Test
        void test7() {
                assertThat(squareFree.isSquareFree(94)).isTrue();
        }

        @Test
        void test8() {
                assertThat(squareFree.isSquareFree(95)).isTrue();
        }

        @Test
        void test9() {
                assertThat(squareFree.isSquareFree(92)).isFalse();
        }

        @Test
        void test10() {
                assertThat(squareFree.isSquareFree(93)).isTrue();
        }

        @Test
        void test11() {
                assertThat(squareFree.isSquareFree(90)).isFalse();
        }

        @Test
        void test12() {
                assertThat(squareFree.isSquareFree(91)).isTrue();
        }

        @Test
        void test13() {
                assertThat(squareFree.isSquareFree(88)).isFalse();
        }

        @Test
        void test14() {
                assertThat(squareFree.isSquareFree(89)).isTrue();
        }

        @Test
        void test15() {
                assertThat(squareFree.isSquareFree(86)).isTrue();
        }

        @Test
        void test16() {
                assertThat(squareFree.isSquareFree(87)).isTrue();
        }

        @Test
        void test17() {
                assertThat(squareFree.isSquareFree(84)).isFalse();
        }

        @Test
        void test18() {
                assertThat(squareFree.isSquareFree(85)).isTrue();
        }

        @Test
        void test19() {
                assertThat(squareFree.isSquareFree(82)).isTrue();
        }

        @Test
        void test20() {
                assertThat(squareFree.isSquareFree(83)).isTrue();
        }

        @Test
        void test21() {
                assertThat(squareFree.isSquareFree(80)).isFalse();
        }

        @Test
        void test22() {
                assertThat(squareFree.isSquareFree(81)).isFalse();
        }

        @Test
        void test23() {
                assertThat(squareFree.isSquareFree(78)).isTrue();
        }

        @Test
        void test24() {
                assertThat(squareFree.isSquareFree(79)).isTrue();
        }

        @Test
        void test25() {
                assertThat(squareFree.isSquareFree(76)).isFalse();
        }

        @Test
        void test26() {
                assertThat(squareFree.isSquareFree(77)).isTrue();
        }

        @Test
        void test27() {
                assertThat(squareFree.isSquareFree(74)).isTrue();
        }

        @Test
        void test28() {
                assertThat(squareFree.isSquareFree(75)).isFalse();
        }

        @Test
        void test29() {
                assertThat(squareFree.isSquareFree(72)).isFalse();
        }

        @Test
        void test30() {
                assertThat(squareFree.isSquareFree(73)).isTrue();
        }

        @Test
        void test31() {
                assertThat(squareFree.isSquareFree(70)).isTrue();
        }

        @Test
        void test32() {
                assertThat(squareFree.isSquareFree(71)).isTrue();
        }

        @Test
        void test33() {
                assertThat(squareFree.isSquareFree(68)).isFalse();
        }

        @Test
        void test34() {
                assertThat(squareFree.isSquareFree(69)).isTrue();
        }

        @Test
        void test35() {
                assertThat(squareFree.isSquareFree(66)).isTrue();
        }

        @Test
        void test36() {
                assertThat(squareFree.isSquareFree(67)).isTrue();
        }

        @Test
        void test37() {
                assertThat(squareFree.isSquareFree(64)).isFalse();
        }

        @Test
        void test38() {
                assertThat(squareFree.isSquareFree(65)).isTrue();
        }

        @Test
        void test39() {
                assertThat(squareFree.isSquareFree(62)).isTrue();
        }

        @Test
        void test40() {
                assertThat(squareFree.isSquareFree(63)).isFalse();
        }

        @Test
        void test41() {
                assertThat(squareFree.isSquareFree(60)).isFalse();
        }

        @Test
        void test42() {
                assertThat(squareFree.isSquareFree(61)).isTrue();
        }

        @Test
        void test43() {
                assertThat(squareFree.isSquareFree(58)).isTrue();
        }

        @Test
        void test44() {
                assertThat(squareFree.isSquareFree(59)).isTrue();
        }

        @Test
        void test45() {
                assertThat(squareFree.isSquareFree(56)).isFalse();
        }

        @Test
        void test46() {
                assertThat(squareFree.isSquareFree(57)).isTrue();
        }

        @Test
        void test47() {
                assertThat(squareFree.isSquareFree(54)).isFalse();
        }

        @Test
        void test48() {
                assertThat(squareFree.isSquareFree(55)).isTrue();
        }

        @Test
        void test49() {
                assertThat(squareFree.isSquareFree(52)).isFalse();
        }

        @Test
        void test50() {
                assertThat(squareFree.isSquareFree(53)).isTrue();
        }

        @Test
        void test51() {
                assertThat(squareFree.isSquareFree(50)).isFalse();
        }

        @Test
        void test52() {
                assertThat(squareFree.isSquareFree(51)).isTrue();
        }

        @Test
        void test53() {
                assertThat(squareFree.isSquareFree(48)).isFalse();
        }

        @Test
        void test54() {
                assertThat(squareFree.isSquareFree(49)).isFalse();
        }

        @Test
        void test55() {
                assertThat(squareFree.isSquareFree(46)).isTrue();
        }

        @Test
        void test56() {
                assertThat(squareFree.isSquareFree(47)).isTrue();
        }

        @Test
        void test57() {
                assertThat(squareFree.isSquareFree(44)).isFalse();
        }

        @Test
        void test58() {
                assertThat(squareFree.isSquareFree(45)).isFalse();
        }

        @Test
        void test59() {
                assertThat(squareFree.isSquareFree(42)).isTrue();
        }

        @Test
        void test60() {
                assertThat(squareFree.isSquareFree(43)).isTrue();
        }

        @Test
        void test61() {
                assertThat(squareFree.isSquareFree(40)).isFalse();
        }

        @Test
        void test62() {
                assertThat(squareFree.isSquareFree(41)).isTrue();
        }

        @Test
        void test63() {
                assertThat(squareFree.isSquareFree(38)).isTrue();
        }

        @Test
        void test64() {
                assertThat(squareFree.isSquareFree(39)).isTrue();
        }

        @Test
        void test65() {
                assertThat(squareFree.isSquareFree(36)).isFalse();
        }

        @Test
        void test66() {
                assertThat(squareFree.isSquareFree(37)).isTrue();
        }

        @Test
        void test67() {
                assertThat(squareFree.isSquareFree(34)).isTrue();
        }

        @Test
        void test68() {
                assertThat(squareFree.isSquareFree(35)).isTrue();
        }

        @Test
        void test69() {
                assertThat(squareFree.isSquareFree(32)).isFalse();
        }

        @Test
        void test70() {
                assertThat(squareFree.isSquareFree(33)).isTrue();
        }

        @Test
        void test71() {
                assertThat(squareFree.isSquareFree(30)).isTrue();
        }

        @Test
        void test72() {
                assertThat(squareFree.isSquareFree(31)).isTrue();
        }

        @Test
        void test73() {
                assertThat(squareFree.isSquareFree(28)).isFalse();
        }

        @Test
        void test74() {
                assertThat(squareFree.isSquareFree(29)).isTrue();
        }

        @Test
        void test75() {
                assertThat(squareFree.isSquareFree(26)).isTrue();
        }

        @Test
        void test76() {
                assertThat(squareFree.isSquareFree(27)).isFalse();
        }

        @Test
        void test77() {
                assertThat(squareFree.isSquareFree(24)).isFalse();
        }

        @Test
        void test78() {
                assertThat(squareFree.isSquareFree(25)).isFalse();
        }

        @Test
        void test79() {
                assertThat(squareFree.isSquareFree(22)).isTrue();
        }

        @Test
        void test80() {
                assertThat(squareFree.isSquareFree(23)).isTrue();
        }

        @Test
        void test81() {
                assertThat(squareFree.isSquareFree(20)).isFalse();
        }

        @Test
        void test82() {
                assertThat(squareFree.isSquareFree(21)).isTrue();
        }

        @Test
        void test83() {
                assertThat(squareFree.isSquareFree(18)).isFalse();
        }

        @Test
        void test84() {
                assertThat(squareFree.isSquareFree(19)).isTrue();
        }

        @Test
        void test85() {
                assertThat(squareFree.isSquareFree(16)).isFalse();
        }

        @Test
        void test86() {
                assertThat(squareFree.isSquareFree(17)).isTrue();
        }

        @Test
        void test87() {
                assertThat(squareFree.isSquareFree(14)).isTrue();
        }

        @Test
        void test88() {
                assertThat(squareFree.isSquareFree(15)).isTrue();
        }

        @Test
        void test89() {
                assertThat(squareFree.isSquareFree(12)).isFalse();
        }

        @Test
        void test90() {
                assertThat(squareFree.isSquareFree(13)).isTrue();
        }

        @Test
        void test91() {
                assertThat(squareFree.isSquareFree(10)).isTrue();
        }

        @Test
        void test92() {
                assertThat(squareFree.isSquareFree(11)).isTrue();
        }

        @Test
        void test93() {
                assertThat(squareFree.isSquareFree(8)).isFalse();
        }

        @Test
        void test94() {
                assertThat(squareFree.isSquareFree(9)).isFalse();
        }

        @Test
        void test95() {
                assertThat(squareFree.isSquareFree(6)).isTrue();
        }

        @Test
        void test96() {
                assertThat(squareFree.isSquareFree(7)).isTrue();
        }

        @Test
        void test97() {
                assertThat(squareFree.isSquareFree(4)).isFalse();
        }

        @Test
        void test98() {
                assertThat(squareFree.isSquareFree(5)).isTrue();
        }

        @Test
        void test99() {
                assertThat(squareFree.isSquareFree(2)).isTrue();
        }

        @Test
        void test100() {
                assertThat(squareFree.isSquareFree(3)).isTrue();
        }
        
        /**
         * Additional tests to augment mutation score.
         */

        /**
         * Test for a square free integer that is negative
         */
        @Test
        void test101() {
                assertThat(squareFree.isSquareFree(0)).isFalse();
        }

        /**
         * Test the division method in SquareFree
         */
        @Test
        void test102() {
                assertThat(squareFree.myDivision(3, 4)).isEqualTo(0);
        }
}