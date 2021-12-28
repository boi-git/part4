
public class DisplayMale implements Display {

    @Override
    public Jordan createJordan() {
        return new JordanMale();
    }

    @Override
    public Basketball creatBasketball() {
        return new BasketballMale();
    }

    @Override
    public Football creatFootball() {
        return new FootballMale();
    }

}
