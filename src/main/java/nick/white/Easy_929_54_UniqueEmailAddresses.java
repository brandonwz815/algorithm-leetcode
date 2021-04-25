package nick.white;

import java.util.HashSet;
import java.util.Set;

/**
 * O(n2), because of HashSet
 */
public class Easy_929_54_UniqueEmailAddresses {

    public static void main(String[] args) {

        String[] emails = {
                "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"
        };

        System.out.printf(" After: %s", numUniqueEmails(emails));
    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> unique = new HashSet<>();
        for (String email: emails) {
            String[] tokens = email.split("@");
            String localName = tokens[0].split("\\+")[0];
            localName = localName.replaceAll("\\.", "");
            unique.add(localName+tokens[1]);
        }
        return unique.size();
    }
}
