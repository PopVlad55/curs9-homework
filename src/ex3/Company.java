package ex3;
import java.util.ArrayList;
import java.util.List;

class Company {
    private List<Person> persons;
    public Company(){
        persons = new ArrayList<>();
    }
    public Person getManager(){
        for (Person person : persons){
            if("manager".equalsIgnoreCase(person.getPosition())){
                return person;
            }
        }
        return null;
    }
    public List<Person> getPersons(String profession){
        List<Person> result = new ArrayList<>();
        for (Person person : persons){
            if(profession.equalsIgnoreCase(person.getPosition())){
                result.add(person);
            }
        }
        return result;
    }
    public List<Person> getPersonsOlder(int age) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons){
            if (person.getAge() > age){
                result.add(person);
            }
        }
        return result;
    }

     public List<Person> getPersonsbyName(String filterName){
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getName().toLowerCase().contains(filterName.toLowerCase())){
                result.add(person);
            }
        }
        return result;
     }

     public void employ(Person person){
        persons.add(person);
     }
}
