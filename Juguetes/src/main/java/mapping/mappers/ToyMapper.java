package mapping.mappers;

import dtos.Toysdto;
import model.Toys;

public class ToyMapper {
    public static Toys mapFrom(Toysdto dto){
        return new Toys(dto.name(), dto.amount(), dto.price(), dto.category());
    }
    public static Toysdto mapFrom(Toys model){
        return new Toysdto(model.getName(), model.getAmount(), model.getPrice(), model.getToyCategory());
    }
}
