import java.lang.StringBuilder;
public class Sum {
    public static void main(String[] args) {
        int totalSum = 0;
        for (String arg : args) {
            StringBuilder curr = new StringBuilder();
            for (int j = 0; j < arg.length(); j++) {
                if (Character.isWhitespace(arg.charAt(j))) {
                    if (!curr.isEmpty()) {
                        totalSum += Integer.parseInt(curr.toString());
                        curr.delete(0, curr.length());
                    }
                } else {
                    curr.append(arg.charAt(j));
                }
            }
            if (!curr.isEmpty()) {
                totalSum += Integer.parseInt(curr.toString());
                curr.delete(0, curr.length());
            }
        }
        System.out.println(totalSum);
    }
}