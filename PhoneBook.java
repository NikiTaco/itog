import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, HashSet<String>> phoneBook = new HashMap<>();

        String[][] inputData = {
                {"John", "123-456-7890"},
                {"Alice", "987-654-3210"},
                {"John", "111-222-3333"},
                {"Bob", "555-555-5555"},
                {"Alice", "999-888-7777"}
        };

        for (String[] data : inputData) {
            String name = data[0];
            String phoneNumber = data[1];

            if (phoneBook.containsKey(name)) {
                phoneBook.get(name).add(phoneNumber);
            } else {
                HashSet<String> phoneNumbers = new HashSet<>();
                phoneNumbers.add(phoneNumber);
                phoneBook.put(name, phoneNumbers);
            }
        }

        List<Map.Entry<String, HashSet<String>>> sortedEntries = new ArrayList<>(phoneBook.entrySet());

        sortedEntries.sort((entry1, entry2) -> entry2.getValue().size() - entry1.getValue().size());

        System.out.println("Телефонная книга:");
        for (Map.Entry<String, HashSet<String>> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}