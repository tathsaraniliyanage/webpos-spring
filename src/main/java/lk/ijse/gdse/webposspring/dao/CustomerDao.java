package lk.ijse.gdse.webposspring.dao;

import lk.ijse.gdse.webposspring.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao  extends JpaRepository<CustomerEntity, String> {
}
