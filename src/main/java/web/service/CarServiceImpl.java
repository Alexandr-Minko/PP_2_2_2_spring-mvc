package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private List<Car> carList;

    public CarServiceImpl() {
        carList = new ArrayList<>();
        carList.add(new Car(1,"Audi", "A7"));
        carList.add(new Car(2,"VAZ", "2110"));
        carList.add(new Car(3,"Kia", "Rio"));
        carList.add(new Car(4,"Opel", "Astra"));
        carList.add(new Car(5,"BMW", "X5"));
    }

    @Override
    public List<Car> index(int counter) {
        if (counter >= 5) {
            return carList;
        } else {
            return carList.subList(0, counter);
        }

    }

}
