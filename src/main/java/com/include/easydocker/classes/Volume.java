package com.include.easydocker.classes;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Volume {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String properties;

    @ManyToOne
    private Template template;

    @ManyToMany
    private List<Service> services;

    public Volume() {
    }

    public Volume(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return id == volume.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
