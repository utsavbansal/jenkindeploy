package com.Irrigation.SAIAFarming.repository;

//import com.Irrigation.SAIAFarming.entity.UserDatabase;
import com.Irrigation.SAIAFarming.entity.FarmerDatabase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmerDatabaseRepository extends JpaRepository<FarmerDatabase, Integer> {
    @Query(value = "SELECT fd FROM FarmerDatabase fd WHERE fd.farmer_id =?1")
    FarmerDatabase findByFarmerId(int famerId);
    //FarmerDatabase findByFarmer_id(int farmer_id);

}
