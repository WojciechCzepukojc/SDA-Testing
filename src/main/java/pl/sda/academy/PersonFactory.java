package pl.sda.academy;

public class PersonFactory {

    public Person createPerson(String firstname, String lastname){
        String prefix = firstname.endsWith("a") ? "Ms" : "Mr";
        return new Person(prefix, firstname,lastname);
    }
}
