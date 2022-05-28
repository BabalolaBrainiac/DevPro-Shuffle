package com.babalola.Devmix.Developer;

import com.babalola.Devmix.DevType;
import com.babalola.Devmix.Experience;
import com.babalola.Devmix.ITeam;
import jakarta.persistence.*;

@Entity
@Table
public class Developer  {
    @Id
    @SequenceGenerator(
            name = "developer_sequence",
            sequenceName = "developer_sequence",
            allocationSize = 1
    )
            @GeneratedValue(
                    strategy = GenerationType.SEQUENCE,
                    generator = "developer_sequence"
            )


    Long id;
    String firstName;
    String lastName;
    String nickName;
    DevType devType;
    String[] skills;
    Experience experienceLevel;
    public Developer() {
    }

    public Developer(String firstName) {
        this.firstName = firstName;
    }

    public Developer(String firstName, String lastName, String nickName, DevType devType, String[] skills, Experience experienceLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.devType = devType;
        this.skills = skills;
        this.experienceLevel = experienceLevel;
    }

    public Developer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
