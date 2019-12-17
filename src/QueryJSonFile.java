import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Arrays;

public class QueryJSonFile {
    public class Book{
        private String bookName;
        private int isbn;

        public String getBookName() {
            return bookName;
        }

        public void setBookName(String bookName) {
            this.bookName = bookName;
        }

        public int getIsbn() {
            return isbn;
        }

        public void setIsbn(int isbn) {
            this.isbn = isbn;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "bookName='" + bookName + '\'' +
                    ", isbn=" + isbn +
                    '}';
        }
    }

    public class BookWriter{
        private String id;
        private String firstName;
        private String lastName;
        private Book[] books;

        @Override
        public String toString() {
            return "BookWriter{" +
                    "id='" + id + '\'' +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", books=" + Arrays.toString(books) +
                    '}';
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Book[] getBooks() {
            return books;
        }

        public void setBooks(Book[] books) {
            this.books = books;
        }
    }


    public static class TestJSonFile{
        public static void main(String[] args){
            try {
                ObjectMapper mapper = new ObjectMapper();
                BookWriter writer=(BookWriter)mapper.readValue(new File("./myData.json"), BookWriter.class);
                for (Book book: writer.getBooks()) System.out.println(book.getBookName() + "," + book.getIsbn());
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
