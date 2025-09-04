public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        System.out.println("Original Person: " + p1);

        Person p2 = new Person(p1);
        System.out.println("Cloned Person: " + p2);

        // To check independence, change p2 and see that p1 is unaffected
        p2.setName("Bob");
        p2.setAge(30);

        System.out.println("After modifying cloned person:");
        System.out.println("Original Person: " + p1);
        System.out.println("Cloned Person: " + p2);
    }
}
