public class Main {

    public static void main(String[] args) {

        Student a = new Student("Garen", "V", "S6111111");
        Student b = new Student("Shaer", "Hasan", "S3111111");
        Student c = new Student("Aneeq", "Shah", "S5111111");
        Student d = new Student("Alvin", "Ahmed", "S1111111");
        Student e = new Student("Kyrie", "Irving", "S4111111");
        Student f = new Student("Kevin", "Durant", "S2111111");

        Faculty g = new Faculty("Smith", "Thompson", "F3111111");
        Faculty h = new Faculty("Jerry", "Waxman", "F4111111");
        Faculty i = new Faculty("Jackson", "Yeh", "F6111111");
        Faculty j = new Faculty("Karim", "Ganji", "F1111111");
        Faculty k = new Faculty("Kenneth", "Lord", "F2111111");
        Faculty l = new Faculty("Jennifer", "Whitehead", "F5111111");

        BinaryTree students = new BinaryTree();
        BinaryTree faculty = new BinaryTree();

        students.insertStudent(a);
        students.insertStudent(b);
        students.insertStudent(c);
        students.insertStudent(d);
        students.insertStudent(e);
        students.insertStudent(f);

        faculty.insertFaculty(g);
        faculty.insertFaculty(h);
        faculty.insertFaculty(i);
        faculty.insertFaculty(j);
        faculty.insertFaculty(k);
        faculty.insertFaculty(l);

        students.displayStudentTree(students);
        faculty.displayFacultyTree(faculty);

    }

}