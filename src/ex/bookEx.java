package ex;

import java.util.HashMap;
import java.util.Map;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book other = (Book) obj;
            return title == other.title && author.equals(other.author);
        } else {
            return false;
        }
    }
}

public class bookEx {
    public static void main(String[] args) {
        Book book1 = new Book("바람과 길","홍길동");
        Book book2 = new Book("바람","홍길동");
        Book book3 = new Book("길","홍길동");

        HashMap<Book, Integer> books = new HashMap<>();
        books.put(book1,10000);
        books.put(book2,5000);
        books.put(book3,3000);

        System.out.println(book1);
        System.out.println();

        for (Map.Entry<Book, Integer> entrySet : books.entrySet()) {
            System.out.println(entrySet.getKey() + " 가격 => "+ entrySet.getValue());
        }
    }
}
