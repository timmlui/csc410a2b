package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Test withinBorders of board via JPF.
 *
 * @author Timothy Lui and Ivan Shen
 */
class JPFBoardTest {

        private Board board;

        @BeforeEach
        void setUp() throws Exception {
            Square s1 = new BasicSquare();
            Square s2 = new BasicSquare();
            Square s3 = new BasicSquare();
            Square s4 = new BasicSquare();
            Square[][] grid = {{s1, s2}, {s3, s4}};
            this.board = new Board(grid);
        }

        @Test
        void test0() {
            assertThat(board.withinBorders(0,0)).isTrue();
        }

        @Test
        void test1() {
            assertThat(board.withinBorders(0,2)).isFalse();
        }

        @Test
        void test2() {
            assertThat(board.withinBorders(0,-10)).isFalse();
        }

        @Test
        void test3() {
            assertThat(board.withinBorders(2,-10)).isFalse();
        }

        @Test
        void test4() {
            assertThat(board.withinBorders(-10,-10)).isFalse();
        }
}