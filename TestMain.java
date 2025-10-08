class Student {
    private int studentId;
    private String studentName;
    private String city;
    private int marks1, marks2, marks3;
    private float feePerMonth;
    private boolean isEligibleForScholarship;

    // Setters and Getters
    public void setStudentId(int id) { this.studentId = id; }
    public void setStudentName(String name) { this.studentName = name; }
    public void setCity(String city) { this.city = city; }
    public void setMarks1(int m) { this.marks1 = m; }
    public void setMarks2(int m) { this.marks2 = m; }
    public void setMarks3(int m) { this.marks3 = m; }
    public void setFeePerMonth(float fee) { this.feePerMonth = fee; }
    public void setIsEligibleForScholarship(boolean eligible) { this.isEligibleForScholarship = eligible; }

    public String getStudentName() { return studentName; }
    public float getFeePerMonth() { return feePerMonth; }
    public boolean getIsEligibleForScholarship() { return isEligibleForScholarship; }

    public float getAnnualFee() {
        return feePerMonth * 12;
    }

    public int getTotalMarks() {
        return marks1 + marks2 + marks3;
    }

    public float getAverage() {
        return getTotalMarks() / 3f;
    }

    public String getResult() {
        return (marks1 > 60 && marks2 > 60 && marks3 > 60) ? "pass" : "fail";
    }
}

public class TestMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setStudentName("Alice");
        s1.setMarks1(70);
        s1.setMarks2(80);
        s1.setMarks3(90);
        s1.setFeePerMonth(1000);
        s1.setIsEligibleForScholarship(true);

        s2.setStudentName("Bob");
        s2.setMarks1(60);
        s2.setMarks2(70);
        s2.setMarks3(75);
        s2.setFeePerMonth(800);
        s2.setIsEligibleForScholarship(false);

        s3.setStudentName("Charlie");
        s3.setMarks1(90);
        s3.setMarks2(95);
        s3.setMarks3(85);
        s3.setFeePerMonth(950);
        s3.setIsEligibleForScholarship(true);

        Student[] students = {s1, s2, s3};

        // Highest marks
        Student topStudent = students[0];
        for (Student s : students) {
            if (s.getTotalMarks() > topStudent.getTotalMarks()) {
                topStudent = s;
            }
        }
        System.out.println("Top Scorer: " + topStudent.getStudentName());

        // Least fee
        Student minFeeStudent = students[0];
        for (Student s : students) {
            if (s.getFeePerMonth() < minFeeStudent.getFeePerMonth()) {
                minFeeStudent = s;
            }
        }
        System.out.println("Least Fee: " + minFeeStudent.getStudentName() + ", Fee: " + minFeeStudent.getFeePerMonth());

        // All student info
        for (Student s : students) {
            System.out.println("Name: " + s.getStudentName());
            System.out.println("Total Marks: " + s.getTotalMarks());
            System.out.println("Average: " + s.getAverage());
            System.out.println("Result: " + s.getResult());
            System.out.println("Scholarship: " + s.getIsEligibleForScholarship());
            System.out.println("---------------------------");
        }
    }
}
