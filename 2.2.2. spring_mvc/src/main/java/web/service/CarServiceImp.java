package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class CarServiceImp implements CarService{
    private List<Car> carList = new ArrayList<>();

    {
        Collections.addAll(carList,
                new Car("Mercedes Benz", "Gelendwagen", 2018),
                new Car("Lada", "2014", 2006),
                new Car("Chevrolet", "Lanos", 2008),
                new Car("Toyota", "Sekvoya", 2020),
                new Car("Jeep", "Cherokee", 2017));
    }

    @Override
    public List<Car> getCars(int count) {
        return (count >= 5) ? carList : carList.subList(0, count);
    }
}