import java.util.List;

public class Screen {
    int id;
    List<Seat> st;

    public Screen(int id, List<Seat> st) {
        this.id = id;
        this.st = st;
    }

    public int getId() {
        return id;
    }

    public List<Seat> getSt() {
        return st;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSt(List<Seat> st) {
        this.st = st;
    }


}
