package example.codeclan.com.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 17/01/2017.
 */
public class WordsTest {
    Words words;
    Words words2;
    Words words3;

    @Before
    public void before(){
        words = new Words("These Words Though");
        words2 = new Words("");
        words3 = new Words("Ayylmao");
    }

    @Test
    public void canCountWords() {
        assertEquals(3,words.countWords());
    }

    @Test
    public void canCountIfNoWords() {
        assertEquals(0,words2.countWords());
    }

    @Test
    public void canCountOneWord() {
        assertEquals(1,words3.countWords());
    }
}