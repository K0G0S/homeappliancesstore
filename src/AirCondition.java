public class AirCondition {

    private int height;
    private int width;
    private int depth;
    private String manufacturer;
    private String name;
    private String type;
    private int powerSupply;
    private int coldPower;
    private int hotPower;
    private boolean hasWifi;
    private boolean hasAirFilter;
    private String coldRank;
    private boolean isInverter;

    private static int timesCreated;

    public AirCondition()
    {
        periodicMantainance();
        timesCreated++;
    }
    /**
     * constructor that recommended to be used for object initialization,must be public
     * @param height sets the height
     * @param width sets the width
     * @param depth sets the depth
     * @param manufacturer sets the manufacturer
     * @param name sets the name
     * @param type sets the type
     * @param powerSupply sets the power supply
     * @param hotPower sets the hot power
     * @param hasWifi sets to see if it has wifi
     * @param hasAirFilter sees if it has air filter
     * @param coldRank sees the rank of the cold
     * @param isInverter sees if its inverted
     * @param coldPower sets the cold power
     */
    public AirCondition(int height,int width,int depth,String manufacturer,String name,String type,int powerSupply,
                        int coldPower,int hotPower,boolean hasWifi,boolean hasAirFilter,String coldRank,boolean isInverter)
    {
        timesCreated++;

        setHeight(height);
        setWidth(width);
        setDepth(depth);
        setManufacturer(manufacturer);
        setName(name);
        setType(type);
        setPowerSupply(powerSupply);

        setColdPower(coldPower);
        setHotPower(hotPower);
        setWifi(hasWifi);
        setAirFilter(hasAirFilter);
        setColdRank(coldRank);
        setInverter(isInverter);
    }
    /**
     * prints in console every field of the class,
     * must be public
     */
    public void showAll()
    {
        System.out.println("--Air Conditioner--");

        System.out.printf("Height: %d\n",this.height);
        System.out.printf("Width: %d\n",this.width);
        System.out.printf("Depth: %d\n",this.depth);
        System.out.printf("Manufacturer: %s\n",this.manufacturer);
        System.out.printf("Name: %s\n",this.name);
        System.out.printf("Type: %s\n",this.type);
        System.out.printf("Power Supply: %d\n",this.powerSupply);

        System.out.printf("Cold Power: %d\n",this.coldPower);
        System.out.printf("Hot Power: %d\n",this.hotPower);
        System.out.printf("Has Wifi: %b\n",this.hasWifi);
        System.out.printf("Has Air Filtering: %b\n",this.hasAirFilter);
        System.out.printf("Cold Ranking: %s\n",this.coldRank);
        System.out.printf("Is Inverter: %b\n",this.isInverter);
        System.out.printf("Times Created: %d\n",timesCreated);

    }
    /**
     * gets how many times an AirCondition was made
     * must be public
     */

    public static int getTimesCreated()
    {
        return timesCreated;
    }


    private void periodicMantainance()
    {

    }
    /**
     * overloads a method
     */
    private void periodicMantainance(int overloaded)
    {

    }

    /**
     * gets and sets height
     *  must be public, but we can change it later maybe to only initialize in constructor
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
     *  must be public
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
     *  must be public
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
     *  must be public
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
     *  must be public
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
     *  must be public
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
     *  must be public
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
     * gets and sets cold power
     *  must be public
     */
    public int getColdPower() {
        return coldPower;
    }
    public void setColdPower(int coldPower) {
        this.coldPower = coldPower;
    }

    /**
     * gets and sets hot power
     *  must be public
     */
    public int getHotPower() {
        return hotPower;
    }

    public void setHotPower(int hotPower) {
        this.hotPower = hotPower;
    }
    /**
     * gets and sets the wifi
     *  must be public
     */
    public boolean HasWifi() {
        return hasWifi;
    }

    public void setWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }
    /**
     * gets and sets air filter
     *  must be public
     */
    public boolean HasAirFilter() {
        return hasAirFilter;
    }

    public void setAirFilter(boolean hasAirFilter) {
        this.hasAirFilter = hasAirFilter;
    }

    /**
     * gets and sets cold rank
     *  must be public
     */
    public String getColdRank() {
        return coldRank;
    }

    public void setColdRank(String coldRank) {
        this.coldRank = coldRank;
    }
    /**
     * gets and sets inverter
     *  must be public
     */
    public boolean isInverter() {
        return isInverter;
    }
    public void setInverter(boolean inverter) {
        isInverter = inverter;
    }
}