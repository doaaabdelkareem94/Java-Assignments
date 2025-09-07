/**
 * The Student class represents a student with a name, ID, and three subject grades.
 * It provides methods to calculate the average grade, determine pass/fail status,
 * and display a report of the student's information.
 */
public class Student {

    /** The student's name */
    private String name;
    /** The student's ID*/
    private int ID ;
    /** The student's grade in subject 1*/
    private float grade1 ;
    /** The student's grade in subject 2*/
    private float grade2;
    /** The student's grade in subject 3*/
    private float grade3;

    /**
     * Gets the student's name.
     * @return the student's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the student's name.
     * @param name the student's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the student's ID.
     * @return the student's ID
     */
    public int getID() {
        return ID;
    }

    /**
     * Sets the student's ID.
     * @param ID the student's ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * Gets the grade in subject 3.
     * @return the grade in subject 3
     */
    public float getGrade3() {
        return grade3;
    }

    /**
     * Sets the grade in subject 3.
     * @param grade3 the grade in subject 3
     */
    public void setGrade3(float grade3) {
        this.grade3 = grade3;
    }

    /**
     * Gets the grade in subject 1.
     * @return the grade in subject 1
     */
    public float  getGrade1() {
        return grade1;
    }

    /**
     * Gets the grade in subject 2.
     * @return the grade in subject 2
     */
    public float getGrade2() {
        return grade2;
    }

    /**
     * Sets the grade in subject 2.
     * @param grade2 the grade in subject 2
     */
    public void setGrade2(float  grade2) {
        this.grade2 = grade2;
    }

    /**
     * Sets the grade in subject 1.
     * @param grade1 the grade in subject 1
     */
    public void setGrade1(float  grade1) {
        this.grade1 = grade1;
    }

    /**
     * Calculates the average grade of the student across three subjects.
     * @return the average grade as a float
     */
    public float calculateAverage (){
        return (grade1+grade2+grade3)/3;

    }

    /**
     * Checks if the student has passed.
     * A student passes if the average grade is greater than or equal to 50.
     * @return true if the student has passed, false otherwise
     */
    public boolean isPassed () {
        if(calculateAverage() >= 50) {
          return true;
        }else {
            return false;
        }
    }

    /**
     * Displays a formatted report of the student's information,
     * including name, ID, grades, average, and pass/fail result.
     */
    public void displayInfo() {
        System.out.println("=================Student Report=====================");
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + ID);
        System.out.println("Grade of Subject 1: " + grade1);
        System.out.println("Grade of Subject 2: " + grade2);
        System.out.println("Grade of Subject 3: " + grade3);
        System.out.printf("Average: %.2f\n" , calculateAverage() );
        if(isPassed()){
            System.out.println("Result: Passed");
        }else{
            System.out.println("Result: Failed");
        }
        System.out.println("===================================================");
    }
}
