package com.bridgelabz.jsondatahandling.handonproblems;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

import java.io.File;
import java.io.IOException;

public class ValidateEmail {
    public static void main(String[] args) throws IOException, ProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode schemaNode = objectMapper.readTree(new File("schema.json"));
        JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
        JsonSchema schema = factory.getJsonSchema(schemaNode);

        JsonNode jsonData = objectMapper.readTree(new File("user.json"));

        if (schema.validate(jsonData).isSuccess()) {
            System.out.println("Email JSON is valid!");
        } else {
            System.out.println("Email JSON is invalid!");
        }
    }
}
