package javabasis.re;

import java.lang.String;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

/**
 * Created by Edwin Xu on 9/21/2020 6:04 PM
 *
 *  * <p>The same output can be generated with this code, which uses a regular
 *  * expression to parse all four tokens at once:
 *  * <blockquote><pre>{@code
 *  *     String input = "1 fish 2 fish red fish blue fish";
 *  *     Scanner s = new Scanner(input);
 *  *     s.findInLine("(\\d+) fish (\\d+) fish (\\w+) fish (\\w+)");
 *  *     MatchResult result = s.match();
 *  *     for (int i=1; i<=result.groupCount(); i++)
 *  *         System.out.println(result.group(i));
 *  *     s.close();
 *  * }</pre></blockquote>
 *  *
 */
public class MatchResultTest {
    public static void main(String[] args) {
        String input = "1 fish 2 fish red fish blue fish";
        Scanner s = new Scanner(input);
        s.findInLine("(\\d+) fish (\\d+) fish (\\w+) fish (\\w+)");
        MatchResult result = s.match();
        for (int i=1; i<=result.groupCount(); i++){
            System.out.println(result.group(i));
        }
        s.close();


        "sd".split("\\p{javaLetter}");
        MatchResult matchResult = Pattern.compile("(.*\\p{Punct}).*").matcher("Fsd,sdfsd,sdfsd.d").toMatchResult();
        for (int i=1; i<=matchResult.groupCount(); i++){
            System.out.println(matchResult.group(i));
        }
    }
}
