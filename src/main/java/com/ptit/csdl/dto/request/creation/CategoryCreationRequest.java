package com.ptit.csdl.dto.request.creation;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CategoryCreationRequest {
    @JsonProperty("category_name")
    String categoryName;
    @JsonProperty("description")
    String description;
    @JsonProperty("tag")
    String tag;
    @JsonProperty("product_id")
    Set<Long> productId;
}
