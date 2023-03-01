import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {

    private String author; //Автор
    private String name;    //Название
    private Integer issueYear; //Год издания
}
