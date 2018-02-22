import java.util.*;

public class Player {
    private static List<String> figures = new ArrayList<String>(13);
    static {
        figures.add("2");
        figures.add("3");
        figures.add("4");
        figures.add("5");
        figures.add("6");
        figures.add("7");
        figures.add("8");
        figures.add("9");
        figures.add("T");
        figures.add("J");
        figures.add("Q");
        figures.add("K");
        figures.add("A");
    }
    Player(){};
    private Result result = new Result();
    public Result getResult ()
    {
        return result;
    }
    public void printResult()
    {
        System.out.println(result.getValueOfRank()+ " " + result.getValueOfCards().get(0) +  " " + result.getValueOfCards().get(1) + " " + result.getValueOfCards().get(2) + " " + result.getValueOfCards().get(3) + " " + result.getValueOfCards().get(4));
    }
    private List<Card> cards = new ArrayList<Card>(5);
    public void AddCards(Card c)
    {
        cards.add(c);
    }
    public void DeleteCards()
    {
        cards.clear();
    }
    public Card getCard(int index)
    {
        return cards.get(index);
    }
    public List<Card> getList()
    {
        return cards;
    }
    public void organize()
    {
        //Przypisywanie wartosci kartom
        for(Card x : cards)
        {
            String temp1 = x.getName() +"";
            for(int i=0; i<figures.size(); i++) {
                if (temp1.equals(figures.get(i))) x.setValueOfCard(i);
            }
        }
        Collections.sort(cards);
    }
    public void printCards()
    {
        for(Card x : cards) x.printCard();
        System.out.println("");
    }

}
