package com.acostyle.timecapsule.repository;

import com.acostyle.timecapsule.entity.Message;
import com.acostyle.timecapsule.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNullApi;

import java.util.List;
import java.util.Optional;

public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findByUser(User user);
    Optional<Message> findById(Long id);
}
