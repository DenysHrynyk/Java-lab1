package com.company;

public class Main {
    public static  void main(String[]args) {

        System.out.print(Hostel.workDay);
        Hostel hostelStar = new Hostel();
        Hostel hostelMountain = new Hostel(1324, "Mountain", 22, "st.Shevchenko 46");
        Hostel hostelLviv = new Hostel(125237, "Lviv", 1704, "st.Bandera 23",
                4, 424, "middle");

        System.out.print("\n" + hostelStar.toString());
        System.out.print("\n" + hostelMountain.toString());
        System.out.print("\n" + hostelLviv.toString());

        Hostel.printStaticWorkDay();
        }
    }
