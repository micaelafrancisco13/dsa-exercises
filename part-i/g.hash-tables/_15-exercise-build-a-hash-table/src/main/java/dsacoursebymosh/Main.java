package dsacoursebymosh;

public class Main {
    public static void main(String[] args) {
        var entry1 = new Entry(1, "ela");
        var entry2 = new Entry(6, "kerwin");
        var entry3 = new Entry(3, "maeve");
        var entry4 = new Entry(4, "ulysses");
        var entry5 = new Entry(5, "mirava");
        var hashTable = new HashTable(5);
        hashTable.put(entry1);
        hashTable.put(entry2);
        hashTable.put(entry3);
        hashTable.put(entry4);
        hashTable.put(entry5);
        System.out.println(hashTable);
        System.out.println(hashTable.remove(3).getValue());
        System.out.println(hashTable);
        hashTable.put(new Entry(4, "new ulysses"));
        System.out.println(hashTable.get(1));
        System.out.println(hashTable.get(6));
        System.out.println(hashTable.get(3));
        System.out.println(hashTable);
    }
}