import java.util.List;

/**
 * Created by Venkat Ramana on 12/14/2016.
 */
public class CodeExecutor {
    private Object T;

    void mapAndprint(List list, Imapper<T> mapper){
        T t = mapper.map(T);
        System.out.println(t);

    }
}
