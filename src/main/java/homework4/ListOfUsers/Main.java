package homework4.ListOfUsers;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Volodiaa", 15));
        users.add(new User("Katia", 23));
        users.add(new User("Ivan", 21));
        users.sort((a, b) -> a.getAge() - b.getAge()); // from smaller to larger age
        users.sort((a,b)-> b.getAge() - a.getAge()); // from larger to smaller age
        users.sort((a,b)-> a.getName().length() - b.getName().length()); //from shorter to longer name
        users.sort((a,b)-> b.getName().length() - a.getName().length()); // from longer to shorter name
        System.out.println(users);

    }
}