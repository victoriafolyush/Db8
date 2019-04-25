package ua.lviv.iot.Db_Lab8.managers;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ua.lviv.iot.Db_Lab8.models.Fuel;
import ua.lviv.iot.Db_Lab8.models.WheelFormula;

@SpringBootApplication
public class DbLab8Application {

    public static void main(String[] args) {
        SpringApplication.run(DbLab8Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(SkiResortMachineryRepository repository) {
        System.out.println("vassa");
        return (args) -> {
            repository.save(new SkiResortMachinery("Name1", "Producer", 15.6, 41.6, Fuel.DIESEL, WheelFormula.FOUR_FOUR ));
            repository.save(new SkiResortMachinery("Name2", "Producer", 25.6, 42.6, Fuel.KEROSENE, WheelFormula.FOUR_TWO ));
            repository.save(new SkiResortMachinery("Name3", "Producer", 35.6, 43.6, Fuel.GAZOLINE, WheelFormula.TWO_TWO ));

            repository.findAll().forEach(System.out::println);
        };
        

    }

}
