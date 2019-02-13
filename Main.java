package com.company;

public class Main {
    public static  void main(String[]args) {

        System.out.print(Hostel.work_day);
        Hostel hostel_1 = new Hostel();
        Hostel hostel_2 = new Hostel(1324, "Mountain", 22, "st.Shevchenko 46");
        Hostel hostel_3 = new Hostel(125237, "Lviv", 1704, "st.Bandera 23",
                4, 424, "middle");

        System.out.print("\n" + hostel_1.toString());
        System.out.print("\n" + hostel_2.toString());
        System.out.print("\n" + hostel_3.toString());

        Hostel.printStaticwork_day();
        }
    }

