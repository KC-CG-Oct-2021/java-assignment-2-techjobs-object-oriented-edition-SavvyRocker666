package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {
        return "\n OOPS! This job does not seem to exist. \n";
}
//    private int id;
//    private static int nextId = 1;
//
//    private String name;
//    private Employer employer;
//    private Location location;
//    private PositionType positionType;
//    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    value =String.format("\n +"+
            "ID: %s\n"+
            "Name: %s\n"+
            "Employer: %s\n"+
            "Location: %s\n"+
            "Position Type: %s\n"+
            "Core Competency: %s\n",
    id ==0?DEFAULT_MESSAGE :id,

    getValueFromField(name),

    getValueFromField(employer),

    getValueFromField(location),

    getValueFromField(positionType),

    getValueFromField(coreCompetency));
return vaule;
            }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
public String getValueFromField(JobField field){
        if(field == null || field.getValue() == "" ) field.setValue(DEFAULT_MESSAGE);
        return field.getValue();
        }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
public String getValueFromField(String name){
        if(name == null || name == "") name = DEFAULT_MESSAGE;
        return name;
        }
        }
}
