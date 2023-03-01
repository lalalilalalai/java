import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Library {

    private List<Book> books = new ArrayList<>();
    private List<Reader> readers = new ArrayList<>();

    private static final Faker faker = new Faker();

    public Library() {
        init();
    }

    private void init() {
        int quantity = 10;
        for (int i = 0; i < quantity; i++) {
            books.add(new Book(getRandomAuthor(), getRandomTitle(), getRandomYear()));
            readers.add(new Reader(getRandomName(), getRandomEmail(), getRandomBool()));
            readers.get(i).getBooks().add(books.get(i));
        }
//         add 1 more book to the fifth (index = 4) reader
        books.add(new Book(getRandomAuthor(), "Lalalilalai book", getRandomYear()));
        readers.get(4).getBooks().add(books.get(quantity));
//         add double book to the fourth (index = 3) reader
        readers.get(3).getBooks().add(books.get(quantity));
//        add book which is not taken by readers
        books.add(new Book(getRandomAuthor(), "Lalalilalai book", getRandomYear()));
//        add reader which has no book
        readers.add(new Reader(getRandomName(), getRandomEmail(), getRandomBool()));
    }


    private static String getRandomAuthor() {
        return faker.book().author();
    }

    private static String getRandomTitle() {
        return faker.book().title();
    }

    private static Integer getRandomYear() {
        return faker.random().nextInt(1950, 2023);
    }

    private static String getRandomName() {
        return faker.name().nameWithMiddle();
    }

    private static String getRandomEmail() {
        return faker.regexify("[a-z0-9]{5}\\@[a-z]{3}\\.com");
    }

    private static boolean getRandomBool() {
        return faker.bool().bool();
    }
}