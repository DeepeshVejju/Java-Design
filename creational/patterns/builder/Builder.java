package creational.patterns.builder;

interface Builder {

Builder setFirstName(String firstName);

    Builder setLastName(String lastName);

    Builder setAge(int age);

    Builder setId(String id);

    User build();

    User getUser();
    
}
