import java.util.GregorianCalendar;

public class AudioVideo extends Item {
    private int MAX_BORROW_DAY = 7;

    public int getMAX_BORROW_DAY() {
        return this.MAX_BORROW_DAY;
    }

    public void setMAX_BORROW_DAY(int MAX_BORROW_DAY) {
        this.MAX_BORROW_DAY = MAX_BORROW_DAY;
    }

    public void dueDate(GregorianCalendar borrowerDate) {

    }
}

class DVD extends AudioVideo {
    private String director;

    public String getDirectior() {
        return this.director;
    }

    public void setDirectior(String director) {
        this.director = director;
    }

    
    System.out.println("Director : " + director);
}
