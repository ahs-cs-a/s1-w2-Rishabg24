public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("Michigan", 1300, 500, false);
        BodyOfWater b1 = new BodyOfWater("Salt Lake", 800);

       

        System.out.println(b1.getName());
        System.out.println(b1.getavgDepth());
        System.out.println(b.getName());
        System.out.println(b.getLargestDepth());
        System.out.println(b.getavgDepth());
        System.out.println(b.getisSaltWater());

        b1.setName("eerie");
        b1.setDiameter(700); 
        
        System.out.println(b1.getName());
        System.out.println(b1.getavgDepth());
    }
}
