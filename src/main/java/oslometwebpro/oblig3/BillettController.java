package oslometwebpro.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BillettController {

    @Autowired
    private BillettRepository rep;

    //Lagrer inputene på server
    @PostMapping("/lagre")
    public void lagreBillett(Billett billett) {
        rep.lagreBillett(billett);
    }

    //Henter billetter fra server
    @GetMapping("/hentAlle")
    public List<Billett> hentAlle(){
        return rep.hentAlleBilletter();
    }

    //Sletter billettene fra server
    @GetMapping("/slettAlle")
    public void slettAlle() {
        rep.slettAlleBilletter();
    }
}