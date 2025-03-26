package com.oceanprobe.model;

public enum Direction {
    NORTH(0, 1), EAST(1, 0), SOUTH(0, -1), WEST(-1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction rotateLeft() {
        switch (this) {
            case NORTH: return WEST;
            case WEST: return SOUTH;
            case SOUTH: return EAST;
            case EAST: return NORTH;
            default: throw new IllegalStateException("Unexpected value: " + this);
        }
    }

    public Direction rotateRight() {
        switch (this) {
            case NORTH: return EAST;
            case EAST: return SOUTH;
            case SOUTH: return WEST;
            case WEST: return NORTH;
            default: throw new IllegalStateException("Unexpected value: " + this);
        }
    }

    public Position moveForward(Position position) {
        return position.move(dx, dy);
    }

    public Position moveBackward(Position position) {
        return position.move(-dx, -dy);
    }
}

