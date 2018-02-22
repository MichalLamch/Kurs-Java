
public class Card implements Comparable<Card>{
    private char name;
    private String colour;
    private int valueOfCard;
    private String str;
    Card(){

    };
    public void setCard(String t)
    {
        this.name = t.charAt(0);
        this.colour = t.charAt(1)+"";
    }
    public char getName()
    {
        return name;
    }
    public String getColour()
    {
        return colour;
    }
    public void setValueOfCard(int value)
    {
        valueOfCard = value;
    }
    public int getValueOfCard()
    {
        return valueOfCard;
    }
    public void printCard(){
        System.out.print( valueOfCard + colour + " ");
    }

    @Override
    public int compareTo(Card o) {
        if(this.valueOfCard>=o.valueOfCard) return -1;
        else return 1;
    }
}
