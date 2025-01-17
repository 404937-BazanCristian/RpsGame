package ar.edu.utn.frc.tup.lc.iii.controllers;

import ar.edu.utn.frc.tup.lc.iii.models.Player;
import ar.edu.utn.frc.tup.lc.iii.services.PlayerService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.util.Assert;

@WebMvcTest(PlayerController.class)
public class PlayerControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PlayerService playerService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void getByIdTest() throws Exception{
        Player player = new Player();
        player.setId(1L);
        player.setEmail("email@email.com");
        player.setUserName("cristian");
        player.setPassword("Password03#");

        when(playerService.getPlayerById(1L)).thenReturn(player);
        this.mockMvc.perform(get("/players/1")).andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.userName").value("cristian"))
                .andExpect(jsonPath("$.email").value("email@email.com"))
                .andExpect(jsonPath("$.password").value("Password03#"));

        MvcResult mvcResult = this.mockMvc.perform(get("/players/1")).andDo(print()).andExpect(status().isOk()).andReturn();
        Player result = objectMapper.readValue(mvcResult.getResponse().getContentAsString(), Player.class);
        Assertions.assertEquals("cristian", result.getUserName());
    }

}