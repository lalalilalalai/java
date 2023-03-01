import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

//       TODO https://skillbox.ru/media/base/java-stream-api-kopilka-retseptov/

        Library library = new Library();
        System.out.println("Sorted by issue year book list:\n" + sortLibraryBooksByIssueYear(library) + "\n");
        System.out.println("Book quantity in library is " + sortLibraryBooksByIssueYear(library).size() + "\n");
        System.out.println("All reader emails:\n" + getAllReadersEmails(library) + "\n");
        System.out.println("Filtered reader emails by book quantity > 1 and isSubscriber = true:\n" + filterReadersEmails(library) + "\n");
        System.out.println("Distinct books that readers have are:\n" + getDistinctBooks(library) + "\n");
        System.out.println("Distinct book quantity in library is " + getDistinctBooks(library).size() + "\n");
        System.out.println("Is any reader that has book with title 'Lalalilalai book': " + isAnyReaderHasBook(library, "Lalalilalai book") + "\n");
        System.out.println("Max reader books quantity is': " + getMaxReaderBookCount(library) + "\n");

    }

    //        TODO Получить список всех книг библиотеки, отсортированных по году издания.
//             Return books list sorted by issue year.
    static List<Book> sortLibraryBooksByIssueYear(Library library) {
        return library.getBooks()
                .stream()
                .sorted(Comparator.comparing(Book::getIssueYear))
                .collect(Collectors.toList());
    }


    //    TODO Требуется создать список рассылки (объекты типа EmailAddress) из адресов всех читателей библиотеки.
//         При этом флаг согласия на рассылку учитывать не будем: библиотека закрывается, так что хотим оповестить всех.
    static List<String> getAllReadersEmails(Library library) {
        return library.getReaders()
                .stream()
                .map(Reader::getEmail)
                .toList();
    }


    //    TODO Снова нужно получить список рассылки. Но на этот раз включаем в него только адреса читателей, которые согласились на рассылку.
//         Дополнительно нужно проверить, что читатель взял из библиотеки больше одной книги.
    static List<String> filterReadersEmails(Library library) {
        return library.getReaders()
                .stream()
                .filter(Reader::isSubscriber)
                .filter(reader -> reader.getBooks().size() > 1)
                .map(Reader::getEmail)
                .toList();
    }

    //    TODO Получить список всех книг, взятых читателями.
//         Список не должен содержать дубликатов (книг одного автора, с одинаковым названием и годом издания).
    static List<Book> getDistinctBooks(Library library) {
        return library.getReaders()
                .stream()
                .flatMap(reader -> reader.getBooks().stream())
                .distinct()
                .toList();
    }

    //    TODO Проверить, взял ли кто-то из читателей библиотеки какие-нибудь книги Оруэлла.
    static boolean isAnyReaderHasBook(Library library, String title) {
        return library.getReaders()
                .stream()
                .flatMap(reader -> reader.getBooks().stream())
                .anyMatch(book -> book.getName().equalsIgnoreCase(title));
    }

    //    TODO Узнать наибольшее число книг, которое сейчас на руках у читателя.
    static int getMaxReaderBookCount(Library library) {
        return library.getReaders()
                .stream()
                .map(reader -> reader.getBooks().size())
                .reduce(0, (max, size) -> size > max ? size : max);
    }
}
