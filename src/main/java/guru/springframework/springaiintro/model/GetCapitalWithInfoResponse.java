package guru.springframework.springaiintro.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record GetCapitalWithInfoResponse(@JsonProperty("The name of the city") String city,
                                         @JsonProperty("The population of the city") Integer population,
                                         @JsonProperty("The region the city is located in") String region,
                                         @JsonProperty("The primary language spoken") String language,
                                         @JsonProperty("The currency used") String currency) {

}
