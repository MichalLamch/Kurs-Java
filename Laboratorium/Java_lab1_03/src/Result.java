import java.util.ArrayList;
import java.util.List;

public class Result {
    private int valueOfRank;
    private List<Integer> valueOfCards = new ArrayList<>(5);
    public void setValueOfRank(int valueOfRank)
    {
        this.valueOfRank = valueOfRank;
    }
    public void addToListValueOfCards(int valueOfCard)
    {
        valueOfCards.add(valueOfCard);
    }
    public int getValueOfRank()
    {
        return valueOfRank;
    }
    public List<Integer> getValueOfCards()
    {
        return valueOfCards;
    }
}
