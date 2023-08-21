package com.archive.version_1_archive.repo;

import com.archive.version_1_archive.dto.Archive;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface ArchiveRepo extends CrudRepository<Archive, Long> {
}
