package pl.sda.academy;

import lombok.*;


import java.util.Objects;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class Person {

    @Setter(AccessLevel.NONE)           //nie pozwala wygenerować settera prefix w lombok
    private String prefix;
    private String firstName;
    private String lastName;




}
