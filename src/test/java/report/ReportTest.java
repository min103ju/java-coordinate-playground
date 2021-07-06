package report;

import car.Avante;
import car.K5;
import car.Sonata;
import company.RentCompany;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReportTest {

    @Test
    void report() {
        // given
        RentCompany rentCompany = new RentCompany();
        rentCompany.addCar(new Sonata(100));
        rentCompany.addCar(new Avante(150));
        rentCompany.addCar(new K5(130));

        // when
        String report = rentCompany.generateReport();

        // then
        assertThat(report).isEqualTo(
                "Sonata : 10.0리터\n" +
                "Avante : 10.0리터\n" +
                "K5 : 10.0리터"
        );
    }
}
