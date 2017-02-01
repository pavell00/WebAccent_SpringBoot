package ru.dgmz2.web.accent.repositories;

import org.hibernate.annotations.NamedNativeQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.dgmz2.web.accent.entities.Folder;

import java.util.List;

@Repository
public interface FoldersDocRepository extends JpaRepository<Folder, Long> {

    List<Folder> findByRootId(Long rootId);

//  @Query(value = "select id, fld_name from Folders", nativeQuery = true)
//  List<Folder> getAll();

    //Доделать !!!
    //@NamedNativeQuery(name="sql", query = "SELECT FLD_NAME FROM FOLDERS", resultSetMapping = "test");

}
