package com.oceanprobe.service;

import com.oceanprobe.exception.ProbeMovementException;
import com.oceanprobe.model.Command;
import com.oceanprobe.model.Direction;
import com.oceanprobe.model.Grid;
import com.oceanprobe.model.Position;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProbeService {
    private static final Logger logger = LoggerFactory.getLogger(ProbeService.class);
    private Position position;
    private Direction direction;
    private final Grid grid;
    private final List<Position> visitedPositions = new ArrayList<>();

    public void setInitialPosition(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }

    public ProbeService(Grid grid) {
        this.grid = grid;
        this.position = new Position(0, 0);
        this.direction = Direction.NORTH;
        visitedPositions.add(position);
    }

    public void executeCommands(List<Command> commands) {
        for (Command command : commands) {
            switch (command) {
                case MOVE_FORWARD:
                    move(direction.moveForward(position));
                    break;
                case MOVE_BACKWARD:
                    move(direction.moveBackward(position));
                    break;
                case TURN_LEFT:
                    direction = direction.rotateLeft();
                    break;
                case TURN_RIGHT:
                    direction = direction.rotateRight();
                    break;
            }
        }
    }

    private void move(Position newPosition) {
        if (grid.isWithinBounds(newPosition) && !grid.hasObstacle(newPosition)) {
            position = newPosition;
            visitedPositions.add(newPosition);
        } else {
            logger.warn("Move blocked: Out of bounds or obstacle present at {}", newPosition);
            throw new ProbeMovementException("Move blocked: Out of bounds or obstacle present at " + newPosition);
        }
    }

    public Position getPosition() { return position; }
    public Direction getDirection() { return direction; }
    public List<Position> getVisitedPositions() { return visitedPositions; }
}
