import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Reader {

    private String fio; //ФИО
    private String email; //электронный адрес
    private boolean subscriber; //флаг согласия на рассылку
    private List<Book> books; //взятые книги

    public Reader(String fio, String email, boolean subscriber) {
        this.fio = fio;
        this.email = email;
        this.subscriber = subscriber;
        this.books = new ArrayList<>();
    }
}
