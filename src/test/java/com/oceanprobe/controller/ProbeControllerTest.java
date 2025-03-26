/*
package com.oceanprobe.controller;

import com.oceanprobe.model.Direction;
import com.oceanprobe.model.Position;
import com.oceanprobe.service.ProbeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Arrays;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProbeController.class)
class ProbeControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProbeService probeService;

    @BeforeEach
    void setUp() {
        when(probeService.getPosition()).thenReturn(new Position(0, 0));
        when(probeService.getDirection()).thenReturn(Direction.NORTH);
        when(probeService.getVisitedPositions()).thenReturn(Arrays.asList(new Position(0, 0)));
    }

    @Test
    void testMoveProbe() throws Exception {
        doNothing().when(probeService).executeCommands(Mockito.anyList());

        when(probeService.getPosition()).thenReturn(new Position(0, 1));
        when(probeService.getDirection()).thenReturn(Direction.NORTH);
        when(probeService.getVisitedPositions()).thenReturn(Arrays.asList(new Position(0, 0), new Position(0, 1)));

        mockMvc.perform(MockMvcRequestBuilders.post("/probe/move")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"commands\":[\"MOVE_FORWARD\"]}"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.position.x").value(0))
                .andExpect(MockMvcResultMatchers.jsonPath("$.position.y").value(1));
    }

    @Test
    void testGetPosition() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/probe/position"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.x").value(0))
                .andExpect(MockMvcResultMatchers.jsonPath("$.y").value(0));
    }

    @Test
    void testGetDirection() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/probe/direction"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$").value("NORTH"));
    }

    @Test
    void testGetVisitedPositions() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/probe/visited"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].x").value(0))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].y").value(0));
    }
}

*/
