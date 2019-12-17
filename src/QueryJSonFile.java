import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.Writer;

public class QueryJSonFile {
    public class Book{
        private String bookName;
        private int isbn;
    }

    public class BookWriter{
        private String id;
        private String firstName;
        private String lastName;
        private Book[] books;
    }

    public static class TestJSonFile{
        public static void main(String[] args){
            try {
                ObjectMapper mapper = new ObjectMapper();
                BookWriter writer=(BookWriter)mapper.readValue(new File("myData.java"), BookWriter.class);
                for (Book book: Writer.getBooks()) System.out.println(book.getBookName() + "," + book.getIsbn());
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
