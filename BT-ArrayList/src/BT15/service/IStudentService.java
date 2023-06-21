package BT15.service;

import BT15.modal.Student;

public interface IStudentService {
    void save(Student student);
    void delete(int id);
    Student findById(int id);
}
