package homework.hw_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapInList {
    public List<Map.Entry<String, Integer>> listWords(Map<String, Integer> map) {
        return new ArrayList<>(map.entrySet());

        /*верх и низ взаимозаменяемы*/

//        return map.entrySet().
//                stream().
//                collect(Collectors.toList());
    }

}
