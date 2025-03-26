/*
package com.oceanprobe.service;

import com.oceanprobe.model.Command;
import com.oceanprobe.model.Direction;
import com.oceanprobe.model.Grid;
import com.oceanprobe.model.Position;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class ProbeServiceTest {
    @Mock
    private Grid grid;

    @InjectMocks
    private ProbeService probeService;

    @BeforeEach
    void setUp() {
        Mockito.lenient().when(grid.isWithinBounds(Mockito.any())).thenReturn(true);
        Mockito.lenient().when(grid.hasObstacle(Mockito.any())).thenReturn(false);

        // Initialize the probe at (0,0) facing NORTH
        probeService = new ProbeService(grid);
        probeService.setInitialPosition(new Position(0, 0), Direction.NORTH);
    }


    @Test
    void testMoveForward() {
        probeService.executeCommands(Collections.singletonList(Command.MOVE_FORWARD));
        assert probeService.getPosition().equals(new Position(0, 1));
    }

    @Test
    void testTurnLeft() {
        probeService.executeCommands(Collections.singletonList(Command.TURN_LEFT));
        assert probeService.getDirection() == Direction.WEST;
    }
}
*/
