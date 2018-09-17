import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GussNumber {

    public  String process(String input){
        return Arrays.stream(input.split(" "))
                .filter(x->Integer.parseInt(x)%2!=0)
                .collect(Collectors.joining(" "));
    }
}
