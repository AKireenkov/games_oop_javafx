package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.black.BishopBlack;

import static ru.job4j.chess.firuges.Cell.*;

public class LogicTest {

    @Test(expected = FigureNotFoundException.class)
    public void when00WayC3ThenError() throws OccupiedCellException, FigureNotFoundException {
        Logic logic = new Logic();
        logic.move(findBy(0, 0), C1);
    }

    @Test(expected = OccupiedCellException.class)
    public void whenA3WayB4ThenError() throws OccupiedCellException, FigureNotFoundException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(A3));
        logic.add(new BishopBlack(B4));
        logic.move(A3, B4);
    }
}