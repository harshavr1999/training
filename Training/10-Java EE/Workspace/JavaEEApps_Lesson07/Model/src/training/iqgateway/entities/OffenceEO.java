package training.iqgateway.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@NamedQueries({
  @NamedQuery(name = "OffenceEO.findAll", query = "select o from OffenceEO o")
})
@Table(name="OFFENCE")
public class OffenceEO implements Serializable {
    @Id
    @Column(name="OFFENCE_ID")
    private Integer offenceId;
    
    @Column(name="OFFENCE_TYPE")
    private String offenceType;
    
    
    private Float penalty;
    
    @Column(name="VEHICLE_TYPE")
    private String vehicleType;
    
    public OffenceEO(){
        
    }

    public OffenceEO(Integer offenceId, String offenceType, Float penalty,
                     String vehicleType) {
        super();
        this.offenceId = offenceId;
        this.offenceType = offenceType;
        this.penalty = penalty;
        this.vehicleType = vehicleType;
    }


    public void setOffenceId(Integer offenceId) {
        this.offenceId = offenceId;
    }

    public Integer getOffenceId() {
        return offenceId;
    }

    public void setOffenceType(String offenceType) {
        this.offenceType = offenceType;
    }

    public String getOffenceType() {
        return offenceType;
    }

    public void setPenalty(Float penalty) {
        this.penalty = penalty;
    }

    public Float getPenalty() {
        return penalty;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }
}
