package HelfMethoden;

import java.text.SimpleDateFormat;
import java.util.Date;

//DatumForamt für nennen screenshot foto beim Auftreten eines Fehlers innerhalb eines Tests
public class FormatedDate {

    String format="yyyyMMdd_HHmmss";
    Date date=new Date();
    public  String getFormatedDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }

}
