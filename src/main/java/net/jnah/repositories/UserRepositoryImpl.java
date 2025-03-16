package net.jnah.repositories;

import org.springframework.stereotype.Repository;

@Repository("d")
public class UserRepositoryImpl implements UserRepository {

    @Override
    public double getData() {
        System.out.println("Database version");
        return 34;
    }
}
