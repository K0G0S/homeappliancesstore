public class Oven {

    private int height;
    private int width;
    private int depth;
    private String manufacturer;
    private String name;
    private String type;
    private int powerSupply;
    private int capacity;
    private boolean isDigital;
    private boolean hasCleaningSystem;
    private boolean isCeramic;
    private boolean hasGrill;

    private static int timesCreated;
    /**
     * default constructor
     */
    public Oven()
    {
        timesCreated++;
        periodicMantainance();
    }
    /**
     * recommended constructor
     */
    public Oven(int height,int width,int depth,String manufacturer,String name,String type,int powerSupply,
                int capacity,boolean isDigital,boolean hasCleaningSystem,boolean isCeramic,boolean hasGrill)
    {
        timesCreated++;

        setHeight(height);
        setWidth(width);
        setDepth(depth);
        setManufacturer(manufacturer);
        setName(name);
        setType(type);
        setPowerSupply(powerSupply);

        setCapacity(capacity);
        setDigital(isDigital);
        setCleaningSystem(hasCleaningSystem);
        setCeramic(isCeramic);
        setGrill(hasGrill);


    }
    /**
     * gets how many times the object has been created
     */
    public static int getTimesCreated()
    {
        return timesCreated;
    }
    /**
     * showcase for the overloading feature
     */
    private void periodicMantainance()
    {

    }
    private void periodicMantainance(int overloaded)
    {

    }
    /**
     * prints all the features of the oven
     */
    public void showAll()
    {
        System.out.println("--Oven--");

        System.out.printf("Height: %d\n",this.height);
        System.out.printf("Width: %d\n",this.width);
        System.out.printf("Depth: %d\n",this.depth);
        System.out.printf("Manufacturer: %s\n",this.manufacturer);
        System.out.printf("Name: %s\n",this.name);
        System.out.printf("Type: %s\n",this.type);
        System.out.printf("Power Supply: %d\n",this.powerSupply);

        System.out.printf("Capacity: %d\n",this.capacity);
        System.out.printf("Is Digital: %b\n",this.isDigital);
        System.out.printf("Has Cleaning System: %b\n",this.hasCleaningSystem);
        System.out.printf("Is Ceramic: %b\n",this.isCeramic);
        System.out.printf("Has Grill: %b\n",this.hasGrill);
        System.out.printf("Items Created: %d\n",timesCreated);
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
     * gets and sets capacity
     */
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    /**
     * gets and sets if its digital
     */
    public boolean isDigital() {
        return isDigital;
    }
    public void setDigital(boolean digital) {
        isDigital = digital;
    }
    /**
     * gets and sets the cleaning system
     */
    public boolean HasCleaningSystem() {
        return hasCleaningSystem;
    }
    public void setCleaningSystem(boolean hasCleaningSystem) {
        this.hasCleaningSystem = hasCleaningSystem;
    }
    /**
     * gets and sets the ceramic
     */
    public boolean isCeramic() {
        return isCeramic;
    }
    public void setCeramic(boolean ceramic) {
        isCeramic = ceramic;
    }
    /**
     * gets and sets grill
     */
    public boolean hasGrill() {
        return hasGrill;
    }
    public void setGrill(boolean hasGrill) {
        this.hasGrill = hasGrill;
    }
}