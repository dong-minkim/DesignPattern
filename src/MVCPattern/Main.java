package MVCPattern;

/**
 * Model : 데이터를 운반하는 객체 or Java POJO
 * View : 데이터의 시각화
 * Controller : 데이터의 흐름 제어
 */
public class Main {
    public static void main(String[] args) {
        // fetch student record based on his roll no from the database
        Student model = retriveStudentFromDatabase();

        // Create a view : to write student details on console
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        // update data
        controller.setStudentName("John");

        controller.updateView();
    }

    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
