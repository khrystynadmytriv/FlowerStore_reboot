package ua.edu.ucu.apps.flowerstore.appUser;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface AppUserRepository extends JpaRepository<AppUser, Integer> {
    public Optional<AppUser> findAppUserByEmail(String email);
}
