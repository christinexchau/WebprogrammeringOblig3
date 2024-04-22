package oslometwebpro.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class BillettRepository {

    @Autowired
    private JdbcTemplate db;

    // Lagrer inputverdinene inni tabellen
    public void lagreBillett (Billett billett) {
        String sql = "INSERT INTO Billett (film, antall, fornavn, etternavn, epost, telefonnr) VALUES (?,?,?,?,?,?)";
        db.update(sql, billett.getFilm(),
                billett.getAntall(),
                billett.getFornavn(),
                billett.getEtternavn(),
                billett.getEpost(),
                billett.getTelefonnr());
    }

    // Legger til en SQL-kommando der brukeren henter alle billetter
    public List<Billett> hentAlleBilletter() {
        String sql = "SELECT * FROM Billett";
        List<Billett> alleBilletter = db.query(sql, new BeanPropertyRowMapper(Billett.class));
        return alleBilletter;
    }

    // Legger til en SQL-kommando der brukeren sletter alle billetter
    public void slettAlleBilletter() {
        String sql = "DELETE FROM Billett";
        db.update(sql);
    }
}
