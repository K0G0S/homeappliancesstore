public class Fridge {

    private int height;
    private int width;
    private int depth;
    private String manufacturer;
    private String name;
    private String type;
    private int powerSupply;
    private int noiseRate;
    private int capacity;
    private int shelves;
    private String color;
    private boolean hasNoFrost;
    private boolean hasIceExit;

    private static int timesCreated;

    /**
     * default constructor
     */
    public Fridge()
    {
        periodicMantainance();
        timesCreated++;
    }
    /**
     * recommended constructor
     */
    public Fridge(int height,int width,int depth,String manufacturer,String name,String type,int powerSupply,
                  int noiseRate,int capacity,int shelves,String color,boolean hasNoFrost,boolean hasIceExit)
    {
        timesCreated++;

        setHeight(height);
        setWidth(width);
        setDepth(depth);
        setManufacturer(manufacturer);
        setName(name);
        setType(type);
        setPowerSupply(powerSupply);

        setNoiseRate(noiseRate);
        setCapacity(capacity);
        setShelves(shelves);
        setColor(color);
        setNoFrost(hasNoFrost);
        setIceExit(hasIceExit);

    }
    /**
     * gets how many times the object has been created
     */
    public static int getTimesCreated()
    {
        return timesCreated;
    }
    /**
     * just showcasing the overloading feature
     */
    private void periodicMantainance()
    {

    }
    private void periodicMantainance(int overloaded)
    {

    }
    /**
     * prints every field of the class
     */
    public void showAll()
    {
        System.out.println("--Fridge--");

        System.out.printf("Height: %d\n",this.height);
        System.out.printf("Width: %d\n",this.width);
        System.out.printf("Depth: %d\n",this.depth);
        System.out.printf("Manufacturer: %s\n",this.manufacturer);
        System.out.printf("Name: %s\n",this.name);
        System.out.printf("Type: %s\n",this.type);
        System.out.printf("Power Supply: %d\n",this.powerSupply);

        System.out.printf("Noise Rate: %d\n",this.noiseRate);
        System.out.printf("Capacity: %d\n",this.capacity);
        System.out.printf("Shelves: %d\n",this.shelves);
        System.out.printf("Color: %s\n",this.color);
        System.out.printf("Has No Frost: %b\n",this.hasNoFrost);
        System.out.printf("Has Ice Exit: %b\n",this.hasIceExit);
        System.out.printf("Times Created: %d\n",timesCreated);

    }


    /**
     * gets and sets height
     */
    public int getHeight() {
        return this.height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * gets and sets width
     */
    public int getWidth() {
        return this.width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * gets and sets depth
     */
    public int getDepth() {
        return this.depth;
    }
    public void setDepth(int depth) {
        this.depth = depth;
    }

    /**
     * gets and sets manufacturer
     */
    public String getManufacturer() {
        return this.manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * gets and sets name
     */
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    /**
     * gets and sets type
     */
    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }

    /**
     * gets and sets power supply
     */
    public int getPowerSupply() {
        return this.powerSupply;
    }
    public void setPowerSupply(int powerSupply) {
        this.powerSupply = powerSupply;
    }


    //exclusive
    /**
     * gets and sets noise rate
     */
    public int getNoiseRate() {
        return noiseRate;
    }
    public void setNoiseRate(int noiseRate) {
        this.noiseRate = noiseRate;
    }
    /**
     * gets and sets capacity
     */
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    /**
     * gets and sets shelves
     */
    public int getShelves() {
        return shelves;
    }
    public void setShelves(int shelves) {
        this.shelves = shelves;
    }
    /**
     * gets and sets color
     */
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * gets and sets no frost
     */
    public boolean HasNoFrost() {
        return hasNoFrost;
    }
    public void setNoFrost(boolean hasNoFrost) {
        this.hasNoFrost = hasNoFrost;
    }
    /**
     * gets and sets ice exit
     */
    public boolean HasIceExit() {
        return hasIceExit;
    }
    public void setIceExit(boolean hasIceExit) {
        this.hasIceExit = hasIceExit;
    }
}