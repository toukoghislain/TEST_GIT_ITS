package its.scuola.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import its.scuola.entity.Studente;
import its.scuola.repository.StudenteRepository;

@Service
public class StudenteService {
    @Autowired
    private StudenteRepository studenteRepository;

    public void salvaStudenteDaJson(MultipartFile file) throws IOException{
        ObjectMapper objectMapper = new ObjectMapper();
        List<Studente> studenti = objectMapper.readValue(file.getBytes(), new TypeReference<List<Studente>>(){});
        studenteRepository.saveAll(studenti);
    }
}