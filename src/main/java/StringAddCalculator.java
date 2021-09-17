import java.util.*;
import java.util.stream.Collectors;

public class StringAddCalculator {

    public static int splitAndSum(String str) {
        if(checkNullOrEmpty(str))
            return 0;

        return 0;
    }

    private static boolean checkNullOrEmpty(String str) {
        if(str == null)
            return true;

        if(str.equals(""))
            return true;

        return false;
    }
}
