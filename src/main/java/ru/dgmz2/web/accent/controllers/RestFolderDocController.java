package ru.dgmz2.web.accent.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.dgmz2.web.accent.entities.Folder;
import ru.dgmz2.web.accent.repositories.FoldersDocRepository;

import java.util.List;

@RestController
@CrossOrigin
public class RestFolderDocController {

    @Autowired
    private FoldersDocRepository foldersDocRepository;

    @RequestMapping(value = "/treeDocFolders", method = RequestMethod.GET,
                    headers = "Accept=application/json")
    public List<Folder> getTreeFolders() {

        List<Folder> folders = foldersDocRepository.findAll();
        return folders;
    }

    @RequestMapping(value = "/treeDocFolders/{id}", method = RequestMethod.GET,
            headers = "Accept=application/json")
    public List<Folder> getFoldersByRootId(@PathVariable("id") Long id) {

        List<Folder> folders = foldersDocRepository.findByRootId(id);
        return folders;
    }
}
