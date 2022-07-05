package sawant.mihir.springbootrestdatatransfer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sawant.mihir.springbootrestdatatransfer.model.Cricketer;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@RestController
public record AppController() {


    /*
        Sending Cricketer Object as REST through Http
        protocol via GET method.
        As a Response we receive a JSON representation of the
        object which is by default choice in spring boot.
     */
    @GetMapping("/cricketer")
    public Cricketer cricketer(){
        return new Cricketer("Virat Kohli", "India", 3);
    }

    /*
        Returning a Collection of Cricketer Objects.
        Which on the client side will be represented as
        JSON Array.
     */

    @GetMapping("/cricketer/all")
    public List<Cricketer> getCricketers(){
        var c4 = new Cricketer("David Warner", "Australia", 9);
        var c2 = new Cricketer("Quinton De Kock", "South Africa", 5);
        var c3 = new Cricketer("Rohit Sharma", "India", 4);
        var c1 = new Cricketer("Virat Kohli", "India", 3);

        // Sort cricketers with their Icc-Ranks
       return Stream.of(c1, c2, c3, c4)
               .sorted(Comparator.comparingInt(Cricketer::iccRank)).toList();
    }


    @GetMapping("/cricketer/response")
    public ResponseEntity<Cricketer> getCricketerResponse(){
        var c3 = new Cricketer("Rohit Sharma", "India", 4);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("cricket_board", "BCCI")
                .header("ipl_team", "MI")
                .body(c3);
    }


}
