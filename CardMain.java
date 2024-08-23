public class CardMain {
    public static void main(String[] args) {
        Card clubs = new Card();
        Card jack = new Card();
        Card spades = new Card();

        clubs.setRank(2);
        clubs.setSuit(0);

        jack.setRank(11);
        jack.setSuit(1);

        spades.setRank(10);
        spades.setSuit(2);

        System.out.println(clubs.getRank());
        System.out.println(clubs.getSuit());
        System.out.println(jack.getRank());
        System.out.println(jack.getSuit());
        System.out.println(spades.getRank());
        System.out.println(spades.getSuit());


       





        
    }
}
