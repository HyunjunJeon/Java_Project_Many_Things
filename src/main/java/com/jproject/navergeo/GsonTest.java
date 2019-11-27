package com.jproject.navergeo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jproject.navergeo.BookDTO;

import java.util.ArrayList;
import java.util.List;

public class GsonTest {
    public static void main( String[] args ) {
        Gson g = new Gson();
        String json = g.toJson(new BookDTO("자바", 20000, "책 내용이다~"));
        System.out.println(json);

        BookDTO bookDTO = g.fromJson(json, BookDTO.class);
        System.out.println(bookDTO);

        List<BookDTO> list = new ArrayList<>();
        list.add(new BookDTO("자바1", 20000, "책 내용이다~1"));
        list.add(new BookDTO("자바2", 30000, "책 내용이다~2"));
        list.add(new BookDTO("자바3", 40000, "책 내용이다~3"));

        String listJson = g.toJson(list);
        System.out.println(listJson);

        // Json(String) -> Object(List<BookDTO>) 로 바꾸기 위해서는 TypeToken을 사용해야함
        List<BookDTO> list2 = g.fromJson(listJson, new TypeToken<List<BookDTO>>() {}.getType());
        list2.forEach(System.out::println);

    }
}
