package ru.dgmz2.web.accent.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dgmz2.web.accent.entities.Journal;

@Repository
public interface JournalRepository extends JpaRepository<Journal, Long> {
}
