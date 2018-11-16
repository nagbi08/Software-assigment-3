import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass{
    private Date date;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public DateClass(Date date) {
        this.date = date;
    }

    public String getDate()    {
        return sdf.format(date);
    }

    public void incremtDays(int days) {
        Calendar c = Calendar.getInstance();
        c.setTime(this.date);
        c.add(Calendar.DATE, days);
        this.date= c.getTime();
    }
}
