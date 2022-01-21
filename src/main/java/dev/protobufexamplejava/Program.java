package dev.protobufexamplejava;


import dev.protobufexamplejava.contracts.Customer;

import java.io.FileOutputStream;
import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
//Serializar  Arquivo PROTO
        String fullPath = "/C:/TesteProtoBuf/protobuf-customer";

        FileOutputStream fos = new FileOutputStream(fullPath);
        Customer msg = Customer.newBuilder()
                .setName("Gustavo")
                .setIdade("28")
                .setProfi("QA")
                .build();

        msg.writeTo(fos);
        System.out.println(msg);


//Desserializar Arquivo PROTO
        //MyClassCollection MyObjects = MyClassCollection.parseFrom(http_input_stream);

    }


}
