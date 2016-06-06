package es.upm.oeg.farolapi.model;

import lombok.Data;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;

/**
 * Created on 23/05/16:
 *
 * @author cbadenes
 */
@Data
@ToString (callSuper = true)
public class ColorAttribute extends Attribute {

    @Override
    public List<String> getRange() {
        return Arrays.asList(new String[]{"red", "orange", "yellow", "white", "green", "blue"});
    }
}
