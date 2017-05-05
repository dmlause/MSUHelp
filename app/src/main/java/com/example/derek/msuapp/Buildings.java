package com.example.derek.msuapp;

/**
 * Created by Derek on 3/12/2017.
 */

public class Buildings {

    private String name;
    private double latitude;
    private double longitude;

    public static final Buildings[] building={
            new Buildings("Bear Park North", 37.2047325, -93.284189),
            new Buildings("Bear Park South", 37.1975327, -93.284596),
            new Buildings("Blair-Shannon Dinner Hall", 37.2009810,  -93.279607),
            new Buildings("Bookstore", 37.2006819, -93.278073),
            new Buildings("Carrington Hall", 37.1985668, -93.278572),
            new Buildings("Cheek Hall", 37.1993145, -93.276748),
            new Buildings("Craig Hall", 37.1971909, -93.277521),
            new Buildings("Ellis Hall", 37.1978233, -93.276786),
            new Buildings("Football Stadium", 37.1976267, -93.279806),
            new Buildings("Freudenberger House", 37.2001136, -93.279758),
            new Buildings("Garst Dining Center", 37.2034720, -93.279988),
            new Buildings("Glass Hall", 37.1991650, -93.282965),
            new Buildings("Hill Hall", 37.1980070, -93.277660),
            new Buildings("Hutchens House", 37.2031430, -93.279339),
            new Buildings("John Q. Hammons Student Center", 37.2021389, -93.284441),
            new Buildings("JQH Arena", 37.2017544, -93.282708),
            new Buildings("Karls Hall", 37.1973917, -93.278422),
            new Buildings("Kemper Hall", 37.1974088, -93.282998),
            new Buildings("Library", 37.1991564, -93.281276),
            new Buildings("Madison Hall", 37.2006776, -93.276544),
            new Buildings("Plaster Student Union", 37.1999341, -93.278588),
            new Buildings("Pummill Hall", 37.1979472, -93.278652),
            new Buildings("Recreation Center", 37.2009254, -93.281061),
            new Buildings("Siceluff Hall", 37.1991522, -93.277644),
            new Buildings("Strong Hall", 37.1986309, -93.284425),
            new Buildings("Temple Hall", 37.1981865, -93.281657),
            new Buildings("University Hall", 37.2005366, -93.277207),
            new Buildings("Wehr Band Hall", 37.2032370, -93.284073)
    };

    private Buildings(String name, double latitude, double longitude)
    {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Accessor methods
    public String getName(){
        return name;
    }

    public double getLatitude(){
        return latitude;
    }

    public double getLongitude(){
        return longitude;
    }

    public String toString(){ return this.name; }
    // End of accessor methods
}
