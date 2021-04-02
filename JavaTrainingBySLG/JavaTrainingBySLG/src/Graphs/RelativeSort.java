package Graphs;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

class Person
{
    String name;
    int rollno;
    String city;
    Person(String name,int rollno,String city)
    {
        this.name=name;
        this.rollno=rollno;
        this.city=city;
    }
}
class ObjectSorting implements Comparator<Person>
{
    public int compare(Person a,Person b){
        //)return a.rollno-b.rollno;
        //return a.name.compareTo(b.name);
        return a.city.compareTo(b.city);
    }
}
public class RelativeSort {

    public static void main(String[] args) {
       Person p1=new Person("Ram",1,"Ayodhy") ;
       Person p2=new Person("Krish",3,"Brynd");
       Person p3=new Person("Shiv",2,"Himalay");
       Person p4=new Person("Vish",15,"Sea");

       ArrayList<Person> a=new ArrayList<>();
        a.add(p1);
        a.add(p2);
        a.add(p3);
        a.add(p4);
        Collections.sort(a,new ObjectSorting());
        for(int i=0;i<a.size();i++)
            System.out.println(a.get(i).name+" "+a.get(i).rollno+" "+a.get(i).city);
    }
}
