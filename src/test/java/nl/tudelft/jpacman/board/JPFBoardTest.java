package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Test withinBorders of board via JPF.
 *
 * @author Timothy Lui
 */
class JPFBoardTest {

        private Board board;

        @BeforeEach
        void setUp() throws Exception {
            Square s = new BasicSquare();
            Square[][] grid = {{s}};
            this.board = new Board(grid);
        }

        @Test
        void test0() {
            assertThat(board.withinBorders(0,0)).isTrue();
        }

        @Test
        void test1() {
            assertThat(board.withinBorders(0,1)).isFalse();
        }

        @Test
        void test2() {
            assertThat(board.withinBorders(0,-10)).isFalse();
        }

        @Test
        void test3() {
            assertThat(board.withinBorders(1,-10)).isFalse();
        }

        @Test
        void test4() {
            assertThat(board.withinBorders(-10,-10)).isFalse();
        }
}