package co.develhope.logging.services;

import co.develhope.logging.controllers.BasicController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class BasicService{

    Logger logger = LoggerFactory.getLogger(BasicController.class);
    @Value("${customVar1}")
    int envVar1;

    @Value("${customVar2}")
    int envVar2;

    public String welcome(){
        logger.info("Benvenuto nella mia applicazione");
        return "Benvenuto nella mia applicazione!";
    }

    public String potenza(){
        logger.debug("Inizio calcolo...");
        long result = (long)Math.pow(envVar1, envVar2);
        logger.debug("...Calcolo completo");
        logger.info("Risultato: "+ result);
        return "Totale del calcolo: " + result;
    }

    public void errors() {
        logger.error("Custom error..");
    }


}