public class Item {
    private String title;
    private boolean borrowed;
    // Borrow Date

    private int year;
    private int month;
    private int dayOfMonth;

    // Getters and setters
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getBorrowed() {
        return this.borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    // functions
    public void getTime() {
    }

    public void borrowedDate(int year, int month, int dayOfMonth) {
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
    }

    public void print() {

    }
}
