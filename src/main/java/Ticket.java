public class Ticket implements Comparable<Ticket> {

    protected int id;
    protected int price;
    protected String from;
    protected String to;
    protected int timeInSky;

    public Ticket(int id, int price, String from, String to, int timeInSky) {
        this.id = id;
        this.price = price;
        this.from = from;
        this.to = to;
        this.timeInSky = timeInSky;
    }

    @Override
    public int compareTo(Ticket o) {
        if (this.price < o.price) {
            return -1;
        } else if (this.price > o.price) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getTimeInSky() {
        return timeInSky;
    }

    public void setTimeInSky(int timeInSky) {
        this.timeInSky = timeInSky;
    }
}

