package enumsLearn;

public class NewLap {
    
}

enum LapTop {
    HP(100),
    DELL(120),
    LENOVO(150);

    private int price;

    LapTop(int price){
        this.price = price;
    }
}
