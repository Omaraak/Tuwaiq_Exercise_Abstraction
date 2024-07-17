public class Movie extends Product{
    private String directer;

    public void setDirecter(String directer) {
        this.directer = directer;
    }
    public String getDirecter() {
        return directer;
    }
    public Movie(String name, double price) {}

    public Movie(String name, double prise, String directer) {
        super(name,prise);
        this.directer = directer;
    }

    @Override
    public double getDiscount() {
        return getPrice()-10;
    }
}
