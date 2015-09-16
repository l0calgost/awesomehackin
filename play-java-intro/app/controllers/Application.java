package controllers;

import com.avaje.ebean.Model;
import models.Person;
import play.*;
import play.data.Form;
import play.libs.Json;
import play.mvc.*;

import views.html.*;

import java.util.List;

public class Application extends Controller {

    public Result index() {

        return ok(index.render("Your new application is ready."));
    }

    public Result addPerson() {
        Person person = Form.form(Person.class).bindFromRequest().get();
        person.save();
        return redirect(routes.Application.index());
    }

    public Result getPersons() {
        List<Person> persons = new Model.Finder<String, Person>(Person.class).all();
        return ok(Json.toJson(persons));

    }
}
