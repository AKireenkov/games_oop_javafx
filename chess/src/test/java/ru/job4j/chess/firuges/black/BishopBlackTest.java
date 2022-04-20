package ru.job4j.chess.firuges.black;

import static org.hamcrest.Matchers.is;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.MatcherAssert.assertThat;
import static ru.job4j.chess.firuges.Cell.*;

public class BishopBlackTest {
    @Test
    public void whenPositionA5ThenA5() {
        Figure bishopBlack = new BishopBlack(C5);
        assertThat(bishopBlack.position(), is(C5));
    }

    @Test
    public void whenCopyD4ThenD4() {
        Figure bishopBlack = new BishopBlack(D4);
        assertThat(bishopBlack.copy(D4).position(), is(D4));
    }

    @Test
    public void whenC1WayG5ThenD2E2F4G5() {
        Figure bishopBlack = new BishopBlack(C1);
        assertThat(bishopBlack.way(G5), is(new Cell[]{D2, E3, F4, G5}));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenG3WayF3ThenError() {
        Figure bishopBlack = new BishopBlack(G3);
        bishopBlack.way(A2);
    }

}