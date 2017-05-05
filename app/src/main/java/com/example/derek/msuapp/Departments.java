package com.example.derek.msuapp;

/**
 * Created by Derek on 5/2/2017.
 */

public class Departments
{
    private String name;
    private String dept_url;

    public static final Departments[] departments={
            new Departments("Accounting", "http://www.missouristate.edu/SOA/"),
            new Departments("Agribusiness", "http://ag.missouristate.edu/AAEC/"),
            new Departments("Agriculture", "http://ag.missouristate.edu/"),
            new Departments("Animal Science", "http://ag.missouristate.edu/AS/"),
            new Departments("Art and Design", "http://art.missouristate.edu/"),
            new Departments("Biology", "http://biology.missouristate.edu/"),
            new Departments("Biomedical Sciences", "http://biology.missouristate.edu/"),
            new Departments("Chemistry", "http://chemistry.missouristate.edu/"),
            new Departments("Childhood Education", "http://education.missouristate.edu/cefs/"),
            new Departments("Communication Sciences and Disorders", "http://www.missouristate.edu/CSD/"),
            new Departments("Communication", "http://communication.missouristate.edu/"),
            new Departments("Computer Information Systems", "http://cis.missouristate.edu/"),
            new Departments("Computer Science", "http://computerscience.missouristate.edu/"),
            new Departments("Counseling, Leadership, and Special Education", "http://education.missouristate.edu/clse/"),
            new Departments("Criminology and Criminal Justice", "http://criminology.missouristate.edu/"),
            new Departments("Defense and Strategic Studies", "http://dss.missouristate.edu/"),
            new Departments("Economics", "http://www.missouristate.edu/econ/"),
            new Departments("English", "http://english.missouristate.edu/"),
            new Departments("Finance and General Business", "http://www.missouristate.edu/fgb/"),
            new Departments("Geography, Geology, and Planning", "http://geosciences.missouristate.edu/"),
            new Departments("History", "http://history.missouristate.edu/"),
            new Departments("Honors College", "http://www.missouristate.edu/honors/"),
            new Departments("Hospitality Leadership", "http://hospitality.missouristate.edu/"),
            new Departments("Kinesiology", "http://www.missouristate.edu/kinesiology/"),
            new Departments("Libraries", "http://libraries.missouristate.edu/"),
            new Departments("Management", "http://mgt.missouristate.edu/"),
            new Departments("Marketing", "http://www.missouristate.edu/mkt/"),
            new Departments("Mathematics", "http://math.missouristate.edu/"),
            new Departments("Media, Journalism, and Film", "http://mjf.missouristate.edu/"),
            new Departments("Merchandising and Fashion Design", "http://www.missouristate.edu/mfd/"),
            new Departments("Military Science", "http://www.missouristate.edu/milsci/"),
            new Departments("Modern and Classical Languages", "http://www.missouristate.edu/MCL/"),
            new Departments("Music", "http://www.missouristate.edu/music/"),
            new Departments("Natural and Applied Sciences", "http://science.missouristate.edu/mnas/"),
            new Departments("Nursing", "http://www.missouristate.edu/nursing/"),
            new Departments("Philosophy", "http://philosophy.missouristate.edu/"),
            new Departments("Physical Therapy", "http://www.missouristate.edu/PhysicalTherapy/"),
            new Departments("Physician Assistant Studies", "http://www.missouristate.edu/pas/"),
            new Departments("Physics, Astronomy, and Material Sciences", "http://physics.missouristate.edu/"),
            new Departments("Political Science", "http://politicalscience.missouristate.edu/"),
            new Departments("Provost", "http://www.missouristate.edu/provost/"),
            new Departments("Psychology", "http://psychology.missouristate.edu/"),
            new Departments("Reading, Foundations, and Technology", "http://education.missouristate.edu/rft/"),
            new Departments("Religion", "http://www.missouristate.edu/relst/"),
            new Departments("Social Work", "http://www.missouristate.edu/swk/"),
            new Departments("Sociology and Anthropology", "http://soc-ant.missouristate.edu/"),
            new Departments("Sports Medicine and Athletic Training", "http://sportsmed.missouristate.edu/"),
            new Departments("Technology and Construction Management", "http://build.missouristate.edu/"),
            new Departments("Theatre and Dance", "http://theatreanddance.missouristate.edu/"),
            new Departments("Writing in College, Career, and Community", "http://cwccc.missouristate.edu/")
    };

    private Departments(String name, String dept_url)
    {
        this.name = name;
        this.dept_url = dept_url;
    }

    // Accessor methods
    public String getName() { return name; }

    public String getDept_url() { return dept_url; }

    public String toString() { return this.name; }

}