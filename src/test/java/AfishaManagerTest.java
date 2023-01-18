import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.AfishaManager;

public class AfishaManagerTest {

    @Test
    public void shouldAddFilm() {
        AfishaManager afishaManager = new AfishaManager();

        afishaManager.add("TestFilm");
        String expected = "TestFilm";
        String actual = afishaManager.findAll()[0];

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnAllFilms() {
        String film1 = "TestFilm1";
        String film2 = "TestFilm2";
        String film3 = "TestFilm3";
        String film4 = "TestFilm4";

        AfishaManager afishaManager = new AfishaManager();
        afishaManager.add(film1);
        afishaManager.add(film2);
        afishaManager.add(film3);
        afishaManager.add(film4);

        String[] expected = new String[]{film1, film2, film3, film4};
        String[] actual = afishaManager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnLastFilms() {
        String film1 = "TestFilm1";
        String film2 = "TestFilm2";
        String film3 = "TestFilm3";
        String film4 = "TestFilm4";

        AfishaManager afishaManager = new AfishaManager();
        afishaManager.add(film1);
        afishaManager.add(film2);
        afishaManager.add(film3);
        afishaManager.add(film4);

        String[] expected = new String[]{film4, film3, film2, film1};
        String[] actual = afishaManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnLastFilmsCustomResultSize() {
        String film1 = "TestFilm1";
        String film2 = "TestFilm2";
        String film3 = "TestFilm3";
        String film4 = "TestFilm4";

        AfishaManager afishaManager = new AfishaManager(2);
        afishaManager.add(film1);
        afishaManager.add(film2);
        afishaManager.add(film3);
        afishaManager.add(film4);

        String[] expected = new String[]{film4, film3};
        String[] actual = afishaManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}