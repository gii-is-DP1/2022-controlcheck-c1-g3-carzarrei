package org.springframework.samples.petclinic.recoveryroom;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;


import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="recovery_rooms")
@Getter
@Setter
public class RecoveryRoom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
	
    @NotEmpty
    @Size(min=3,max=50)
    String name;
    
    @NotNull
    @PositiveOrZero
    double size;
    
    @NotNull
    boolean secure;
    
    @Transient
    RecoveryRoomType roomType;
}
