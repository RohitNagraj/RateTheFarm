package com.example.msrit.ratethefarm;

public class UserData {

    private int UserID;

    private String Name;
    private String Village;
    private String Hobli;
    private String Taluq;
    private int Age;

    private int MaleWorkers;
    private int FemaleWorkers;

    private double Land;
    private String IrrigatedOrRainfed;

    private int Cow;
    private int Buffalo;
    private int Cock;
    private int Hen;
    private int Sheep;
    private int Goat;
    private int OtherAnimals;

    private double MulberryYield;
    private Boolean SellMulberry;

    private Boolean OwnsTractor;
    private Boolean OwnsPowerTiller;
    private Boolean OwnsPlougher;
    private Boolean OwnsRotomator;
    private Boolean OwnsBullockCart;
    private Boolean OwnsSprayer;
    private Boolean OwnsSprinkler;

    private String CropName;
    private double CropArea;
    private double CropYield;

    private Boolean OnlineSale;
    private Boolean ScientificSuggestions;
    private Boolean OwnsNursery;

    private Boolean SalesLocal;
    private Boolean SalesAPMC;

    //To be calculated
    private int totalAnimals;
    private double yieldPerHectre;
    private double rating;

    private double consumerRating;
    private int noOfConsumers;


    public UserData() {
        Name = null;
        Village = null;
        Hobli = null;
        Taluq = null;
        Age = 0;
        MaleWorkers = 0;
        FemaleWorkers = 0;
        Land = 0.0;
        IrrigatedOrRainfed = null;
        Cow = 0;
        Buffalo = 0;
        Cock= 0;
        Hen = 0;
        Sheep = 0;
        Goat = 0;
        OtherAnimals = 0;
        MulberryYield = 0.0;
        SellMulberry = false;
        OwnsTractor = false;
        OwnsPowerTiller = false;
        OwnsPlougher = false;
        OwnsRotomator = false;
        OwnsBullockCart = false;
        OwnsSprayer = false;
        OwnsSprinkler = false;
        CropName = null;
        CropArea = 0.0;
        CropYield = 0.0;
        OnlineSale = false;
        ScientificSuggestions = false;
        OwnsNursery = false;
        SalesLocal = false;
        SalesAPMC = false;
        totalAnimals = 0;
        yieldPerHectre = 0.0;
        rating = 0.0;
        consumerRating = 0;
        noOfConsumers = 0;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getVillage() {
        return Village;
    }

    public void setVillage(String village) {
        Village = village;
    }

    public String getHobli() {
        return Hobli;
    }

    public void setHobli(String hobli) {
        Hobli = hobli;
    }

    public String getTaluq() {
        return Taluq;
    }

    public void setTaluq(String taluq) {
        Taluq = taluq;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getMaleWorkers() {
        return MaleWorkers;
    }

    public void setMaleWorkers(int maleWorkers) {
        MaleWorkers = maleWorkers;
    }

    public int getFemaleWorkers() {
        return FemaleWorkers;
    }

    public void setFemaleWorkers(int femaleWorkers) {
        FemaleWorkers = femaleWorkers;
    }

    public double getLand() {
        return Land;
    }

    public void setLand(double land) {
        Land = land;
    }

    public String getIrrigatedOrRainfed() {
        return IrrigatedOrRainfed;
    }

    public void setIrrigatedOrRainfed(String irrigatedOrRainfed) {
        IrrigatedOrRainfed = irrigatedOrRainfed;
    }

    public int getCow() {
        return Cow;
    }

    public void setCow(int cow) {
        Cow = cow;
    }

    public int getBuffalo() {
        return Buffalo;
    }

    public void setBuffalo(int buffalo) {
        Buffalo = buffalo;
    }

    public int getCock() {
        return Cock;
    }

    public void setCock(int cock) {
        Cock = cock;
    }

    public int getHen() {
        return Hen;
    }

    public void setHen(int hen) {
        Hen = hen;
    }

    public int getSheep() {
        return Sheep;
    }

    public void setSheep(int sheep) {
        Sheep = sheep;
    }

    public int getGoat() {
        return Goat;
    }

    public void setGoat(int goat) {
        Goat = goat;
    }

    public int getOtherAnimals() {
        return OtherAnimals;
    }

    public void setOtherAnimals(int otherAnimals) {
        OtherAnimals = otherAnimals;
    }

    public double getMulberryYield() {
        return MulberryYield;
    }

    public void setMulberryYield(double mulberryYield) {
        MulberryYield = mulberryYield;
    }

    public Boolean getSellMulberry() {
        return SellMulberry;
    }

    public void setSellMulberry(Boolean sellMulberry) {
        SellMulberry = sellMulberry;
    }

    public Boolean getOwnsTractor() {
        return OwnsTractor;
    }

    public void setOwnsTractor(Boolean ownsTractor) {
        OwnsTractor = ownsTractor;
    }

    public Boolean getOwnsPowerTiller() {
        return OwnsPowerTiller;
    }

    public void setOwnsPowerTiller(Boolean ownsPowerTiller) {
        OwnsPowerTiller = ownsPowerTiller;
    }

    public Boolean getOwnsPlougher() {
        return OwnsPlougher;
    }

    public void setOwnsPlougher(Boolean ownsPlougher) {
        OwnsPlougher = ownsPlougher;
    }

    public Boolean getOwnsRotomator() {
        return OwnsRotomator;
    }

    public void setOwnsRotomator(Boolean ownsRotomator) {
        OwnsRotomator = ownsRotomator;
    }

    public Boolean getOwnsBullockCart() {
        return OwnsBullockCart;
    }

    public void setOwnsBullockCart(Boolean ownsBullockCart) {
        OwnsBullockCart = ownsBullockCart;
    }

    public Boolean getOwnsSprayer() {
        return OwnsSprayer;
    }

    public void setOwnsSprayer(Boolean ownsSprayer) {
        OwnsSprayer = ownsSprayer;
    }

    public Boolean getOwnsSprinkler() {
        return OwnsSprinkler;
    }

    public void setOwnsSprinkler(Boolean ownsSprinkler) {
        OwnsSprinkler = ownsSprinkler;
    }

    public String getCropName() {
        return CropName;
    }

    public void setCropName(String cropName) {
        CropName = cropName;
    }

    public double getCropArea() {
        return CropArea;
    }

    public void setCropArea(double cropArea) {
        CropArea = cropArea;
    }

    public double getCropYield() {
        return CropYield;
    }

    public void setCropYield(double cropYield) {
        CropYield = cropYield;
    }

    public Boolean getOnlineSale() {
        return OnlineSale;
    }

    public void setOnlineSale(Boolean onlineSale) {
        OnlineSale = onlineSale;
    }

    public Boolean getScientificSuggestions() {
        return ScientificSuggestions;
    }

    public void setScientificSuggestions(Boolean scientificSuggestions) {
        ScientificSuggestions = scientificSuggestions;
    }

    public Boolean getOwnsNursery() {
        return OwnsNursery;
    }

    public void setOwnsNursery(Boolean ownsNursery) {
        OwnsNursery = ownsNursery;
    }

    public Boolean getSalesLocal() {
        return SalesLocal;
    }

    public void setSalesLocal(Boolean salesLocal) {
        SalesLocal = salesLocal;
    }

    public Boolean getSalesAPMC() {
        return SalesAPMC;
    }

    public void setSalesAPMC(Boolean salesAPMC) {
        SalesAPMC = salesAPMC;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }


    public int getTotalAnimals() {
        return totalAnimals;
    }


    public double getYieldPerHectre() {
        return yieldPerHectre;
    }


    public double getRating() {
        return rating;
    }

    /*public int getCheck() {
        return Check;
    }

    public void setCheck(int check) {
        Check = check;
    }*/

    public void setTotalAnimals () {
        totalAnimals = Cock + Cow + Goat + Hen + Buffalo + Sheep + OtherAnimals;
    }

    public void setCalculatedValues() {

        int ir=0,cowbuf=0, goatrate=0, cockrate=0, sheeprate=0, mulrate=0, machinerate=0, onrate=0, nurseryrate=0;

        int scirate=0, salerate=0, landrate=0, croprate=0, yeildrate=0, totalrate=50;

        if(MaleWorkers>=3)
            MaleWorkers=4;

        if(FemaleWorkers>=3)
            FemaleWorkers=4;

        if(IrrigatedOrRainfed.equals("Irrigated")) {
            ir = 7;
            totalrate = 52;
        }

        else if(IrrigatedOrRainfed.equals("Rainfed"))
        {
            ir=5;
            totalrate = 50;
        }


        if(Cow+Buffalo>5)
            cowbuf=5;

        else
            cowbuf= Cow + Buffalo;

        if(Goat>2)
            goatrate=5;

        else
            goatrate=Goat*2;

        if(Sheep>2)
            sheeprate=5;

        else
            sheeprate=Sheep*2;

        if(Cock>2)
            cockrate=5;

        else
            cockrate=Cock*2;
        if(SellMulberry)
        {
            if(MulberryYield>1089)
            {
                mulrate=5;
            }
            else{
                mulrate = 3;
            }
        }
        else {
            mulrate = 0;
        }
        if(OwnsBullockCart)
        {
            machinerate++;
        }
        if(OwnsPlougher)
        {
            machinerate++;
        }
        if(OwnsPowerTiller)
        {
            machinerate++;
        }
        if(OwnsRotomator)
        {
            machinerate++;
        }
        if(OwnsSprayer)
        {
            machinerate++;
        }
        if(OwnsSprinkler)
        {
            machinerate++;
        }
        if(OwnsTractor)
        {
            machinerate++;
        }
        if(machinerate>=5)
            machinerate=5;
        if(OnlineSale)
        {
            onrate=5;
        }
        if(OwnsNursery)
        {
            nurseryrate=5;
        }
        if(ScientificSuggestions)
        {
            scirate=5;
        }
        if(SalesAPMC && SalesLocal)
        {
            salerate=5;
        }
        else if(SalesLocal && SalesAPMC)
        {
            salerate=3;
        }
        else if(SalesAPMC && SalesLocal)
        {
            salerate=4;
        }
        if(Land<=80)
            landrate=2;
        else if(Land>80 && Land<160)
            landrate=3;
        else
            landrate=5;
        if(CropYield>=100)
            croprate=5;
        else if(CropYield>80 && CropYield<100)
            croprate=4;
        else if(CropYield>60 && CropYield<80)
            croprate=3;
        else
            croprate=2;
        yieldPerHectre = croprate / landrate;
        if(yieldPerHectre>1)
            yeildrate=5;
        else if(yieldPerHectre==1)
            yeildrate=4;
        else if(yieldPerHectre>0.5)
            yeildrate=3;
        else
            yeildrate=2;
        rating = (MaleWorkers*10)+(FemaleWorkers*6)+(landrate*ir)+(croprate*4)+(yeildrate*8);
        rating += (cowbuf*4)+(goatrate*2)+(sheeprate*2)+(Hen*4)+(cockrate*2)+(0.5*OtherAnimals);
        rating += (mulrate*4) +(machinerate*2)+ (nurseryrate*0.5) + onrate + scirate + (salerate*2);

        rating= rating / totalrate;
        rating*=2;
        

        totalAnimals = Cock + Cow + Goat + Hen + Buffalo + Sheep + OtherAnimals;


    }


    public void setConsumerRating(float value){

        double val = (double)value;
        if(noOfConsumers == 0){
            val*=2.0;
            consumerRating = val;
            noOfConsumers++;
        }
        else{
            val*=2.0;
            //consumerRating = ((consumerRating*noOfConsumers) + val)/(noOfConsumers+1);
            consumerRating = (consumerRating+val)/2;
            noOfConsumers++;
        }
        double remainder = noOfConsumers+10;
        double weight = noOfConsumers/remainder;

        rating = ( (rating*(1-weight)) + (consumerRating*weight) );
    }
    public double getConsumerRating() {
        return consumerRating;
    }

    public int getNoOfConsumers() {
        return noOfConsumers;
    }

    public void setNoOfConsumers(int noOfConsumers) {
        this.noOfConsumers = noOfConsumers;
    }
}