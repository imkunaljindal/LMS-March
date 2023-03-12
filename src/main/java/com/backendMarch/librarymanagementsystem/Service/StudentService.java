package com.backendMarch.librarymanagementsystem.Service;

import com.backendMarch.librarymanagementsystem.Entity.LibraryCard;
import com.backendMarch.librarymanagementsystem.Entity.Student;
import com.backendMarch.librarymanagementsystem.Enum.CardStatus;
import com.backendMarch.librarymanagementsystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void addStudent(Student student){

        // set the value of card
        LibraryCard card = new LibraryCard();
        card.setStatus(CardStatus.ACTIVATED);
        card.setValidTill("03/2025");
        card.setStudent(student);

        // set the card attroubte in student
        student.setCard(card);

        studentRepository.save(student);
    }

}
