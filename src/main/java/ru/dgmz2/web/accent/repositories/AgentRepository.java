package ru.dgmz2.web.accent.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dgmz2.web.accent.entities.Agent;

@Repository
public interface AgentRepository extends JpaRepository<Agent, Long> {
}
