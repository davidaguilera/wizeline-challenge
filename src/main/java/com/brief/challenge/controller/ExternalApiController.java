package com.brief.challenge.controller;

import com.brief.challenge.service.GasolineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.brief.challenge.constant.Routes.*;


@RequestMapping(PATH)
@RestController
public class ExternalApiController {

    @Autowired
    private GasolineService gasolineService;

    @GetMapping(GAS_STATIONS)
    public int getGasStationsNumber(){
       return gasolineService.getGas().getPagination().getTotal();
    }

    @GetMapping(GAS_STATIONS + "{station}")
    public String getGasStation(@PathVariable int station) {
        return gasolineService.getGasStation(station).toString();
    }

    @GetMapping(GET_MEAN_PRICE + "{quality}")
    public double getMeanPrice(@PathVariable(value = "quality", required = false) boolean quality) {
        return quality ?
                gasolineService.getMeanPrice(true) :
                gasolineService.getMeanPrice(false);
    }

    @GetMapping(POSTAL_CODE + "{postalCode}")
    public String getGasStationPostalCode(@PathVariable String postalCode) {
        return gasolineService.getGasStationPostalCode(postalCode).toString();
    }


}
