package automationtest;
/*5.1 Create the class with the name "ArrayList_Q5"
   5.2	Create the main method
    5.3 Declare the string type ArrayList and add the values "Scrum", "Java", "Jira", "Selenium", "Cucumber", "Postman", “Rest Assured”
        5.4 Print the list using a forEach loop.*/

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Q5 {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Scrum");
        name.add("Java");
        name.add("Jira");
        name.add("Selenium");
        name.add("Cacumber");
        name.add("Postman");
        name.add("Rest Assured ");

        for (String n : name)
        {
            System.out.println(n);
        }
       // System.out.println(name);
    }
}
