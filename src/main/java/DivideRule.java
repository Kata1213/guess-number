import java.util.List;
import java.util.stream.Collectors;

public class DivideRule implements Rule {
    @Override
    public List<Integer> apply(List<Integer> integers) {
        return integers.stream()
                .map(x->x/2)
                .collect(Collectors.toList());
    }
}
