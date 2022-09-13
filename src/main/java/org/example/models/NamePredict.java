package org.example.models;

public class NamePredict {
    private String gender;
    private String name;
    private Double probability;

    public NamePredict(String gender, String name, Double probability) {
        this.gender = gender;
        this.name = name;
        this.probability = probability;
    }

    public NamePredict() {
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getProbability() {
        return probability;
    }

    public void setProbability(Double probability) {
        this.probability = probability;
    }

    @Override
    public String toString() {
        return "NamePredict{" +
                "gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", probability='" + probability + '\'' +
                '}';
    }
}
