package homework4.task3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        HashSet <User> users = new HashSet<>();
//
//        ArrayList<Skills> skillsOne = new ArrayList<>();
//
//        skillsOne.add(new Skills("js",1));
//        skillsOne.add(new Skills("Java",1));
//       users.add(new User(1,"Vasia","Pupkin","email1",21,Gender.MALE,skillsOne,"BMW m5 f90",2021,450));
//
//       ArrayList<Skills> skillsTwo = new ArrayList<>();
//       skillsTwo.add(new Skills("Python",1));
//        users.add(new User(2,"Vika","Kokos","email2",19,Gender.FEMALE,skillsTwo,"Audi a6 c6",2017,430));
//
//        ArrayList<Skills> skillsThree = new ArrayList<>();
//       skillsThree.add(new Skills("C++",2));
//       skillsThree.add(new Skills("JS",4));
//       skillsThree.add(new Skills("React",2));
//        users.add(new User(3,"Vitya","Ananas","email3",27,Gender.MALE,skillsThree,"Tesla Model S",2020,350));
//
//        ArrayList<Skills> skillsFour = new ArrayList<>();
//        skillsFour.add(new Skills("HTML",1));
//        skillsFour.add(new Skills("JS",2));
//        skillsFour.add(new Skills("CSS",1));
//        skillsFour.add(new Skills("Java",3));
//        users.add(new User(4,"Yulia","Tarasivna","email4",26,Gender.FEMALE,skillsFour,"Mercedes",2017,270));
//
//        ArrayList<Skills> skillsFive = new ArrayList<>();
//        skillsFive.add(new Skills("Java",4));
//        skillsFive.add(new Skills("Python",2));
//        users.add(new User(5,"Volodia","Voloshyn","email5",19,Gender.MALE,skillsFive,"Tesla model S",2021,400));
//
//        users.removeIf(s -> s.getGender() == Gender.MALE);
//        users.forEach(s -> System.out.println(s));



        TreeSet <User> users = new TreeSet<>();

        ArrayList<Skills> skillsOne = new ArrayList<>();

        skillsOne.add(new Skills("js",1));
        skillsOne.add(new Skills("Java",1));
        users.add(new User(1,"Vasia","Pupkin","email1",21,Gender.MALE,skillsOne,"BMW m5 f90",2021,450));

        ArrayList<Skills> skillsTwo = new ArrayList<>();
        skillsTwo.add(new Skills("Python",1));
        users.add(new User(2,"Vika","Kokos","email2",19,Gender.FEMALE,skillsTwo,"Audi a6 c6",2017,430));

        ArrayList<Skills> skillsThree = new ArrayList<>();
        skillsThree.add(new Skills("C++",2));
        skillsThree.add(new Skills("JS",4));
        skillsThree.add(new Skills("React",2));
        users.add(new User(3,"Vitya","Ananas","email3",27,Gender.MALE,skillsThree,"Tesla Model S",2020,350));

        ArrayList<Skills> skillsFour = new ArrayList<>();
        skillsFour.add(new Skills("HTML",1));
        skillsFour.add(new Skills("JS",2));
        skillsFour.add(new Skills("CSS",1));
        skillsFour.add(new Skills("Java",3));
        users.add(new User(4,"Yulia","Tarasivna","email4",26,Gender.FEMALE,skillsFour,"Mercedes",2017,270));

        ArrayList<Skills> skillsFive = new ArrayList<>();
        skillsFive.add(new Skills("Java",4));
        skillsFive.add(new Skills("Python",2));
        users.add(new User(5,"Volodia","Voloshyn","email5",19,Gender.MALE,skillsFive,"Tesla model S",2021,400));

        System.out.println(users);





    }
}
