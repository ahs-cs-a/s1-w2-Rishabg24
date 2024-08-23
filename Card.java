public class Card {
    private int suit;
    private int rank;




    public Card(int suit, int rank){
        this.suit = suit; // to differentiate the instance variable and the local varable sitting up top
        this.rank = rank;

    }

    public Card(){
        this(3,13); // Basically calling the constructor up above, so that we don't have to retype this.suit and this.rank. 
    }


    public void setSuit(int suit){
        this.suit = suit;
;
    }

    public void setRank(int rank){
        this.rank = rank;
    }

    public int getSuit(){
        return suit;
    }

    public int getRank(){
        return rank;
    }



}
