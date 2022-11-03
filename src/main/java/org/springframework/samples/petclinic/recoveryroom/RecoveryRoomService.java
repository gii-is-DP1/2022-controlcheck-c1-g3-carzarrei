package org.springframework.samples.petclinic.recoveryroom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecoveryRoomService {
	private RecoveryRoomRepository rr;
	
	@Autowired
	public RecoveryRoomService(RecoveryRoomRepository recoveryRoomRepository) {
		this.rr = recoveryRoomRepository;
	}
    public List<RecoveryRoom> getAll(){
        return rr.findAll();
    }

    public List<RecoveryRoomType> getAllRecoveryRoomTypes(){
        return rr.findAllRecoveryRoomTypes();
    }

    public RecoveryRoomType getRecoveryRoomType(String typeName) {
    	return rr.getRecoveryRoomType(typeName);
    }

    public RecoveryRoom save(RecoveryRoom p) throws DuplicatedRoomNameException {
        return null;       
    }

    
}
