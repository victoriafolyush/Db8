package ua.lviv.iot.Db_Lab8.managers;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import ua.lviv.iot.Db_Lab8.models.Fuel;
import ua.lviv.iot.Db_Lab8.models.WheelFormula;

@Entity
class SkiResortMachinery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String producer;
    private double fuelPerHour;
    private double mileage;
    private Fuel typeOfFuel;
    private WheelFormula wheelFormula;

    public SkiResortMachinery() {

    }

    public SkiResortMachinery(String name, String producer, double fuelPerHour, double mileage, Fuel typeOfFuel,
            WheelFormula wheelFormula) {
        super();
        this.name = name;
        this.producer = producer;
        this.fuelPerHour = fuelPerHour;
        this.mileage = mileage;
        this.typeOfFuel = typeOfFuel;
        this.wheelFormula = wheelFormula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getFuelPerHour() {
        return fuelPerHour;
    }

    public void setFuelPerHour(double fuelPerHour) {
        this.fuelPerHour = fuelPerHour;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public Fuel getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(Fuel typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public WheelFormula getWheelFormula() {
        return wheelFormula;
    }

    public void setWheelFormula(WheelFormula wheelFormula) {
        this.wheelFormula = wheelFormula;
    }

    @Override
    public String toString() {
        return "SkiResortMachinery [name=" + name + ", producer=" + producer + ", fuelPerHour=" + fuelPerHour
                + ", mileage=" + mileage + ", typeOfFuel=" + typeOfFuel + ", wheelFormula=" + wheelFormula + "]";
    }

}
