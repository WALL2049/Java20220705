package collection_test.list_test;

public class Card {
    private String size;
    private String colour;
    private int index;

    public Card() {
    }

    public Card(String size, String colour, int index) {
        this.size = size;
        this.colour = colour;
        this.index = index;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return colour + size;
    }
}