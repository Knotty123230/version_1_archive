package service;

import com.archive.version_1_archive.dto.Archive;
import com.archive.version_1_archive.repo.ArchiveRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("archive")
public class ArchiveServiceImpl implements ArchiveService {

    private final ArchiveRepo archiveRepo;
    @Autowired
    public ArchiveServiceImpl(@Qualifier("archiveRepo") ArchiveRepo archiveRepo) {
        this.archiveRepo = archiveRepo;
    }

    @Override
    public Archive saveDepartment(Archive department) {
        return archiveRepo.save(department);
    }

    @Override
    public List<Archive> fetchDepartmentList() {
        return null;
    }

    @Override
    public Archive updateDepartment(Archive department) {
        return null;
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {

    }
}

