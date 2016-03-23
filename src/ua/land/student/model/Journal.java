package ua.land.student.model;

import java.util.ArrayList;

public class Journal {
    private ArrayList<Student> journal;

    public Student getStudent(int id) {
        if ((id < 0) | (id > journal.size())) {
            return null;
        }
        return journal.get(id);
    }

    public boolean addStudent(Student student) {
        if (student == null) {
            return false;
        } else {
            journal.add(student);
        }
        return true;
    }

    public boolean deleteStudent(int id) {
        if ((id < 0) | (id > journal.size())) {
            return false;
        } else {
            journal.remove(id);
        }
        return true;
    }

    public void deleteAllStudent() {
        journal.clear();
    }

    public int getCount() {
        return journal.size();
    }

}
