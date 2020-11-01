package com.brief.challenge.service;

import com.brief.challenge.factory.RestTemplateFactory;
import com.brief.challenge.model.Gas;
import com.brief.challenge.model.Station;
import lombok.var;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import static com.brief.challenge.constant.Routes.GAS;

@Service
public class GasolineService {

    public Gas getGas() {
        ResponseEntity<Gas> response = RestTemplateFactory.getRestTemplate().getForEntity(GAS, Gas.class);
        return  response.getBody();
    }

    public Station getGasStation(int station) {
        return getGas().getResults().get(station);
    }

    public double getMeanPrice(boolean isPremium) {
        return isPremium ?
            getGas().getResults().stream().mapToDouble(station -> station.getPremium()).sum() /
                    getGas().getResults().stream().count() :
            getGas().getResults().stream().mapToDouble(station -> station.getRegular()).sum() /
                    getGas().getResults().stream().count();
    }

    public String getGasStationPostalCode(String postalCode) {
        var station = getGas().
                getResults().
                stream().
                filter(s -> s.getCodigopostal().equals(postalCode)).
                findAny().
                orElse( new Station());
        return station.getCodigopostal() == null ? "Not Found" : station.toString();
    }
}
