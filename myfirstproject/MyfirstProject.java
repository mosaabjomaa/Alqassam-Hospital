package myfirstproject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class MyfirstProject {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<Doctor> doctors = new LinkedList();
        LinkedList<Spieciallty> specialties = new LinkedList();
       ArrayList<Room> rooms = new ArrayList();
        LinkedList<Sick> sickList = new LinkedList();

        while (true) {
            System.out.println("welcome in AlAqsa Hospital : ");
            System.out.println("******************************************************");
            System.out.println(" let a Main Menu :");
            System.out.println("1. Doctors");
            System.out.println("2. Sicklist");
            System.out.println("3. Speiciallties");
            System.out.println("4. rooms");
            System.out.println("5. Exit");
            int choise = in.nextInt();

            switch (choise) {
                case 1:
                    aboutdoctor(doctors);

                    break;
                case 2:
                    aboutsick(sickList);
                    break;
                case 3:
                    aboutSpeiciallty(specialties);
                    break;
                case 4:
                    aboutroom(rooms);
                    break;
                case 5:
                    in.close();
                    return;
            }
        }
    }

    private static void aboutdoctor(LinkedList<Doctor> doctors) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Operation about Doctors:");
            System.out.println("1. insert");
            System.out.println("2. delete");
            System.out.println("3. display");
            System.out.println("4. find");
            System.out.println("5. Exit");
            int choise = in.nextInt();

            switch (choise) {

                case 1:
                    mosab:
                    {
                        System.out.print("enter new name : ");
                        String name = in.next();
                        System.out.print("enter new Id : ");
                        String id = in.next();
                        for (Doctor doctor : doctors) {
                            if (doctor.getID().equals(id)) {
                                System.out.println("error! this id is founded");
                                break mosab;
                            }
                        }
                        System.out.print("enter new Office number : ");
                        String officenum = in.next();
                        System.out.print("enter new Spieciallty : ");
                        String name1 = in.next();
                        System.out.println("enter workinghours of this doctor ");
                        int workhours = in.nextInt();
                        Spieciallty spiec = new Spieciallty(name1);
                        doctors.add(new Doctor(name, id, officenum, spiec, workhours));
                        System.out.println("Doctor added successfully.");
                    }
                    break;
                case 2:
                    if (doctors.isEmpty()) {
                        System.out.println("sorry! this list is empty ");
                    } else {
                        System.out.print("Enter ID of doctor to delete: ");
                        String deleteId = in.next();
                        mosab:
                        {
                            for (Doctor doctor : doctors) {
                                if (doctor.getID().equals(deleteId)) {
                                    doctors.remove(doctor);
                                    System.out.println("Doctor deleted successfully.");
                                    break mosab;
                                }
                            }
                            System.out.println("sorry!the doctor isnt found ");
                        }
                    }
                    break;

                case 3:
                    if (doctors.isEmpty()) {
                        System.out.println("sorry! this list is empty ");
                    } else {
                        System.out.println("Doctors List:");
                        for (Doctor doctor : doctors) {
                            System.out.println(doctor);
                            System.out.print("**********************************************");
                            System.out.println("\t\t");
                        }
                    }
                    break;
                case 4:
                    if (doctors.isEmpty()) {
                        System.out.println("sorry! this list is empty ");
                    } else {
                        System.out.print("Enter ID of doctor to find: ");
                        String findId = in.next();
                        mosab1:
                        {
                            for (Doctor doctor : doctors) {
                                if (doctor.getID().equals(findId)) {
                                    System.out.println("the doctor is found ");
                                    break mosab1;
                                }
                            }
                            System.out.println("sorry!the doctor isnt found ");
                        }
                    }
                    break;
                case 5:
                    return;
            }

        }

    }

    private static void aboutsick(LinkedList<Sick> sickList) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Operation about SickList:");
            System.out.println("1. insert");
            System.out.println("2. delete");
            System.out.println("3. display");
            System.out.println("4. find");
            System.out.println("5. Exit");
            int choise = in.nextInt();

            switch (choise) {

                case 1:
                    mosab:
                    {
                        System.out.print("enter new name : ");
                        String name = in.next();
                        System.out.print("enter new Id : ");
                        int id = in.nextInt();
                        for (Sick sick : sickList) {
                            if (sick.getID().equals(id)) {
                                System.out.println("error! this id is founded");
                                break mosab;
                            }
                        }
                        System.out.print("enter new level : ");
                        String level = in.next();
                        sickList.add(new Sick(name, id, level));
                        System.out.println("Sick added successfully.");
                    }
                    break;
                case 2:
                    if (sickList.isEmpty()) {
                        System.out.println("sorry! this list is empty ");
                    } else {
                        System.out.print("Enter ID of Sick to delete: ");
                        int deleteId = in.nextInt();
                        mosaab2:
                        {
                            for (Sick sick : sickList) {
                                if (sick.getID().equals(deleteId)) {
                                    sickList.remove(sick);
                                    System.out.println("Sick removed successfully");
                                    break mosaab2;
                                }
                            }
                            System.out.println("sorry! the sick isnt found");
                        }
                    }
                    break;

                case 3:
                    if (sickList.isEmpty()) {
                        System.out.println("sorry! this list is empty ");
                    } else {
                        System.out.println("sickList List:");
                        for (Sick sick : sickList) {
                            System.out.println(sick);
                            System.out.print("**********************************************");
                            System.out.println("\t\t");
                        }
                    }
                    break;
                case 4:
                    if (sickList.isEmpty()) {
                        System.out.println("sorry! this list is empty ");
                    } else {
                        System.out.print("Enter ID of sick to find: ");
                        int findId = in.nextInt();
                        mosaab3:
                        {
                            for (Sick sick : sickList) {
                                if (sick.getID().equals(findId)) {
                                    System.out.println("the sick is found ");
                                    break mosaab3;
                                }
                            }
                            System.out.println("sorry! the sick isnt found");
                        }
                    }
                    break;
                case 5:
                    return;
            }

        }

    }

    private static void aboutSpeiciallty(LinkedList<Spieciallty> specialties) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Operation about specialties:");
            System.out.println("1. insert");
            System.out.println("2. delete");
            System.out.println("3. display");
            System.out.println("4. find");
            System.out.println("5. Exit");
            int choise = in.nextInt();

            switch (choise) {

                case 1:
                    System.out.print("enter new name : ");
                    String name = in.next();
                    specialties.add(new Spieciallty(name));
                    System.out.println("Spieciallty " + name + " added successfully.");
                    System.out.println("***************************************************");
                    break;
                case 2:
                    if (specialties.isEmpty()) {
                        System.out.println("sorry! this list is empty ");
                    } else {
                        System.out.print("Enter name of Spieciallty to delete: ");
                        String deletename = in.next();
                        mosaab4:
                        {
                            for (Spieciallty spiec : specialties) {
                                if (spiec.getName().equals(deletename)) {
                                    specialties.remove(spiec);
                                    System.out.println("Spieciallty removed successfully");
                                    break mosaab4;
                                }
                            }
                            System.out.println("sorry! the Spieciallty isnt found");
                        }
                    }
                    break;

                case 3:
                    if (specialties.isEmpty()) {
                        System.out.println("sorry! this list is empty ");
                    } else {
                        System.out.println("Spieciallty List:");
                        for (Spieciallty sick : specialties) {
                            System.out.println(sick);
                            System.out.print("**********************************************");
                            System.out.println("\t\t");
                        }
                    }
                    break;
                case 4:
                    if (specialties.isEmpty()) {
                        System.out.println("sorry! this list is empty ");
                    } else {
                        System.out.print("Enter name of Spieciallty to find: ");
                        String findname = in.next();
                        mosaab5:
                        {
                            for (Spieciallty spiec : specialties) {
                                if (spiec.getName().equals(findname)) {
                                    System.out.println("the Spieciallty is found ");
                                    break mosaab5;
                                }
                            }
                            System.out.println("sorry! the Spieciallty isnt found");
                        }
                    }
                    break;
                case 5:
                    return;
            }

        }

    }

    private static void aboutroom(ArrayList<Room> rooms) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Operation about Rooms:");
            System.out.println("1. insert");
            System.out.println("2. display");
            System.out.println("3. find");
            System.out.println("4. Exit");
            int choise = in.nextInt();

            switch (choise) {

                case 1:
                    System.out.print("enter new number : ");
                    int number = in.nextInt();
                    System.out.println("enter floor : ");
                    int floor = in.nextInt();
                    rooms.add(new Room(number, floor));
                    System.out.println("Room " + number + " added successfully.");
                    System.out.println("***************************************************");
                    break;
                case 2:
                    if (rooms.isEmpty()) {
                        System.out.println("sorry! this list is empty ");
                    } else {
                        System.out.println("Room List:");
                        for (Room room : rooms) {
                            System.out.println(room);
                            System.out.print("**********************************************");
                            System.out.println("\t\t");
                        }
                    }
                    break;
                case 3:
                    if (rooms.isEmpty()) {
                        System.out.println("sorry! this list is empty ");
                    } else {
                        System.out.print("Enter number of Room to find: ");
                        int findnum = in.nextInt();
                        mosaab7:
                        {
                            for (Room room : rooms) {
                                if (room.getNumber().equals(findnum)) {
                                    System.out.println("the Room is found ");
                                    break mosaab7;
                                }
                            }
                            System.out.println("sorry! the Room isnt found");
                        }
                    }
                    break;
                case 4:
                    return;
            }

        }

    }

}
