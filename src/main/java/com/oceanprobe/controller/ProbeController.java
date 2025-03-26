package com.oceanprobe.controller;

import com.oceanprobe.dto.ProbeCommandRequest;
import com.oceanprobe.dto.ProbeResponse;
import com.oceanprobe.model.Direction;
import com.oceanprobe.model.Position;
import com.oceanprobe.service.ProbeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/probe")
public class ProbeController {

    private static final Logger logger = LoggerFactory.getLogger(ProbeController.class);
    private final ProbeService probeService;

    public ProbeController(ProbeService probeService) {
        this.probeService = probeService;
    }

    @PostMapping("/move")
    public ResponseEntity<ProbeResponse> moveProbe(@RequestBody ProbeCommandRequest request) {
        logger.info("Received move command: {}", request.getCommands());
        probeService.executeCommands(request.getCommands());
        return ResponseEntity.ok(new ProbeResponse(probeService.getPosition(), probeService.getDirection(), probeService.getVisitedPositions()));
    }

    @GetMapping("/position")
    public ResponseEntity<Position> getPosition() {
        return ResponseEntity.ok(probeService.getPosition());
    }

    @GetMapping("/direction")
    public ResponseEntity<Direction> getDirection() {
        return ResponseEntity.ok(probeService.getDirection());
    }

    @GetMapping("/visited")
    public ResponseEntity<List<Position>> getVisitedPositions() {
        return ResponseEntity.ok(probeService.getVisitedPositions());
    }

}

