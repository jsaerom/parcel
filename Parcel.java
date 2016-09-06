class Parcel{
  public int mHeight;
  public int mWidth;
  public int mLength;
  public int mWeight;

  public Parcel(int height, int width, int length, int weight){
    mHeight = height;
    mWidth = width;
    mLength = length;
    mWeight = weight;
  }

  public int Volume(){
    return (mHeight * mWidth * mLength);
  }

  public int costToShip(String speed, String domestic) {
    int totalCost = 0;
    if (speed.equals("overnight")) {
      totalCost += 5;
    } else {
      totalCost += 2;
    }
    if (domestic.equals("Yes")) {
      totalCost += 1;
    } else {
      totalCost += 3;
    }
    totalCost += ((mWeight)/2);
    return totalCost;
  }
}
