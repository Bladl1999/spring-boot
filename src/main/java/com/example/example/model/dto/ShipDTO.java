package com.example.example.model.dto;

public class ShipDTO{
    Long id;
    String name;
    String country;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}

/*
public enum ShipDTO {;
    private interface Id { Long getId(); }
    private interface Name { String getName(); }
    private interface Country { String getCountry(); }
    private interface Port { Port getPort(); }
    private interface Document { String getDocument();}


    public enum Request{;
        public static class Create implements Name, Country, Port, Document{
            String name;
            String country;
            Port port;
            String document;
        }
    }

    public enum Response{;
        public static class Public implements Id, Name, Country, Port{
            Long id;
            String name;
            String country;
            Port port;
        }

        public static class Private implements Id, Name, Country, Port, Document {
            Long id;
            String name;
            String country;
            Port port;
            String document;
        }
    }
}
 */