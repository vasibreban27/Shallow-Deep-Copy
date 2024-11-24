public class Student implements Cloneable {
    private String nume;
    private String prenume;
    private Masina masina;

    public Student(String nume, String prenume, Masina masina) {
        this.nume = nume;
        this.prenume = prenume;
        this.masina = masina;
    }

    public String getNume() {
        return this.nume;
    }
    public String getPrenume() {
        return this.prenume;
    }
    public Masina getMasina() {
        return this.masina;
    }
    public Student shallowClone() throws CloneNotSupportedException {
        return (Student) super.clone(); //pt shallow copy,clonam doar studentul,nu si masina
    }
    public Student clone() throws CloneNotSupportedException
    {
        Student studentClonat = (Student) super.clone();
        studentClonat.masina = (Masina) this.masina.clone(); // clonam mașina (deep copy)
        return studentClonat;
    }
    public String toString() {
        return "Student " + this.nume + " " + this.prenume + " cu " + this.masina ;
    }
}
