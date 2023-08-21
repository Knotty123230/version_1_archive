package com.archive.version_1_archive.service;

import com.archive.version_1_archive.dto.Archive;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ArchiveService {
    // save operation
    Archive saveDepartment(Archive department);

    // read operation
    List<Archive> fetchDepartmentList();

    // update operation
    Archive updateDepartment(Archive department);

    // delete operation
    void deleteDepartmentById(Long departmentId);
}
