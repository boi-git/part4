
public class DisplayFemale implements Display {

    @Override
    public Jordan createJordan() {
        return new JordanFemale();
    }

    @Override
    public Basketball creatBasketball() {
        return new BasketballFemale();
    }

    @Override
    public Football creatFootball() {
        return new FootballFemale();
    }

}
