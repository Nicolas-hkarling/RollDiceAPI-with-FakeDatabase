package karling.nicolas.RollDiceAPI.Controllers;

import karling.nicolas.RollDiceAPI.Databases.FakeDiceDatabase;
import net.minidev.json.JSONObject;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class DiceController {
    FakeDiceDatabase db;

    public DiceController() {
        db = new FakeDiceDatabase();
    }

    @GetMapping("/d20")
    public ResponseEntity<Object> Dice20(){

        Random number = new Random();
        int generateNumber = number.nextInt(20);

        JSONObject entity = new JSONObject();
        entity.put("resultado", db.diceNumber.get(generateNumber));
        return new ResponseEntity<Object>(entity, new HttpHeaders(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/d12")
    public ResponseEntity<Object> Dice12(){

        Random number = new Random();
        int generateNumber = number.nextInt(12);

        JSONObject entity = new JSONObject();
        entity.put("resultado", db.diceNumber.get(generateNumber));
        return new ResponseEntity<Object>(entity, new HttpHeaders(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/d10")
    public ResponseEntity<Object> Dice10(){

        Random number = new Random();
        int generateNumber = number.nextInt(10);

        JSONObject entity = new JSONObject();
        entity.put("resultado", db.diceNumber.get(generateNumber));
        return new ResponseEntity<Object>(entity, HttpStatus.ACCEPTED);
    }

    @GetMapping("/d8")
    public ResponseEntity<Object> Dice8(){

        Random number = new Random();
        int generateNumber = number.nextInt(8);

        JSONObject entity = new JSONObject();
        entity.put("resultado", db.diceNumber.get(generateNumber));
        return new ResponseEntity<Object>(entity, HttpStatus.ACCEPTED);
    }

    @GetMapping("/d6")
    public ResponseEntity<Object> Dice6(){

        Random number = new Random();
        int generateNumber = number.nextInt(6);

        JSONObject entity = new JSONObject();
        entity.put("resultado", db.diceNumber.get(generateNumber));
        return new ResponseEntity<Object>(entity, HttpStatus.ACCEPTED);
    }

    @GetMapping("/d4")
    public ResponseEntity<Object> Dice4(){

        Random number = new Random();
        int generateNumber = number.nextInt(4);

        JSONObject entity = new JSONObject();
        entity.put("resultado", db.diceNumber.get(generateNumber));
        return new ResponseEntity<Object>(entity, HttpStatus.ACCEPTED);
    }

}
