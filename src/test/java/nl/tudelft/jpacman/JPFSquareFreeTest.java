package nl.tudelft.jpacman;

import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Test the functionality of SquareFree 
 *
 * @author Ivan Shen and Timothy Lui
 */
class SquareFreeTest{

        private SquareFree squareFree;

        @BeforeEach
        void setUp() throws Exception {
                squareFree = new SquareFree();
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
                assertThat(squareFree.isSquareFree(100)).is();
        }

        @Test
        void test3() {
                assertThat(squareFree.isSquareFree(98)).is();
        }

        @Test
        void test4() {
                assertThat(squareFree.isSquareFree(99)).is();
        }

        @Test
        void test5() {
                assertThat(squareFree.isSquareFree(96)).is();
        }

        @Test
        void test6() {
                assertThat(squareFree.isSquareFree(97)).is();
        }

        @Test
        void test7() {
                assertThat(squareFree.isSquareFree(94)).is();
        }

        @Test
        void test8() {
                assertThat(squareFree.isSquareFree(95)).is();
        }

        @Test
        void test9() {
                assertThat(squareFree.isSquareFree(92)).is();
        }

        @Test
        void test10() {
                assertThat(squareFree.isSquareFree(93)).is();
        }

        @Test
        void test11() {
                assertThat(squareFree.isSquareFree(90)).is();
        }

        @Test
        void test12() {
                assertThat(squareFree.isSquareFree(91)).is();
        }

        @Test
        void test13() {
                assertThat(squareFree.isSquareFree(88)).is();
        }

        @Test
        void test14() {
                assertThat(squareFree.isSquareFree(89)).is();
        }

        @Test
        void test15() {
                assertThat(squareFree.isSquareFree(86)).is();
        }

        @Test
        void test16() {
                assertThat(squareFree.isSquareFree(87)).is();
        }

        @Test
        void test17() {
                assertThat(squareFree.isSquareFree(84)).is();
        }

        @Test
        void test18() {
                assertThat(squareFree.isSquareFree(85)).is();
        }

        @Test
        void test19() {
                assertThat(squareFree.isSquareFree(82)).is();
        }

        @Test
        void test20() {
                assertThat(squareFree.isSquareFree(83)).is();
        }

        @Test
        void test21() {
                assertThat(squareFree.isSquareFree(80)).is();
        }

        @Test
        void test22() {
                assertThat(squareFree.isSquareFree(81)).is();
        }

        @Test
        void test23() {
                assertThat(squareFree.isSquareFree(78)).is();
        }

        @Test
        void test24() {
                assertThat(squareFree.isSquareFree(79)).is();
        }

        @Test
        void test25() {
                assertThat(squareFree.isSquareFree(76)).is();
        }

        @Test
        void test26() {
                assertThat(squareFree.isSquareFree(77)).is();
        }

        @Test
        void test27() {
                assertThat(squareFree.isSquareFree(74)).is();
        }

        @Test
        void test28() {
                assertThat(squareFree.isSquareFree(75)).is();
        }

        @Test
        void test29() {
                assertThat(squareFree.isSquareFree(72)).is();
        }

        @Test
        void test30() {
                assertThat(squareFree.isSquareFree(73)).is();
        }

        @Test
        void test31() {
                assertThat(squareFree.isSquareFree(70)).is();
        }

        @Test
        void test32() {
                assertThat(squareFree.isSquareFree(71)).is();
        }

        @Test
        void test33() {
                assertThat(squareFree.isSquareFree(68)).is();
        }

        @Test
        void test34() {
                assertThat(squareFree.isSquareFree(69)).is();
        }

        @Test
        void test35() {
                assertThat(squareFree.isSquareFree(66)).is();
        }

        @Test
        void test36() {
                assertThat(squareFree.isSquareFree(67)).is();
        }

        @Test
        void test37() {
                assertThat(squareFree.isSquareFree(64)).is();
        }

        @Test
        void test38() {
                assertThat(squareFree.isSquareFree(65)).is();
        }

        @Test
        void test39() {
                assertThat(squareFree.isSquareFree(62)).is();
        }

        @Test
        void test40() {
                assertThat(squareFree.isSquareFree(63)).is();
        }

        @Test
        void test41() {
                assertThat(squareFree.isSquareFree(60)).is();
        }

        @Test
        void test42() {
                assertThat(squareFree.isSquareFree(61)).is();
        }

        @Test
        void test43() {
                assertThat(squareFree.isSquareFree(58)).is();
        }

        @Test
        void test44() {
                assertThat(squareFree.isSquareFree(59)).is();
        }

        @Test
        void test45() {
                assertThat(squareFree.isSquareFree(56)).is();
        }

        @Test
        void test46() {
                assertThat(squareFree.isSquareFree(57)).is();
        }

        @Test
        void test47() {
                assertThat(squareFree.isSquareFree(54)).is();
        }

        @Test
        void test48() {
                assertThat(squareFree.isSquareFree(55)).is();
        }

        @Test
        void test49() {
                assertThat(squareFree.isSquareFree(52)).is();
        }

        @Test
        void test50() {
                assertThat(squareFree.isSquareFree(53)).is();
        }

        @Test
        void test51() {
                assertThat(squareFree.isSquareFree(50)).is();
        }

        @Test
        void test52() {
                assertThat(squareFree.isSquareFree(51)).is();
        }

        @Test
        void test53() {
                assertThat(squareFree.isSquareFree(48)).is();
        }

        @Test
        void test54() {
                assertThat(squareFree.isSquareFree(49)).is();
        }

        @Test
        void test55() {
                assertThat(squareFree.isSquareFree(46)).is();
        }

        @Test
        void test56() {
                assertThat(squareFree.isSquareFree(47)).is();
        }

        @Test
        void test57() {
                assertThat(squareFree.isSquareFree(44)).is();
        }

        @Test
        void test58() {
                assertThat(squareFree.isSquareFree(45)).is();
        }

        @Test
        void test59() {
                assertThat(squareFree.isSquareFree(42)).is();
        }

        @Test
        void test60() {
                assertThat(squareFree.isSquareFree(43)).is();
        }

        @Test
        void test61() {
                assertThat(squareFree.isSquareFree(40)).is();
        }

        @Test
        void test62() {
                assertThat(squareFree.isSquareFree(41)).is();
        }

        @Test
        void test63() {
                assertThat(squareFree.isSquareFree(38)).is();
        }

        @Test
        void test64() {
                assertThat(squareFree.isSquareFree(39)).is();
        }

        @Test
        void test65() {
                assertThat(squareFree.isSquareFree(36)).is();
        }

        @Test
        void test66() {
                assertThat(squareFree.isSquareFree(37)).is();
        }

        @Test
        void test67() {
                assertThat(squareFree.isSquareFree(34)).is();
        }

        @Test
        void test68() {
                assertThat(squareFree.isSquareFree(35)).is();
        }

        @Test
        void test69() {
                assertThat(squareFree.isSquareFree(32)).is();
        }

        @Test
        void test70() {
                assertThat(squareFree.isSquareFree(33)).is();
        }

        @Test
        void test71() {
                assertThat(squareFree.isSquareFree(30)).is();
        }

        @Test
        void test72() {
                assertThat(squareFree.isSquareFree(31)).is();
        }

        @Test
        void test73() {
                assertThat(squareFree.isSquareFree(28)).is();
        }

        @Test
        void test74() {
                assertThat(squareFree.isSquareFree(29)).is();
        }

        @Test
        void test75() {
                assertThat(squareFree.isSquareFree(26)).is();
        }

        @Test
        void test76() {
                assertThat(squareFree.isSquareFree(27)).is();
        }

        @Test
        void test77() {
                assertThat(squareFree.isSquareFree(24)).is();
        }

        @Test
        void test78() {
                assertThat(squareFree.isSquareFree(25)).is();
        }

        @Test
        void test79() {
                assertThat(squareFree.isSquareFree(22)).is();
        }

        @Test
        void test80() {
                assertThat(squareFree.isSquareFree(23)).is();
        }

        @Test
        void test81() {
                assertThat(squareFree.isSquareFree(20)).is();
        }

        @Test
        void test82() {
                assertThat(squareFree.isSquareFree(21)).is();
        }

        @Test
        void test83() {
                assertThat(squareFree.isSquareFree(18)).is();
        }

        @Test
        void test84() {
                assertThat(squareFree.isSquareFree(19)).is();
        }

        @Test
        void test85() {
                assertThat(squareFree.isSquareFree(16)).is();
        }

        @Test
        void test86() {
                assertThat(squareFree.isSquareFree(17)).is();
        }

        @Test
        void test87() {
                assertThat(squareFree.isSquareFree(14)).is();
        }

        @Test
        void test88() {
                assertThat(squareFree.isSquareFree(15)).is();
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
}