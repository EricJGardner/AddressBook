import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddressBook {

    //field: an ArrayList list of generic type Entries
    private static List<Entry> entryList = new ArrayList<>();

    //methods: ways to manipulate he array list
    //add method

    public static void addEntry(Entry entry){
        entryList.add(entry);
        System.out.println(entry);
        }

        public static void addAll(Entry... args) {
        entryList.addAll(Arrays.asList(args));
        }

    //delete
    public static String removeEntry(Entry entry) {
        var wasDeleted = entryList.remove(entry);
        if (wasDeleted) {
            return "\nEntry was deleted!\n";
            }
        return "Something went wrong...";
    }
    public static void removeAll() {
        entryList.clear();
        System.out.print("Address book was cleared!\n");
    }
    //finding
    public static Entry findEntry(String email) {
        return entryList.stream()
                .filter(entry -> entry.getEmailAddress().equals(email))
                .findFirst()
                .orElseThrow();
    }
    //printing
    public static void printAll() {
        entryList.forEach(System.out::println);
    }
}
