package pl.sda.javalondek4springdemo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.sda.javalondek4springdemo.repository.MyRepository;

import static java.util.Objects.nonNull;

@Service
public class MyService {

    private static final Logger logger = LoggerFactory.getLogger(MyService.class);

    private final MyRepository myRepository;

    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public String convertToUpperCase(String string) {
        // if (string !=  null) --> nonNull
        String result = nonNull(string) ? string.toUpperCase() : null;

        logger.info("object before conversion: [{}], and after [{}]", string, result);

        return result;
    }
}
