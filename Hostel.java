package com.company;

public class Hostel {
    public int custemersForYear;
    public String nameHostel;
    public int numbersInHostel;
    private String locationOfHostel;
    private int qualityHostel;
    protected int staffInHostel;
    protected String priceForNumbers;
    public static int work_day = 16;


    Hostel(){
    }

    Hostel(int custemersForYear, String nameHostel, int numbersInHostel, String locationOfHostel ){

        this.custemersForYear = custemersForYear;
        this.locationOfHostel = locationOfHostel;
        this.nameHostel = nameHostel;
        this.numbersInHostel = numbersInHostel;
    }

    Hostel(int custemers, String nameHostel, int numbersInHostel,
           String location, int qualityHostel, int staffInHostel, String price){
        this(custemers, nameHostel, numbersInHostel, location);
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
    public void getcustemersForYear(int custemersForYear) {
      this.custemersForYear = custemersForYear;
    }

    public int setcustomers(){

        return custemersForYear;
    }

    public void getname(String name){

        this.nameHostel = nameHostel;
    }

    public static void printStaticwork_day(){
        System.out.println(work_day);
    }

    public void printwork_day() {
        System.out.println(work_day);
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



