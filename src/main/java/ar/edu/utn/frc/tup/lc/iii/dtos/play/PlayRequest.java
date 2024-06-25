package ar.edu.utn.frc.tup.lc.iii.dtos.play;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({
        @JsonSubTypes.Type(value = PlayRpsDTO.class)
})
public interface PlayRequest {
}
