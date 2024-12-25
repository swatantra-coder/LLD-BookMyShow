public class Seat {
    int id;
    int row;
    int price;
    SeatCategory category;

    public Seat(int id, int row, int price, SeatCategory category) {
        this.id = id;
        this.row = row;
        this.price = price;
        this.category = category;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public int getRow() {
        return row;
    }

    public int getPrice() {
        return price;
    }

    public SeatCategory getCategory() {
        return category;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCategory(SeatCategory category) {
        this.category = category;
    }

}
