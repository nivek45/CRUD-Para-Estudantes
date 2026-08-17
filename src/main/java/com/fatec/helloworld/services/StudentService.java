package com.fatec.helloworld.services;

import com.fatec.helloworld.entities.Student;
import com.fatec.helloworld.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Optional<Student> updateStudent(Long id, Student studentData) {
        return studentRepository.findById(id).map(student -> {
            student.setName(studentData.getName());
            student.setEmail(studentData.getEmail());
            student.setCourse(studentData.getCourse());
            student.setSemester(studentData.getSemester());
            student.setGpa(studentData.getGpa());
            student.setPhone(studentData.getPhone());
            student.setCity(studentData.getCity());
            return studentRepository.save(student);
        });
    }

    public boolean deleteStudent(Long id) {
        return studentRepository.findById(id).map(student -> {
            studentRepository.delete(student);
            return true;
        }).orElse(false);
    }
}
