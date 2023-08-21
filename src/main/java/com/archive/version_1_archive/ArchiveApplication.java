package com.archive.version_1_archive;

import com.archive.version_1_archive.dto.Archive;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.archive.version_1_archive.service.ArchiveServiceImpl;

import java.sql.Date;

@SpringBootApplication
public class ArchiveApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArchiveApplication.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(ArchiveServiceImpl.class);
        ArchiveServiceImpl archiveServiceImpl = context.getBean("archiveService", ArchiveServiceImpl.class);
        Date whenDate = Date.valueOf("2023-08-21"); // Приклад дати
        String fond = "Sample Fond";
        String description = "Sample Description";
        String affairs = "Sample Affairs";
        String whomIssued = "Sample Issuer";
        Date returnDate = Date.valueOf("2023-08-28"); // Приклад дати повернення

        Archive archive = new Archive(whenDate, fond, description, affairs, whomIssued, returnDate);
        Archive archive1 = archiveServiceImpl.saveDepartment(archive);
        System.out.println("archive1 = " + archive1);
    }

}
