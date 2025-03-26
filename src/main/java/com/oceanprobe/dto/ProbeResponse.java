package com.oceanprobe.dto;

import com.oceanprobe.model.*;

import java.util.List;

public class ProbeResponse {
    private Position position;
    private Direction direction;
    private List<Position> visitedPositions;

    public ProbeResponse(Position position, Direction direction, List<Position> visitedPositions) {
        this.position = position;
        this.direction = direction;
        this.visitedPositions = visitedPositions;
    }

    public Position getPosition() {
        return position;
    }

    public Direction getDirection() {
        return direction;
    }

    public List<Position> getVisitedPositions() {
        return visitedPositions;
    }
}

