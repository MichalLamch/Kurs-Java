import java.util.ArrayList;
import java.util.List;

public class Arbiter {

    private static List<String> rank = new ArrayList<String>(10);

    Arbiter() {
    }

    private List<ArrayList<Card>> groupedCards = new ArrayList<ArrayList<Card>>();
    private List<Card> orderedCards = new ArrayList<Card>(5);
    public List<Card> getOrderedCards()
    {
        return orderedCards;
    }

    public void GroupOrderAndResultCards(Player p) {
        p.getResult().setValueOfRank(0);
        boolean kareta = false;
        boolean trojka = false;
        boolean para = false;
        boolean dwiepary = false;
        groupedCards.clear();
        orderedCards.clear();
        groupedCards.add(new ArrayList<Card>());
        groupedCards.get(0).add(p.getCard(0));
        for (int i = 1; i < 5; i++) {
            if (p.getCard(i).getValueOfCard() == groupedCards.get(groupedCards.size() - 1).get(0).getValueOfCard()) {
                groupedCards.get(groupedCards.size() - 1).add(p.getCard(i));
            } else {
                groupedCards.add(new ArrayList<Card>());
                groupedCards.get(groupedCards.size() - 1).add(p.getCard(i));
            }
        }
        for (List<Card> temp : groupedCards) {
            if (temp.size() == 4) {
                orderedCards.addAll(temp);
                kareta = true;
            }
        }
        for (List<Card> temp : groupedCards) {
            if (temp.size() == 3) {
                orderedCards.addAll(temp);
                trojka = true;
            }
        }
        for (List<Card> temp : groupedCards) {
            if (temp.size() == 2) {
                orderedCards.addAll(temp);
                if (para) dwiepary = true;
                para = true;
            }
        }
        for (List<Card> temp : groupedCards) {
            if (temp.size() == 1) {
                orderedCards.addAll(temp);
            }
        }
        //orderedCards.get(0).printCard();
        //orderedCards.get(1).printCard();
        //orderedCards.get(2).printCard();
        //orderedCards.get(3).printCard();
        //orderedCards.get(4).printCard();
        System.out.println("");
        for (int j = 0; j<orderedCards.size(); j++) {
            p.getResult().addToListValueOfCards(orderedCards.get(j).getValueOfCard());
        }
        if(kareta) p.getResult().setValueOfRank(7);
        if(trojka&&para) p.getResult().setValueOfRank(6);
        if(trojka) p.getResult().setValueOfRank(3);
        if(dwiepary) p.getResult().setValueOfRank(2);
        if(para) p.getResult().setValueOfRank(1);
        if (!kareta && !trojka && !para) {
            if(checkStrit(orderedCards)) p.getResult().setValueOfRank(4);
            if(checkKolor(orderedCards)) p.getResult().setValueOfRank(5);
            if(checkPoker(orderedCards)) p.getResult().setValueOfRank(8);
            if(checkPokerK(orderedCards)) p.getResult().setValueOfRank(9);

        }

    }
    public boolean checkStrit(List<Card> orderedCards) {
        boolean strit = false;
        for (int i = 0; i < 9; i++) {
            if (orderedCards.get(0).getValueOfCard() == (i+4) && orderedCards.get(1).getValueOfCard() == (i+3) && orderedCards.get(2).getValueOfCard() == (i+2) && orderedCards.get(3).getValueOfCard() == (i+1) && orderedCards.get(4).getValueOfCard() == i ) strit = true;
        }
        if (orderedCards.get(0).getValueOfCard() == 3 && orderedCards.get(1).getValueOfCard() == 2 && orderedCards.get(2).getValueOfCard() == 1 && orderedCards.get(3).getValueOfCard() == 0 && orderedCards.get(5).getValueOfCard() == 12 ) strit = true;
        return strit;
    }
    public boolean checkKolor(List<Card> orderedCards)
    {
        return (orderedCards.get(0).getColour() == orderedCards.get(1).getColour() &&
                orderedCards.get(1).getColour() == orderedCards.get(2).getColour() &&
                orderedCards.get(2).getColour() == orderedCards.get(3).getColour() &&
                orderedCards.get(3).getColour() == orderedCards.get(4).getColour() &&
                orderedCards.get(4).getColour() == orderedCards.get(5).getColour());
    }
    public boolean checkPoker(List<Card> orderedCards)
    {
        return checkKolor(orderedCards)&&checkStrit(orderedCards);
    }
    public boolean checkPokerK(List<Card> orderedCards)
    {
        return checkPoker(orderedCards)&&(orderedCards.get(0).getValueOfCard()==12);
    }
    public String compareResults(Player p1, Player p2)
    {
        GroupOrderAndResultCards(p1);
        GroupOrderAndResultCards(p2);
        String winner = "";
        if(p1.getResult().getValueOfRank()>p2.getResult().getValueOfRank()) winner = "Gracz 1";
        else if (p1.getResult().getValueOfRank()<p2.getResult().getValueOfRank()) winner = "Gracz 2";
        else {
            if (p1.getResult().getValueOfCards().get(0)>p2.getResult().getValueOfCards().get(0)) winner = "Gracz 1";
            else if (p1.getResult().getValueOfCards().get(0)<p2.getResult().getValueOfCards().get(0)) winner = "Gracz 2";
            else
            {
                if (p1.getResult().getValueOfCards().get(1)>p2.getResult().getValueOfCards().get(1)) winner = "Gracz 1";
                else if (p1.getResult().getValueOfCards().get(1)<p2.getResult().getValueOfCards().get(1)) winner = "Gracz 2";
                else
                {
                    if (p1.getResult().getValueOfCards().get(2)>p2.getResult().getValueOfCards().get(2)) winner = "Gracz 1";
                    else if (p1.getResult().getValueOfCards().get(2)<p2.getResult().getValueOfCards().get(2)) winner = "Gracz 2";
                    else
                    {
                        if (p1.getResult().getValueOfCards().get(3)>p2.getResult().getValueOfCards().get(3)) winner = "Gracz 1";
                        else if (p1.getResult().getValueOfCards().get(3)<p2.getResult().getValueOfCards().get(3)) winner = "Gracz 2";
                        else
                        {
                            if (p1.getResult().getValueOfCards().get(4)>p2.getResult().getValueOfCards().get(4)) winner = "Gracz 1";
                            else winner = "Gracz 2";
                        }
                    }
                }
            }
        }
        return winner;

    }

}



