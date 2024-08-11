package com.example.got_api.Services;
import com.example.got_api.entity.Character;
import com.example.got_api.interfaces.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CharacterService {

    @Autowired
    private CharacterRepository characterRepository;

    public List<Character> getAllCharacter(){
        return characterRepository.findAll();
    }
    public Optional<Character> getCharacterById(Long id){
        return characterRepository.findById(id);
    }
    public Character createCharacter(Character character){
        return characterRepository.save(character);
    }
    public Character updateCharacter(Long id, Character characterDetails){
        Optional<Character> character = characterRepository.findById(id);
        if (character.isPresent()){
            Character updatedCharacter = character.get();
            updatedCharacter.setName(characterDetails.getName());
            updatedCharacter.setHause(characterDetails.getHause());
            updatedCharacter.setRole(characterDetails.getRole());
            updatedCharacter.setAlive(characterDetails.isAlive());
            return characterRepository.save(updatedCharacter);
        }
        return null;
    }
    public void deleteCharacter(Long id) {
        characterRepository.deleteById(id);
    }
}
