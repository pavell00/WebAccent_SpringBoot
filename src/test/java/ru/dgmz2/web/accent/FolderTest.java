package ru.dgmz2.web.accent;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.dgmz2.web.accent.entities.Folder;
import ru.dgmz2.web.accent.repositories.FoldersDocRepository;

import java.util.List;

/**
 * Created by net_master on 16.06.2016.
 */
public class FolderTest extends WebAccentSpringBootApplicationTests {

    @Autowired
    private FoldersDocRepository foldersDocRepository;

    @Test
    public void findAll() {
        List<Folder> folders = foldersDocRepository.findAll();
        Assert.assertNotEquals(folders.size(), 0);

        for (Folder folder : folders) {
           System.out.println(folder.getId()+" "+folder.getFldName()+" "+folder.getRootId());
        }

    }

    @Test
    public void findFolderByRootId(){
        List<Folder> folders = foldersDocRepository.findByRootId(119l);
        Assert.assertNotEquals(folders.size(), 0);

        System.out.println();
        for (Folder folder : folders) {
            System.out.println(folder.getLabel()+" " +folder.getData()
                    +" "+folder.getExpandedIcon()+" "+folder.getCollapsedIcon()
                    +" "+folder.getLeaf());
        }
    }
}
