package konrad.workshop.workshop.repository;

import konrad.workshop.workshop.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
