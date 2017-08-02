package copart;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by fan on 7/29/17.
 */
public class Book {

    private String name;
    private int age;

    Book(String name, int age){
        this.age=age;
        this.name=name;
    }

    static class StringComparator implements Comparator<Book>{

        @Override
        public int compare(Book o1, Book o2) {
            return o2.age-o1.age;
        }
    }


    public static void main(String[] args) {

        Comparator<Book> tor = new StringComparator();

        Book b1 = new Book("fan",22);
        Book b2 = new Book("fan",33);
        Book b3 = new Book("fan",8);
        Book b5 = new Book("fan",400);
        Book b4 = new Book("fan",4);
        Book bb= new Book("fan",1);
        PriorityQueue<Book> queue=new PriorityQueue<Book>(10,tor);
        //Creating Books
        queue.add(b1);
        queue.add(b2);
        queue.add(b3);
        queue.add(b5);
        queue.add(b4);
        queue.add(bb);


        System.out.println("After_-------------");

        //queue.remove();
        int size=queue.size();
        for(int i=0;i<size;i++){
            System.out.println(queue.poll().age);
        }
    }

}
