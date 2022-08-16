import java.util.Arrays;

public class Manager {

    protected Repository repo;

    public Manager(Repository repo) {
        this.repo = repo;
    }

    public void save(Ticket ticket) {
        repo.save(ticket);
    }

    public Ticket[] getTickets() {
        return repo.getTickets();
    }

    public void deleteById(int id) {
        repo.deleteById(id);
    }

    public Ticket[] searchBy(String from, String to) {
        Ticket[] result = new Ticket[0];
        for (Ticket ticket : repo.getTickets()) {
            if (matches(ticket, to, from)) {
                Ticket[] tmp = new Ticket[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = ticket;
                result = tmp;
            }
        }
        Arrays.sort(result);
        return result;
    }

    private boolean matches(Ticket ticket, String search, String from) {
        if (ticket.getFrom().contains(search)) {
            return true;
        } else if (ticket.getTo().contains(search)) {
            return true;
        } else {
            return false;
        }
    }
}