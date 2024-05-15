public class Main {
    public static void main(String[] args) {
        Account<String> acc1 = new Account<String>("2345", 5000);
        String acc1Id = acc1.getId();
        System.out.println(acc1Id);

        Account<Integer> acc2 = new Account<Integer>(2346, 5000);
        Integer acc2Id = acc2.getId();
        System.out.println(acc2Id);
        System.out.println();

        Accountable<String> ac1 = new Account_2("1235rwr", 5000);
        Account_2 ac2 = new Account_2("2373", 4300);
        System.out.println(ac1.getId());
        System.out.println(ac2.getId());
        System.out.println();

        Printer printer = new Printer();
        String[] people = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
        Integer[] numbers = {23, 4, 5, 2, 13, 456, 4};
        printer.<String>print(people);
        printer.<Integer>print(numbers);
        System.out.println();

        Account_3<String, Double> ac3 = new Account_3<String, Double>("354", 5000.87);
        String id = ac3.getId();
        Double sum = ac3.getSum();
        System.out.printf("Id: %s  Sum: %f \n", id, sum);
        System.out.println();

        Account_4 ac4 = new Account_4("cid2373", 5000);
        Account_4 ac5 = new Account_4(53757, 4000);
        System.out.println(ac4.getId());
        System.out.println(ac5.getId());
    }
}