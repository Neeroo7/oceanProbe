package com.oceanprobe.model;
import org.springframework.stereotype.Component;
import java.util.HashSet;
import java.util.Set;

@Component
public class Grid {
    private int width;
    private int height;
    private Set<Position> obstacles;

    // No-argument constructor (required for Spring)
    public Grid() {
        this.width = 10; // Default values
        this.height = 10;
        this.obstacles = new HashSet<>();
    }

    // Parameterized constructor
    public Grid(int width, int height, Set<Position> obstacles) {
        this.width = width;
        this.height = height;
        this.obstacles = obstacles;
    }

    public boolean isWithinBounds(Position position) {
        return position.getX() >= 0 && position.getX() < width &&
                position.getY() >= 0 && position.getY() < height;
    }

    public boolean hasObstacle(Position position) {
        return obstacles.contains(position);
    }
}

