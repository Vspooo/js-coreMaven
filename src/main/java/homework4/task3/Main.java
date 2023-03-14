package homework4.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Skills> skillsOne =new ArrayList<>();
        skillsOne.add(new Skills("java",1));
        skillsOne.add(new Skills("JS",1));

        ArrayList<Skills> skillsTwo = new ArrayList<>();
        skillsTwo.add(new Skills("C#",2));
        skillsTwo.add(new Skills("C++",4));

        ArrayList <Skills> skillsThree = new ArrayList<>();
        skillsThree.add(new Skills("Rubi",2));
        skillsOne.add(new Skills("Python",4));

        HashSet<User> users = new HashSet<>();
        users.add(new User(1,"Vasya","Pupkin","email1@gmail.com",21,Gender.MALE,skillsOne,"Bmw m5 f90",2014,330));
        users.add(new User(2,"Oleg","Kokos","email2@gmail.com",19,Gender.MALE,skillsTwo,"Audi a6 c6",2017,380));
        users.add(new User(3,"Vika","Ananas","fdgdfg@gmail.com",25,Gender.FEMALE,skillsThree,"Mercedes",2012,290));
        System.out.println(users);





    }
}
