package unq.eis.unquiflix;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import unq.eis.unquiflix.model.Categoria;
import unq.eis.unquiflix.model.Pelicula;
import unq.eis.unquiflix.service.PeliculaService;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UnquiflixApplicationTests {

    @Autowired
    private PeliculaService peliService;

    @Test
    public void contextLoads() {
    }

    private void assertVolverAlFuturo(Pelicula vaf){
        assertEquals(Integer.valueOf(1), vaf.getID());
        assertEquals("Volver al Futuro", vaf.getTitulo());
        assertEquals(Categoria.FICCION, vaf.getCategoria());
        assertTrue(vaf.getEstreno().isEqual(LocalDate.of(1985, 7, 3)));
        assertEquals("Robert Zemeckis", vaf.getDirectores());
        assertEquals("Michael J. Fox, Christopher Lloyd, Crispin Glover, Lea Thompson", vaf.getActores());
        assertEquals("https://www.youtube.com/watch?v=qvsgGtivCgs", vaf.getLink());
    }

    @Test
    public void getPeliculaVolverAlFuturoByTitulo() {
        assertVolverAlFuturo(peliService.getPeliculaByTitle("Volver al Futuro"));
    }

    @Test
    public void getPeliculaVolverAlFuturoByID() {
        assertVolverAlFuturo(peliService.getPelicula(1));
    }

}
