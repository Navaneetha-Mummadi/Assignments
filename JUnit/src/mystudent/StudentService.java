package mystudent;

public class StudentService {
    private StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public String getStudentById(int id) {
        return repository.findById(id)
                         .map(Student::getName)
                         .orElse("Not Found");
    }
}

