package com.oceanprobe.dto;

import com.oceanprobe.model.Command;
import java.util.List;

public class ProbeCommandRequest {
    private List<Command> commands;

    public List<Command> getCommands() {
        return commands;
    }

    public void setCommands(List<Command> commands) {
        this.commands = commands;
    }
}

