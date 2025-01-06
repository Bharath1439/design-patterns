package com.example.design_patterns;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmbeddingInsertion implements Serializable {

    private static final long serialVersionUID = 1L;

    // Fields for the embedding insertion model
    private String combinedFields;  // Text input to be embedded
    private String apiKey;          // API key for authorization
    private String embeddingModel;  // Model name (e.g., "text-embedding-ada-002")
}

