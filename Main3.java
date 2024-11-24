public class Main3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Masina masinaOriginala = new Masina("Dacia", "Albastru");

        Student studentOriginal = new Student("Ion", "Popescu", masinaOriginala);

        Student student2 = (Student)studentOriginal.clone(); //deep copy,schimbarile in student2 nu influenteaza studentOriginal
        student2.getMasina().schimbaCuloare("Rosu");
        Student student3 = (Student)studentOriginal.shallowClone();
        student3.getMasina().schimbaCuloare("Negru"); //se va modifica si la studentOriginal

        System.out.println(studentOriginal);
        System.out.println(student2);
        System.out.println(student3);
    }
}
