package healthassistance.webapp.Repository;

import healthassistance.webapp.Model.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientRepository extends MongoRepository<Patient,String> {
    Patient findByNIC(String NIC);
}
