package xyz.clzly.service;

import xyz.clzly.service.impl.Bird;
import xyz.clzly.service.impl.Snake;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by  君匡on 2021/7/9 10:28
 */
public class KeenAnimalService {
    public    void move(List<Animal> list){
        for(Animal a : list){
            a.move();
        }
    }
    
    public  void Do() {
        List<Animal> list = new ArrayList<Animal>();
        list.add(new Bird());
        list.add(new Snake());
        move(list);
    }
    

}
