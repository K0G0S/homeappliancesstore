public class WashingMachine {

    private int height;
    private int width;
    private int depth;
    private String manufacturer;
    private String name;
    private String type;
    private int powerSupply;
    private boolean hasPause;
    private int capacity;
    private int turnsPerSecond;
    private String[] temperatures;
    private int waterSupply;
    private boolean hasLockForChildren;

    private static int timesCreated;

    /**
     * default constructor
     */
    public WashingMachine()
    {
        timesCreated++;
        periodicMantainance();
    }
    /**
     * recommended constructor
     */
    public WashingMachine(int height,int width,int depth,String manufacturer,String name,String type,int powerSupply,
                          boolean hasPause, int capacity,int turnsPerSecond,String[] temperatures,int waterSupply,boolean hasLockForChildren)
    {
        timesCreated++;

        setHeight(height);
        setWidth(width);
        setDepth(depth);
        setManufacturer(manufacturer);
        setName(name);
        setType(type);
        setPowerSupply(powerSupply);

        setPause(hasPause);
        setCapacity(capacity);
        setTurnsPerSecond(turnsPerSecond);
        setTemperatures(temperatures);
        setWaterSupply(waterSupply);
        setLockForChildren(hasLockForChildren);

    }
    /**
     * get how many times it was created
     */
    public static int getTimesCreated()
    {
        return timesCreated;
    }
    /**
     * overloading feature
     */
    private void periodicMantainance()
    {

    }
    private void periodicMantainance(int overloaded)
    {

    }
    /**
     * shows all fields of the washing machine class
     */
    public void showAll()
    {
        System.out.println("--Washing Machine--");

        System.out.printf("Height: %d\n",this.height);
        System.out.printf("Width: %d\n",this.width);
        System.out.printf("Depth: %d\n",this.depth);
        System.out.printf("Manufacturer: %s\n",this.manufacturer);
        System.out.printf("Name: %s\n",this.name);
        System.out.printf("Type: %s\n",this.type);
        System.out.printf("Power Supply: %d\n",this.powerSupply);

        System.out.printf("Has Pause: %b\n",this.hasPause);
        System.out.printf("Capacity: %d\n",this.capacity);
        System.out.printf("Turns Per Second: %d\n",this.turnsPerSecond);
        System.out.printf("Temperatures: %s\n",this.temperatures);
        System.out.printf("Watter Supply: %s\n",this.waterSupply);
        System.out.printf("Has Lock For Children: %s\n",this.hasLockForChildren);
        System.out.printf("Times Created: %d\n",timesCreated);


    }

    /**
     * gets and sets height
     */
    public int getHeight()
    {
        return this.height;
    }
    public void setHeight(int height)
    {
        this.height = height;
    }

    /**
     * gets and sets width
     */
    public int getWidth()
    {
        return this.width;
    }
    public void setWidth(int width)
    {
        this.width = width;
    }

    /**
     * gets and sets depth
     */
    public int getDepth()
    {
        return this.depth;
    }
    public void setDepth(int depth)
    {
        this.depth = depth;
    }

    /**
     * gets and sets manufacturer
     */
    public String getManufacturer()
    {
        return this.manufacturer;
    }
    public void setManufacturer(String manufacturer)
    {
        this.manufacturer=manufacturer;
    }

    /**
     * gets and sets name
     */
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    /**
     * gets and sets type
     */
    public String getType()
    {
        return this.type;
    }
    public void setType(String type)
    {
        this.type=type;
    }

    /**
     * gets and sets power supply
     */
    public int getPowerSupply()
    {
        return this.powerSupply;
    }
    public void setPowerSupply(int powerSupply)
    {
        this.powerSupply = powerSupply;
    }



    //exclusive
    /**
     * gets and sets pause
     */
    public boolean HasPause() {
        return hasPause;
    }
    public void setPause(boolean hasPause) {
        this.hasPause = hasPause;
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
     * gets and sets turns per second
     */
    public int getTurnsPerSecond() {
        return turnsPerSecond;
    }
    public void setTurnsPerSecond(int turnsPerSecond) {
        this.turnsPerSecond = turnsPerSecond;
    }

    /**
     * gets and sets the temperatures
     */
    public String[] getTemperatures() {
        return temperatures;
    }
    public void setTemperatures(String[] temperatures) {
        this.temperatures = temperatures;
    }

    /**
     * gets and sets the water supply
     */
    public int getWaterSupply() {
        return waterSupply;
    }
    public void setWaterSupply(int waterSupply) {
        this.waterSupply = waterSupply;
    }

    /**
     * gets and sets if it has lock for children
     */
    public boolean HasLockForChildren() {
        return hasLockForChildren;
    }
    public void setLockForChildren(boolean hasLockForChildren) {
        this.hasLockForChildren = hasLockForChildren;
    }
}