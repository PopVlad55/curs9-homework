package ex3;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        company.employ(new Person("Ion Mihai", 34, "Manager"));
        company.employ(new Person("Alexandru Grigore", 21, "Electrician"));
        company.employ(new Person("Ion Popescu", 30, "Inginer"));
        company.employ(new Person("David Mihai", 34, "Inspector"));
        company.employ(new Person("Marcel Alex", 20, "Inginer"));

        System.out.println("Manager: "+ company.getManager());
        System.out.println("Ingineri: "+ company.getPersons("Inginer"));
        System.out.println("Over 25 years old"+ company.getPersonsOlder(25));
        System.out.println("People with 'Po' in their names: "+ company.getPersonsbyName("Po"));

    }
}
