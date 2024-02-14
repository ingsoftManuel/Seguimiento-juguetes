package services;

import dtos.Toysdto;
import model.Toys;

import java.util.List;


public interface ToyService {
    List<Toysdto> addToys(Toysdto toys) throws Exception;
    List<Toysdto> listToys();
boolean verifyContactExists(String name);
}