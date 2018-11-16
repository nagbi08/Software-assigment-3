import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class DateClassTest {
    private Date date = new Date(2018 - 1900, 11, 3);
    DateClass dateClass = new DateClass(date);

    @Test
    public void getdate() {
        String string = dateClass.getDate();
        assertEquals("3/11/2018", string);
    }

    @Test
    public void incremtDays() {
        dateClass.incremtDays(3);
        String string = dateClass.getDate();
        assertEquals("7/11/2018", string);
    }
}