package ru.dgmz2.web.accent.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.dgmz2.web.accent.entities.Agent;
import ru.dgmz2.web.accent.repositories.AgentRepository;

import java.util.List;

@Controller
public class AgentController {
//    @Value("${myconf}")
//    private String myconf;

    @Autowired
    private AgentRepository agentRepository;

    @RequestMapping("/agents")
    public String home(Model model) {
        List<Agent> agentList = agentRepository.findAll();
        model.addAttribute("agents", agentList);
//        model.addAttribute("conf", myconf);
        return "agents";
    }
}
