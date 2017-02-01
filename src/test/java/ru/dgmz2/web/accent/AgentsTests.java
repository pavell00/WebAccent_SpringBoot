package ru.dgmz2.web.accent;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.dgmz2.web.accent.entities.Agent;
import ru.dgmz2.web.accent.repositories.AgentRepository;

import java.util.List;

public class AgentsTests extends WebAccentSpringBootApplicationTests {

    @Autowired
    private AgentRepository agentRepository;

    @Test
    public void loadAll() {
        List<Agent> agents = agentRepository.findAll();
        Assert.assertNotEquals(agents.size(), 0);
    }

}
