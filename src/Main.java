public class Main {
    public static void main(String[] args) {
       Person person1= new Person();

       person1.setName("Vladimir");
       person1.setLastName("Castañeda");

        System.out.println("El nombre de la persona es: " +person1.getName());
        System.out.println("Y su apellido es: " + person1.getLastName());

        Student student1=new Student();
        student1.setEnrollment(1);
        student1.setCareer("programador");

        System.out.println("el numero de inscripcion: "+student1.getEnrollment());
        System.out.println("la carrera es:"+ student1.getCareer());

        Teacher teacher1=new Teacher();
        teacher1.setArea("conocimiento de los codigos");
        teacher1.setMatter("programacion");

        System.out.println("el area se llama:" +teacher1.getArea());
        System.out.println("la materia es:" + teacher1.getMatter());
            }
}
