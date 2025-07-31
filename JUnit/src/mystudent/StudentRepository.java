package mystudent;

import java.util.Optional;

public interface StudentRepository {
    Optional<Student> findById(int id);
}
