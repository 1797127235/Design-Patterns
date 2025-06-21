package 迭代器模式;

public interface StudentAggregate {
    void addStudent(Student student);
    void removeStudent(Student student);
    StudentIterator getStudentIterator();
}
