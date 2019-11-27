package com.jproject.navergeo;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

public class JavaJsonTest {
    public static void main(String[] args) {
        JSONObject student = new JSONObject();
        student.put("name", "전현준");
        student.put("age", 28);
        student.put("phone", "010-0000-0000");
        student.put("gender", "M");

        JSONObject student2 = new JSONObject();
        student2.put("name", "전현준2");
        student2.put("age", 29);
        student2.put("phone", "010-0000-0002");
        student2.put("gender", "F");

        JSONArray arr = new JSONArray();
        arr.put(student); arr.put(student2);
        System.out.println(arr);

        JSONObject obj = new JSONObject();
        obj.put("students", arr); // 실제론 이렇게 내보내야 관리하기 편함~{ "" : [] }
        System.out.println(obj);

        List<Object> objects = arr.toList();
        objects.forEach(System.out::println);

    }
}
