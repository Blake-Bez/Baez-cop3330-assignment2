package ex40;
/*
 *  UCF COP3330 Fall 2021 Assignment 40 Solution
 *  Copyright 2021 Blake Baez
 */
import java.util.Date;
import java.util.TreeMap;

public class App {

    static TreeMap<Integer, App > employees = new TreeMap<Integer, App>();


    private String fName;
    private String lName;
    private String pos;
    private Date sepDate;

    public App(String fName, String lName, String pos) {
        this.fName = fName;
        this.lName = lName;
        this.pos = pos;
    }
    public App(String fName, String lName, String pos, Date sepDate) {
        this.fName = fName;
        this.lName = lName;
        this.pos = pos;
        this.sepDate = sepDate;
    }

    public String getfName() { return fName; }
    public void setfName(String fName) { this.fName = fName; }

    public String getlName() { return lName; }
    public void setlName(String lName) { this.lName = lName; }

    public String getPosition() { return pos; }
    public void setPosition(String pos) { this.pos = pos; }

    public Date getSepDate() { return sepDate; }
    public void setSepDate(Date sepDate) { this.sepDate = sepDate; }

    public String toString() {
        return "Employee[ " + "fName=" + fName + ", lName=" + lName
                + ", pos=" + pos + ", sepDate=" + sepDate + " ]";
    }

    public static int search(String name){
        int count = 0;
        for(int k : employees.keySet()){
            if(employees.get(k).getfName().equalsIgnoreCase(name) || employees.get(k).getlName().equalsIgnoreCase(name)){
                count++;
                System.out.println(employees.get(k));
            }
        }
        return count;
    }


    }
