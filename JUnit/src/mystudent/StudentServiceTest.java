package mystudent;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Optional;

public class StudentServiceTest {

    @Test
    public void testGetStudentById_ReturnsExpectedName() {
        // Arrange: Create a mock repository
        StudentRepository mockRepo = mock(StudentRepository.class);
        Student dummyStudent = new Student(1, "John Doe");

        when(mockRepo.findById(1)).thenReturn(Optional.of(dummyStudent));

        StudentService service = new StudentService(mockRepo);

        // Act: Call the method under test
        String name = service.getStudentById(1);

        // Assert: Check the returned name
        assertEquals("John Doe", name);

        // Verify: Ensure repository method was called correctly
        verify(mockRepo, times(1)).findById(1);
    }
}
