package java_coding_problems_book.stringsquestion;

import java.util.Arrays;
import java.util.List;

public class ApplyingIndentation {
    public static void main(String[] args) {
        //Approach - 1
        String days = "Sunday\n"
                + "Monday\n"
                + "Tuesday\n"
                + "Wednesday\n"
                + "Thursday\n"
                + "Friday\n"
                + "Saturday";
        System.out.println(days.indent(10));

        //Approach - 2
        List<String> dayss = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");

        for (int i = 0; i < dayss.size(); i++){
            System.out.println(dayss.get(i).indent(i));
        }

        dayss.stream()
                .forEachOrdered(d -> System.out.println(d.indent(d.length())));

        //Approach - 3
        String html = "<html>";
        String body = "<body>";
        String h2 = "<h2>";
        String text = "Hello World";
        String closeH2 = "</h2>";
        String closeBody = "</body>";
        String closeHtml = "</html>";

        System.out.println(html.indent(0) + body.indent(4) + h2.indent(8) + text.indent(12) + closeH2.indent(12)
        + closeH2.indent(8) + closeBody.indent(4) + closeHtml.indent(0));
    }
}
