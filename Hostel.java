package com.company;

public class Hostel {
    private int custemersForYear;
    private String nameHostel;
    private int numbersInHostel;
    private String locationOfHostel;
    private int qualityHostel;
    protected int staffInHostel;
    protected String priceForNumbers;
    public static int workDay = 16;

    public Hostel(){
        this(0, " null", 0, "null",
        0,0,"null");
    }

    public Hostel(int custemersForYear, String nameHostel, int numbersInHostel, String locationOfHostel ) {

        this(1242, "Lviv",122,"st.Bandera", 0,0,"null");
    }

    public Hostel(int custemersForYear, String nameHostel, int numbersInHostel,
           String locationOfHostel, int qualityHostel, int staffInHostel, String priceForNumbers){

        this.custemersForYear = custemersForYear;
        this.nameHostel = nameHostel;
        this.numbersInHostel = numbersInHostel;
        this.locationOfHostel = locationOfHostel;
        this.qualityHostel = qualityHostel;
        this.staffInHostel = staffInHostel;
        this.priceForNumbers = priceForNumbers;
    }



    public String toString(){
        String information = "Number visitors in hotel for a year " + custemersForYear +
                "\n" + "The name Hotels " + nameHostel +
                "\n" + "Number of rooms in the hotel " + numbersInHostel +
                "\n" + "Location of the hotel " + locationOfHostel +
                "\n" + "How many hotels have star " + qualityHostel +
                "\n" + "Number of staff " + staffInHostel +
                "\n" + "How many cost rooms in hotels " + priceForNumbers + "\n";
                return information;
    }
    public void getCustemersForYear(int custemersForYear) {
      this.custemersForYear = custemersForYear;
    }

    public int setCustomers(){

        return custemersForYear;
    }

    public void getName(String name){

        this.nameHostel = nameHostel;
    }

    public static int printStaticWorkDay(){
        return workDay;
    }

    public void printWorkDay() {
        System.out.println(workDay);
    }

    public void resetValues(int custemersForYear, String nameHostel, int numbersInHostel, String locationOfHostel, int qualityHostel,
                            int  staffInHostel, String priceForNumbers) {
        this.custemersForYear = custemersForYear;
        this.qualityHostel = qualityHostel;
        this.nameHostel = nameHostel;
        this.numbersInHostel = numbersInHostel;
        this.locationOfHostel = locationOfHostel;
        this.staffInHostel = staffInHostel;
        this.priceForNumbers =priceForNumbers;
    }
}






