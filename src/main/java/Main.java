public class Main {
    public static void main(String[] args) {
        Person testPerson = new Person.PersonBuilder("TestName", "TestLastName")
                .middleName("TestMiddleName")
                .age(20)
                .address("TestAdress")
                .country("TestCountry")
                .gender("TestGender")
                .phone("TestPhone")
                .build();
        System.out.println(testPerson);
    }
}
