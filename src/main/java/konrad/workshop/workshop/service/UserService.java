package konrad.workshop.workshop.service;

import konrad.workshop.workshop.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
