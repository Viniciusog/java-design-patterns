package org.viniciusog.patterns.creationalPatterns.prototype.functionalCloneBuilder;

public class Address implements Cloneable {

    private final String country;
    private final String state;
    private final String city;

    private Address(String country, String state, String city) {
        super();
        this.country = country;
        this.state = state;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static class Builder {
        private String country;
        private String state;
        private String city;

        public Builder() {

        }

        public Builder(String country, String state, String city) {
            this.country = country;
            this.state = state;
            this.city = city;
        }

        public Builder withCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder withState(String state) {
            this.state = state;
            return this;
        }

        public Builder withCity(String city) {
            this.city = city;
            return this;
        }

        public Address now() {
            return new Address(country, state, city);
        }
    }
}