import com.google.common.base.Strings;
import com.google.common.io.LineReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GussNumber {

    public static void main(String []args) throws IOException {
        LineReader lineReader = new LineReader(new InputStreamReader(System.in));
        String line;
        while (!Strings.isNullOrEmpty((line=lineReader.readLine()))){
            System.out.println(new GussNumber().process(line));
            System.out.println(new GussNumber().caculateOdd(line));
        }
    }

    public  String process(String input){
        return  Arrays.stream(input.split(" "))
                .map(Integer::parseInt)
                .filter(x->x%2!=0)
                .map(x->(x*2+1))
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
    }


    public String caculateOdd(String s) {
        return Arrays.stream(s.split(" "))
                .map(Integer::parseInt)
                .filter(x->x%2==0)
                .map(x->(x/2))
                .map(String::valueOf)
                .collect(Collectors.joining(" "));

    }
}
