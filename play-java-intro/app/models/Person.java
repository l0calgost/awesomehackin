package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * The model.
 */
@Entity
public class Person extends Model {

    @Id
    public String id;

    public String name;
}
