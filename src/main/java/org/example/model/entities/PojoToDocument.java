package org.example.model.entities;

import org.bson.Document;
import org.bson.types.ObjectId;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PojoToDocument {

    public static List<Document> parse(List<Object> o) {

        return o.stream().map(PojoToDocument::parse).collect(Collectors.toList());
    }

    public static Document parse(Object o) {

        Document document = new Document();
        Field[] fields = o.getClass().getDeclaredFields();

        Arrays.stream(fields).forEach(
                f -> {

                    try {
                        f.setAccessible(true);
                        List<Object> struct = new ArrayList<>();
                        Object value = f.get(o);

                        if (value instanceof List<?>) {

                            ((List<?>) value).forEach(
                                    v -> {
                                        if (v instanceof ObjectId) {
                                            struct.add(v);
                                        } else {
                                            struct.add(parse(v));
                                        }

                                    }
                            );

                            document.put(f.getName().toLowerCase(), struct);

                        } else {

                            document.put(f.getName().toLowerCase(), f.get(o));
                        }


                    } catch (Exception e) {

                        System.out.printf("Error: %s\n", e);
                    }
                }
        );

        return document;
    }
}
