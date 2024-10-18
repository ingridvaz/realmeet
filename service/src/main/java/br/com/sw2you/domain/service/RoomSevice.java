package br.com.sw2you.domain.service;

import br.com.sw2you.domain.entity.Room;
import br.com.sw2you.domain.repository.RoomRepository;
import br.com.sw2you.exception.RoomNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class RoomSevice {

    private final RoomRepository roomRepository;

    public RoomSevice(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public Room findById(Long id){
        Objects.requireNonNull(id);
        return roomRepository.findById(id).orElseThrow(RoomNotFoundException::new);
    }
}
