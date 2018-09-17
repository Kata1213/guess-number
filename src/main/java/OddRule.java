import java.util.List;
import java.util.stream.Collectors;

public class OddRule implements Rule {

    @Override
    public List<Integer> apply(List<Integer> input) {
        return input.stream()
                .filter(x->x%2!=0)
                .collect(Collectors.toList());
    }
}
