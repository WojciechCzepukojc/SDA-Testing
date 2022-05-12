package pl.sda.academy;

import java.util.Locale;

public class NameVeryfier {

    public boolean isnameValid(String name) {
        return name != null && name.length() >0
                && !name.toLowerCase().equals(name)
                && !name.toUpperCase().equals(name);
    }

}
