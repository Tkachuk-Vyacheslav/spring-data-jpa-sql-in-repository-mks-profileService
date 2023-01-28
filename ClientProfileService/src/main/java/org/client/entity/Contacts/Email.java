package org.client.entity.Contacts;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.client.entity.ContactMedium;

import javax.persistence.*;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String uuid;

    @ManyToOne (optional=false, cascade=CascadeType.ALL)
    @JoinColumn (name="emails")
    private ContactMedium contactMedium;

    private String value;

}
