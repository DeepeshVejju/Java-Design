package creational.patterns.builder;

public class UserBuilder implements Builder {
    private User user;

    public UserBuilder() {
        this.user = new User();
    }

    @Override
    public Builder setFirstName(String firstName) {
        user.setFirstName(firstName);
        return this;
    }

    @Override
    public Builder setLastName(String lastName) {
        user.setLastName(lastName);
        return this;
    }

    @Override
    public Builder setAge(int age) {
        user.setAge(age);
        return this;
    }

    @Override
    public Builder setId(String id) {
        user.setId(id);
        return this;
    }

    @Override
    public User build() {
        return user;
    }

    @Override
    public User getUser() {
        return user;
    }
    
}
