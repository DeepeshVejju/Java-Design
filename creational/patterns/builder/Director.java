package creational.patterns.builder;

public class Director {

    public static void main(String[] args) {
        Builder builder = new UserBuilder();
        User user = builder.setFirstName("John")
                           .setLastName("Doe")
                           .setAge(30)
                           .setId("12345")
                           .build();

        System.out.println("User Created: " + user.getFirstName() + " " + user.getLastName() +
                           ", Age: " + user.getAge() + ", ID: " + user.getId());
    }
    
}
