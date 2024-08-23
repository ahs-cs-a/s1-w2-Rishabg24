public class BodyOfWater{
private String name;
private int largestDiameter;
private int avgDepth;
private boolean isSaltWater;

public BodyOfWater(String n, int ld, int ad, boolean sw){

    name = n;
    largestDiameter = ld;
    avgDepth = ad;
    isSaltWater = sw;

}

public BodyOfWater(String n, int ad){

  this(n,500,0,false); /*  note that even if we have these 4 parameters for the two parameter constrcutor and objects, 
  we manually set two variables to defaults, which the constructor would have done anyway*/

}


public void setName(String n){
    name = n;
    
}

public void setDiameter(int ld){
    largestDiameter = ld;
}

public String getName(){
    return name;
}

public int getLargestDepth(){
    return largestDiameter;
}

public int getavgDepth(){
    return avgDepth;
}

public boolean getisSaltWater(){
    return isSaltWater;
}





}
